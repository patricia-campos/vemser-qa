package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import util.BaseTest;

public class AccountCreationPage {

    //Faker faker = new Faker();
    //String email = faker.internet().emailAddress();

    // TODO - VALIDAÇÃO
    // public static final By msgSucessRegistration = By.cssSelector("#center_column > p");


    //==================================================================================================================
    //                                            DECLARAÇÃO DOS CAMPOS
    //==================================================================================================================

    // PERSONAL INFORMATION

    public static final By idGenderRadio = By.cssSelector("#id_gender2");

    public static final By firstNameField = By.cssSelector("#customer_firstname");

    public static final By lastNameField = By.cssSelector("#customer_lastname");

    public static final By emailField = By.cssSelector("#email");

    public static final By passwordField = By.cssSelector("#passwd");

    public static final By dayField = By.cssSelector("#days");
    public static final By filledDayField = By.cssSelector("#days > option:nth-child(20)");

    public static final By monthField = By.cssSelector("#months");
    public static final By filledMonthField = By.cssSelector("#months > option:nth-child(6)");

    public static final By yearField = By.cssSelector("#years");
    public static final By filledYearField = By.cssSelector("#years > option:nth-child(36)");


    public static final By newsletterCheckbox = By.cssSelector("#newsletter");

    public static final By optinCheckbox = By.cssSelector("#optin");

    //------------------------------------------------------------------------------------------------------------------

    // YOUR ADDRESS

    public static final By firstNameAddressField = By.cssSelector("#firstname");

    public static final By lastNameAddressField = By.cssSelector("#lastname");

    public static final By companyField = By.cssSelector("#company");

    public static final By address1Field = By.cssSelector("#address1");

    public static final By address2Field = By.cssSelector("#address2");

    public static final By cityField = By.cssSelector("#city");

    public static final By stateField = By.cssSelector("#id_state");
    public static final By filledStateField = By.cssSelector("#id_state > option:nth-child(6)");

    public static final By postalCodeField = By.cssSelector("#postcode");

    public static final By countryField = By.cssSelector("#id_country");
    public static final By filledCountryField = By.cssSelector("#id_country > option:nth-child(2)");

    public static final By additionalInformationField = By.cssSelector("#other");

    public static final By homePhoneField = By.cssSelector("#phone");

    public static final By mobilePhoneField = By.cssSelector("#phone_mobile");

    public static final By addressAliasField = By.cssSelector("#alias");

    //------------------------------------------------------------------------------------------------------------------

    // REGISTER BUTTON

    public static final By registerBtn = By.cssSelector("#submitAccount > span");


    //==================================================================================================================
    //                                                 MÉTODOS
    //==================================================================================================================

    // PERSONAL INFORMATION

    public void clicarIdGenderRadio() {
        BaseTest.click(idGenderRadio);
    }

    public void preencherFirstNameField() {
        BaseTest.sendKeys(firstNameField, "Coraline");
    }

    public void preencherLastNameField() {
        BaseTest.sendKeys(lastNameField, "Jones");
    }

    public void preencherEmailField() {
        BaseTest.clear(emailField);
        BaseTest.sendKeys(emailField, "coraline@coraline.com");
    }

    public void preencherPasswordField() {
        BaseTest.sendKeys(passwordField, "12345");
    }

    public void clicarDayField() {
        BaseTest.click(dayField);
        BaseTest.click(filledDayField);
    }

    public void clicarMonthField() {
        BaseTest.click(monthField);
        BaseTest.click(filledMonthField);
    }

    public void clicarYearField() {
        BaseTest.click(yearField);
        BaseTest.click(filledYearField);
    }

    public void clicarNewsletterCheckbox() {
        BaseTest.click(newsletterCheckbox);
    }

    public void clicarOptinCheckbox() {
        BaseTest.click(optinCheckbox);
    }

    //------------------------------------------------------------------------------------------------------------------

    // YOUR ADDRESS

    public void preencherFirstNameAddressField() {
        BaseTest.sendKeys(firstNameAddressField, "Neil G");
    }

    public void preencherLastNameAddressField() {
        BaseTest.sendKeys(lastNameAddressField, "Street");
    }

    public void preencherCompanyField() {
        BaseTest.sendKeys(companyField, "Neil Gaiman Books");
    }

    public void preencherAddress1Field() {
        BaseTest.sendKeys(address1Field, "Neil Gaiman Street");
    }

    public void preencherAddress2Field() {
        BaseTest.sendKeys(address2Field, "110");
    }

    public void preencherCityField() {
        BaseTest.sendKeys(cityField, "Los Angeles");
    }

    public void clicarStateField() {
        BaseTest.click(stateField);
        BaseTest.click(filledStateField);
    }

    public void preencherPostalCodeField() {
        BaseTest.sendKeys(postalCodeField, "12345");
    }

    public void clicarCountryField() {
        BaseTest.click(countryField);
        BaseTest.click(filledCountryField);
    }

    public void preencherAdditionalInformationField() {
        BaseTest.sendKeys(additionalInformationField, "Btn eyes");
    }

    public void preencherHomePhoneField() {
        BaseTest.sendKeys(homePhoneField, "05134698697");
    }

    public void preencherMobilePhoneField() {
        BaseTest.sendKeys(mobilePhoneField, "051994698787");
    }

    public void preencherAddressAliasField() {
        BaseTest.sendKeys(addressAliasField, "Casa");
    }

    //------------------------------------------------------------------------------------------------------------------

    // REGISTER BUTTON

    public void clicarRegisterBtn() {
        BaseTest.click(registerBtn);
    }

    // TODO - VALIDAÇÃO
    // public String validarMensagem() {
    //    return BaseTest.getText(msgSucessRegistration);
    // }
}
