package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class LoginPage {

    public static final By username = By.cssSelector("#Username");
    public static final By password = By.cssSelector("#Password");
    public static final By submitLoginBtn = By.cssSelector("body > div > div:nth-child(4) > form > table > tbody > tr:nth-child(7) > td:nth-child(2) > input.btn.btn-primary");

    public void preencherUsername(){ BaseTest.sendKeys(username, "coraline");}

    public void preencherPassword(){
        BaseTest.sendKeys(password, "123");
    }

    public void clicarSubmitLoginBtn() {BaseTest.click(submitLoginBtn);}

}
