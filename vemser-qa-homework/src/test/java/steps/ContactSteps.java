package steps;

import org.junit.Test;
import pages.ContactPage;
import util.Browser;

public class ContactSteps extends Browser {

    IndexSteps indexSteps = new IndexSteps();

    ContactPage contactPage = new ContactPage();

    @Test
    public void enviarContatoComSucesso() {

        indexSteps.acessarPaginaContactUsComSucesso();

        contactPage.clicarsubjectContactField();
        contactPage.preencherEmailField();
        contactPage.preencherOrderReferenceField();
       /*
        contactPage.clicarAttachFileField();
        contactPage.clicarChooseFileBtn();
        */

        contactPage.preencherMessageField();
        contactPage.clicarSendBtn();

    }

}
