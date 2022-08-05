package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import util.BaseTest;

public class ContactPage {

    Faker faker = new Faker();
    String email = faker.internet().emailAddress();
    String arquivo = faker.internet().image();

    //==================================================================================================================
    //                                            DECLARAÇÃO DOS CAMPOS
    //==================================================================================================================

    // CUSTOMER SERVICE - CONTACT US
    // SEND A MESSAGE

    public static final By subjectContactField = By.cssSelector("#contact");
    public static final By filledSubjectContactField = By.cssSelector("#id_contact > option:nth-child(2)");

    public static final By emailField = By.cssSelector("#email");

    public static final By orderReferenceField = By.cssSelector("#id_order");

    public static final By attachFileField = By.cssSelector("#uniform-fileUpload > span.filename");

    public static final By chooseFileBtn = By.cssSelector("#uniform-fileUpload > span.action");

    public static final By messageField = By.cssSelector("#message");

    public static final By sendBtn = By.cssSelector("#submitMessage > span");


    //==================================================================================================================
    //                                                 MÉTODOS
    //==================================================================================================================

    public void clicarsubjectContactField() {
        BaseTest.click(subjectContactField);
        BaseTest.click(filledSubjectContactField);
    }

    public void preencherEmailField() {
        BaseTest.sendKeys(emailField, email);
    }

    public void preencherOrderReferenceField() {
        BaseTest.sendKeys(orderReferenceField, "1234567");
    }

    /*===================================================

    public void clicarAttachFileField() {
        BaseTest.
        //BaseTest.sendKeys(attachFileField, "foto.jpg");

    }

    public void clicarChooseFileBtn() {
        BaseTest.clear(chooseFileBtn);
        BaseTest.sendKeys(chooseFileBtn, "foto.jpg");

    }

    //===================================================*/

    public void preencherMessageField() {
        BaseTest.sendKeys(messageField, "Esta é uma mensagem sobre minha compra");
    }

    public void clicarSendBtn() {
        BaseTest.click(sendBtn);
    }

}
