package steps;

import org.junit.Test;
import pages.BlousePage;
import pages.SearchPage;
import util.Browser;

public class ShoppingCartSteps extends Browser {

    IndexSteps indexSteps = new IndexSteps();
    AuthenticationSteps authenticationSteps = new AuthenticationSteps();
    SearchSteps searchSteps = new SearchSteps();
    BlouseSteps blouseSteps = new BlouseSteps();



    @Test
    public void AdicionarBlusaCarrinhoComSucesso() {

        authenticationSteps.fazerLogginComSucesso();

        indexSteps.buscarItemNaIndexComSucesso();
        searchSteps.inserirItemComSucesso();
        blouseSteps.inserirBlouseComSucesso();

        //blouseSteps.proceedCheckout();

    }

}
