package steps;

import org.junit.Test;
import pages.AuthenticationPage;
import util.Browser;

public class AuthenticationSteps extends Browser {

    IndexSteps indexSteps = new IndexSteps();

    AuthenticationPage authenticationPage = new AuthenticationPage();

    @Test
    public void criarUmaContaComSucesso() {

        indexSteps.acessarPaginaAuthenticationComSucesso();

        authenticationPage.preencherEmailCreate();
        authenticationPage.clicarBtnCreateAccount();
    }

    @Test
    public void fazerLogginComSucesso() {

        indexSteps.acessarPaginaAuthenticationComSucesso();

        authenticationPage.preencherEmailLogin();
        authenticationPage.preencherPasswordLogin();
        authenticationPage.clicarBtnSignIn();
    }



}
