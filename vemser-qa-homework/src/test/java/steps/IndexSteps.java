package steps;

import org.junit.Test;
import pages.IndexPage;
import util.Browser;

public class IndexSteps extends Browser {

    IndexPage indexPage = new IndexPage();

    @Test
    public void acessarPaginaAuthenticationComSucesso() {

        indexPage.clicarBtnSignIn();
    }

    @Test
    public void acessarPaginaContactUsComSucesso() {

        indexPage.clicarBtnContactUs();
    }

    @Test
    public void buscarItemNaIndexComSucesso() {
        indexPage.preencherSearchField();
        indexPage.clicarBtnSearch();
    }

}