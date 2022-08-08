package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class SignUpPage {

    public static final By btnSignUp = By.cssSelector("#navbarColor01 > form >ul > li:nth-child(1) > a");

    public static final By firstName = By.cssSelector("#FirstName");
    public static final By surName = By.cssSelector("#Surname");
    public static final By epostName = By.cssSelector("#E_post");
    public static final By mobileName = By.cssSelector("#Mobile");
    public static final By userName = By.cssSelector("#Username");
    public static final By password = By.cssSelector("#Password");
    public static final By confirmPassword = By.cssSelector("#ConfirmPassword");
    public static final By submitBtn = By.cssSelector("#submit");

    public static final By msgSucessRegistration = By.cssSelector("#header_container > div.header_secondary_container > span");


    public void clicarBtnSignUp(){
        BaseTest.click(btnSignUp);
    }

    public void preencherFirstName(){
        BaseTest.sendKeys(firstName, "Coraline");
    }

    public void preencherSurName(){
        BaseTest.sendKeys(surName, "Jones");
    }

    public void preencherEpostName(){
        BaseTest.sendKeys(epostName, "123");
    }

    public void preencherMobileName(){
        BaseTest.sendKeys(mobileName, "coraline");
    }

    public void preencherUserName(){
        BaseTest.sendKeys(userName, "coraline");
    }

    public void preencherPassword(){
        BaseTest.sendKeys(password, "123");
    }

    public void preencherConfirmPassword(){
        BaseTest.sendKeys(confirmPassword, "123");
    }

    public void clicarSubmit() {
        BaseTest.click(submitBtn);
    }

    public String validarMsgm() {
        return BaseTest.getText(msgSucessRegistration);
    }


}
