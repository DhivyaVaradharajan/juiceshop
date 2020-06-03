package com.qa.bootcamp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManagerFactory {
    public static WebDriver getManager(DriverType type) {
            switch (type) {
                case IE:
                    WebDriverManager.iedriver().setup();
                    return new InternetExplorerDriver();
                case EDGE:
                    WebDriverManager.edgedriver().setup();
                    return new EdgeDriver();
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    return new FirefoxDriver();
                case REMOTE:
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("browserName", "chrome");
                    try {
                        return new RemoteWebDriver(new URL("http://hub.com:4444/wd/hub"),
                            capabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                default:
                    WebDriverManager.chromedriver().setup();
                    return new ChromeDriver();
        }
    }

}
