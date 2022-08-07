package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import util.BaseTest;

public class AuthenticationPage {

    // public static final By msgSucessRegistration = By.cssSelector("#my-account");

    //==================================================================================================================
    //                                            DECLARAÇÃO DOS CAMPOS
    //==================================================================================================================

    //Criar nova conta
    public static final By emailCreateField = By.cssSelector("#email_create");
    public static final By btnCreateAnAccount = By.cssSelector("#SubmitCreate > span");

    //Fazer login em conta existente
    public static final By emailLoginField = By.cssSelector("#email");
    public static final By passwordLoginField = By.cssSelector("#passwd");
    public static final By btnSignIn = By.cssSelector("#SubmitLogin > span");


    //==================================================================================================================
    //                                                 MÉTODOS
    //==================================================================================================================

    //Criar nova conta
    public void preencherEmailCreate() {
        BaseTest.sendKeys(emailCreateField, "coraline@coraline.com");}

    public void clicarBtnCreateAccount() {
        BaseTest.click(btnCreateAnAccount);
    }

    //Fazer login em conta existente
    public void preencherEmailLogin() {BaseTest.sendKeys(emailLoginField, "coraline@coraline.com");}
    public void preencherPasswordLogin() {BaseTest.sendKeys(passwordLoginField, "12345");}
    public void clicarBtnSignIn() {
        BaseTest.click(btnSignIn);
    }



    //public String validarEmail() {return BaseTest.getText(msgSucessRegistration);}


}
