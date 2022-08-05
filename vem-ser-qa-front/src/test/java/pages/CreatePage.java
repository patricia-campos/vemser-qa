package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class CreatePage {

    public static final By btnCreateNew = By.cssSelector("body > div > div > p:nth-child(4) > a");

    public static final By name = By.cssSelector("#Name");
    public static final By company = By.cssSelector("#Company");
    public static final By adress = By.cssSelector("#Address");
    public static final By city = By.cssSelector("#City");
    public static final By phone = By.cssSelector("#Phone");
    public static final By email = By.cssSelector("#Email");
    public static final By submitCreateNewBtn = By.cssSelector("body > div > form > div > div:nth-child(9) > div > input");


    public void clicarBtnCreateNew(){
        BaseTest.click(btnCreateNew);
    }

    public void preencherName(){ BaseTest.sendKeys(name, "Sandman");}

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
        BaseTest.sendKeys(email, "sandman@sandman");
    }

    public void clicarSubmitCreateNewBtn() {BaseTest.click(submitCreateNewBtn);}

    //public String validarMsgm() {return BaseTest.getText(msgSucessRegistration);}



}
