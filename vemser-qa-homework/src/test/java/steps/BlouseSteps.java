package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.BlousePage;
import util.Browser;

public class BlouseSteps extends Browser {

    BlousePage blousePage = new BlousePage();

    @Test
    public void inserirBlouseComSucesso() {

        blousePage.clicarAdicionarProduto();
        Assert.assertEquals(blousePage.validarMsgm(), "Product successfully added to your shopping cart");
    }


/*
    @Test
    public void proceedCheckout() {
        blousePage.clicarProceedCheckout();
    }
*/
}
