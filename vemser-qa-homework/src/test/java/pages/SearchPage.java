package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class SearchPage {
    //==================================================================================================================
    //                                            DECLARAÇÃO DOS CAMPOS
    //==================================================================================================================

    //Selecionar produto que foi buscado para comprar através da busca

    public static final By overProduct = By.cssSelector("#center_column > ul > li > div > div.right-block > h5 > a");
    //public static final By btnAddToCart = By.cssSelector("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");



    //==================================================================================================================
    //                                                 MÉTODOS
    //==================================================================================================================

    //Adicionar ao carrinho
    public void passarMouseSobreProduto() {BaseTest.click(overProduct);}
    //public void clicarBtnAddToCart() {
   //     BaseTest.click(btnAddToCart);
   // }

}
