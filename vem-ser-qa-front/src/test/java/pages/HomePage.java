package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class HomePage {

    public static final By btnLogin = By.cssSelector("#navbarColor01 > form > ul > li:nth-child(2) > a");

    public void clicarBtnLogin(){
        BaseTest.click(btnLogin);
    }

}
