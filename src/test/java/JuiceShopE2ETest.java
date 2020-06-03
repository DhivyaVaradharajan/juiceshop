import com.qa.bootcamp.builder.NewCustomer;
import com.qa.bootcamp.utils.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;


public class JuiceShopE2ETest extends BaseTest {


    @Test
    public void registerTest() {
        getDriver().get("https://juice-shop.herokuapp.com/#/register");
        home().skipBanner();
        NewCustomer registeredUser = customerCan().register();
        login().withValidCredentials(registeredUser);
        assertThat(home().isLoggedIn()).isTrue();
    }
}
