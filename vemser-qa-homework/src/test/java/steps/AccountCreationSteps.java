package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.AccountCreationPage;
import util.Browser;

public class AccountCreationSteps extends Browser {

    IndexSteps indexSteps = new IndexSteps();

    AuthenticationSteps authenticationSteps = new AuthenticationSteps();

    AccountCreationPage accountCreationPage = new AccountCreationPage();

    @Test
    public void cadastrarUsuarioComSucesso() {

        indexSteps.acessarPaginaAuthenticationComSucesso();
        authenticationSteps.criarUmaContaComSucesso();

        accountCreationPage.clicarIdGenderRadio();
        accountCreationPage.preencherFirstNameField();
        accountCreationPage.preencherLastNameField();
        accountCreationPage.preencherEmailField();
        accountCreationPage.preencherPasswordField();
        accountCreationPage.clicarDayField();
        accountCreationPage.clicarMonthField();
        accountCreationPage.clicarYearField();
        accountCreationPage.clicarNewsletterCheckbox();
        accountCreationPage.clicarOptinCheckbox();

        accountCreationPage.preencherFirstNameAddressField();
        accountCreationPage.preencherLastNameAddressField();
        accountCreationPage.preencherCompanyField();
        accountCreationPage.preencherAddress1Field();
        accountCreationPage.preencherAddress2Field();
        accountCreationPage.preencherCityField();
        accountCreationPage.clicarStateField();
        accountCreationPage.preencherPostalCodeField();
        accountCreationPage.clicarCountryField();
        accountCreationPage.preencherAdditionalInformationField();
        accountCreationPage.preencherHomePhoneField();
        accountCreationPage.preencherMobilePhoneField();
        accountCreationPage.preencherAddressAliasField();

        accountCreationPage.clicarRegisterBtn();

        // TODO - VALIDAÇÃO
        // Assert.assertEquals(accountCreationPage.validarMensagem(), "Welcome to your account. Here you can manage all of your personal information and orders.");
    }
}
