package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class BlousePage {

    //==================================================================================================================
    //                                            DECLARAÇÃO DOS CAMPOS
    //==================================================================================================================

    //Add ao carrinho

    public static final By btnAddBlouse = By.cssSelector("#add_to_cart > button");

    public static final By msgSucessRegistration = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2");



    //public static final By btnCheckout = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");


    //==================================================================================================================
    //                                                 MÉTODOS
    //==================================================================================================================

    //Adicionar ao carrinho
    public void clicarAdicionarProduto() {
        BaseTest.click(btnAddBlouse);}

    public String validarMsgm() {
        return BaseTest.getText(msgSucessRegistration);
    }

/*
    public void clicarProceedCheckout() {
        BaseTest.click(btnCheckout);}

*/
}


