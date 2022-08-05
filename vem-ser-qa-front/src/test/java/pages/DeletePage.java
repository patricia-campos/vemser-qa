package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class DeletePage {

    //dashboard
    public static final By deleteBtn = By.cssSelector("body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(7) > a.btn.btn-outline-danger");

    public static final By submitDeleteBtn = By.cssSelector("body > div > div > form > div > input");


    public void clicarDelete(){BaseTest.click(deleteBtn);}

    public void clicarSubmitDelete(){BaseTest.click(submitDeleteBtn);}
}
