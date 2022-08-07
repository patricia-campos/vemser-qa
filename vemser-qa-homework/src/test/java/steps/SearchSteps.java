package steps;

import org.junit.Test;
import pages.SearchPage;
import util.Browser;

public class SearchSteps extends Browser {

    SearchPage searchPage = new SearchPage();

    @Test
    public void inserirItemComSucesso() {

        searchPage.passarMouseSobreProduto();
        //searchPage.clicarBtnAddToCart();
    }

}
