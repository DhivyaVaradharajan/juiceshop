import com.qa.bootcamp.builder.NewCustomer;
import com.qa.bootcamp.pageBeans.PageBeans;
import com.qa.bootcamp.utils.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;


public class JuiceShopE2ETest extends BaseTest {


    @Autowired
    private PageBeans user;

    @Test
    public void registerTest() {
        driver.get("https://juice-shop.herokuapp.com/#/register");
        user.home().skipBanner();
        NewCustomer registeredUser = user.can().register();
        user.login().withValidCredentials(registeredUser);
        assertThat(user.home().shouldBeLoggedIn()).isTrue();
    }
}
