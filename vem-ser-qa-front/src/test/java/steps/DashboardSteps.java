package steps;

import org.junit.Test;
import pages.*;
import util.Browser;

public class DashboardSteps extends Browser{

    HomePage homePage = new HomePage();

    DashboardPage dashboardPage = new DashboardPage();

    LoginPage loginPage = new LoginPage();

    CreatePage createPage = new CreatePage();

    EditPage editPage = new EditPage();

    DeletePage deletePage = new DeletePage();

    @Test
    public void criarClienteComSucesso() { //cenario

        //HOME
        homePage.clicarBtnLogin();

        //LOGIN
        loginPage.preencherUsername();
        loginPage.preencherPassword();
        loginPage.clicarSubmitLoginBtn();

        // CREATE
        createPage.clicarBtnCreateNew();
        createPage.preencherName();
        createPage.preencherCompany();
        createPage.preencherAdress();
        createPage.preencherCity();
        createPage.preencherPhone();
        createPage.preencherEmail();
        createPage.clicarSubmitCreateNewBtn();
        //validação
    }

    @Test
    public void buscarClienteCadastrado() {

        criarClienteComSucesso();

        //BUSCA
        dashboardPage.preencherSearch();
        dashboardPage.clicarSubmit();
    }

    @Test
    public void editarClienteCadastrado() {

        criarClienteComSucesso();

        editPage.clicarEditBtn();
        editPage.preencherName();
        editPage.preencherCompany();
        editPage.preencherAdress();
        editPage.preencherCity();
        editPage.preencherPhone();
        editPage.preencherEmail();

        //submit
        editPage.clicarSubmitSaveBtn();
    }

    @Test
    public void deletarCliente() {

        criarClienteComSucesso();

        buscarClienteCadastrado();

        deletePage.clicarDelete();
        deletePage.clicarSubmitDelete();

    }



















}
