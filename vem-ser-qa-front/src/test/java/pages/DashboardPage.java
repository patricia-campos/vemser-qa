package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class DashboardPage {

    public static final By search = By.cssSelector("#searching");
    public static final By submitSearchBtn = By.cssSelector("body > div > div > form > input.btn.btn-secondary.my-2.my-sm-0");

    public void preencherSearch() {BaseTest.sendKeys(search, "neha");}
    public void clicarSubmit(){BaseTest.click(submitSearchBtn);}

}
