package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class EditPage {

    public static final By editBtn = By.cssSelector("body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(7) > a.btn.btn-outline-primary");

    public static final By name = By.cssSelector("#Name");
    public static final By company = By.cssSelector("#Company");
    public static final By adress = By.cssSelector("#Address");
    public static final By city = By.cssSelector("#City");
    public static final By phone = By.cssSelector("#Phone");
    public static final By email = By.cssSelector("#Email");
    public static final By submitSaveBtn = By.cssSelector("body > div > form > div > div:nth-child(10) > div > input");

    public void clicarEditBtn(){BaseTest.click(editBtn);}

    public void preencherName(){ BaseTest.sendKeys(name, "Alguém");}

    public void preencherCompany(){
        BaseTest.sendKeys(company, "NG Books");
    }

    public void preencherAdress(){
        BaseTest.sendKeys(adress, "NG Street");
    }

    public void preencherCity(){
        BaseTest.sendKeys(city, "New Jersey");
    }

    public void preencherPhone(){ BaseTest.sendKeys(phone, "111222333");}

    public void preencherEmail(){
        BaseTest.sendKeys(email, "alguem@alguem");
    }

    public void clicarSubmitSaveBtn() {BaseTest.click(submitSaveBtn);}

}
