package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class IndexPage {

    //==================================================================================================================
    //                                            DECLARAÇÃO DOS CAMPOS
    //==================================================================================================================

    //Cadastrar-se
    public static final By btnSignIn = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");

    //Contato
    public static final By btnContactUs = By.cssSelector("#contact-link > a");

    //Busca
    public static final By searchField = By.cssSelector("#search_query_top");
    public static final By btnSearch = By.cssSelector("#searchbox > button");

    //==================================================================================================================
    //                                                 MÉTODOS
    //==================================================================================================================

    //Cadastrar-se
    public void clicarBtnSignIn() {
        BaseTest.click(btnSignIn);
    }

    //Contato
    public void clicarBtnContactUs() {
        BaseTest.click(btnContactUs);
    }

    //Busca
    public void preencherSearchField(){BaseTest.sendKeys(searchField, "blouse");};
    public void clicarBtnSearch() {
        BaseTest.click(btnSearch);
    }




}
