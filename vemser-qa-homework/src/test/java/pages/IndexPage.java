package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class IndexPage {

    //==================================================================================================================
    //                                            DECLARAÇÃO DOS CAMPOS
    //==================================================================================================================

    public static final By btnSignIn = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");

    public static final By btnContactUs = By.cssSelector("#contact-link > a");

    //==================================================================================================================
    //                                                 MÉTODOS
    //==================================================================================================================


    public void clicarBtnSignIn() {
        BaseTest.click(btnSignIn);
    }

    public void clicarBtnContactUs() {
        BaseTest.click(btnContactUs);
    }



}
