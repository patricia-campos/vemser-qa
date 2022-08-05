package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class SearchPage {
    //==================================================================================================================
    //                                            DECLARAÇÃO DOS CAMPOS
    //==================================================================================================================

    //Selecionar produto que foi buscado para comprar através da busca
    public static final By btnAddToCart = By.cssSelector("#search");


    //==================================================================================================================
    //                                                 MÉTODOS
    //==================================================================================================================

    //Adicionar ao carrinho
    public void clicarBtnAddToCart() {
        BaseTest.click(btnAddToCart);
    }

}
