package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.SignUpPage;
import util.Browser;

public class SignUpSteps extends Browser {

    SignUpPage signUpPage = new SignUpPage();

    @Test
    public void cadastrarUsuarioComSucesso() { //cenario

        signUpPage.clicarBtnSignUp();
        signUpPage.preencherFirstName();
        signUpPage.preencherSurName();
        signUpPage.preencherEpostName();
        signUpPage.preencherMobileName();
        signUpPage.preencherUserName();
        signUpPage.preencherPassword();
        signUpPage.preencherConfirmPassword();

        //submit
        signUpPage.clicarSubmit();

        //valida
        Assert.assertEquals(signUpPage.validarMsgm(), "Registration Successful");
    }




}
