package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import util.BaseTest;

public class AuthenticationPage {

    Faker faker = new Faker();
    String email = faker.internet().emailAddress();

    //==================================================================================================================
    //                                            DECLARAÇÃO DOS CAMPOS
    //==================================================================================================================

    public static final By emailCreateField = By.cssSelector("#email_create");

    public static final By btnCreateAnAccount = By.cssSelector("#SubmitCreate > span");


    //==================================================================================================================
    //                                                 MÉTODOS
    //==================================================================================================================

    public void preencherEmailCreate() {
        BaseTest.sendKeys(emailCreateField, email);
    }

    public void clicarBtnCreateAccount() {
        BaseTest.click(btnCreateAnAccount);
    }

}
