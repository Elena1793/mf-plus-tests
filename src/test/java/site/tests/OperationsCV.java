package site.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import site.framework.Screens.OperationsCV_metods;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

import static site.Data.WebElements.Operation_CV.HomeButtonOnJobMenu;
import static site.Data.WebElements.Operation_CV.New_Operation_button;
import static site.Data.WebElements.Operation_CV.Pickup_button;

/**
 * Created by user on 15.08.2019.
 */
public class OperationsCV extends TestBase {
    Integer row1 =(int)(Math.random()*8)+1;
    String row = String.valueOf(row1);


    @Test// (dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_Pickup() {
        app.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getMainMenu_Metods().Job_GridScreen_Open();
      app.userMenu_Metods_lang().changeLanguage_byApp();
        app.getJobGrid_Metods().clickOnRowInGrid(row);
        app.getJobMenu_Metods().Job_OperationsScreen_Open();
        app.getJobMenu_Metods().click(New_Operation_button);
        app.getJobMenu_Metods().click(Pickup_button);
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        app.getMainMenu_Metods().click(HomeButtonOnJobMenu);


    }

    @Test //(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_Delivery( ) {
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
       app.getMainMenu_Metods().Job_GridScreen_Open();
        app.userMenu_Metods_lang().changeLanguage_byApp();
        app.getJobGrid_Metods().clickOnRowInGrid(row);
        app.getJobMenu_Metods().Job_OperationsScreen_Open();
        app.getJobMenu_Metods().click(New_Operation_button);
        app.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.Delivery']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        app.getMainMenu_Metods().click(HomeButtonOnJobMenu);
    }

    @Test//(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_PickupFromTerminal() {
        app.getMainMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
       app.getMainMenu_Metods().Job_GridScreen_Open();
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.userMenu_Metods_lang().changeLanguage_byApp();        //app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        app.getJobGrid_Metods().clickOnRowInGrid(row);
        app.getJobMenu_Metods().Job_OperationsScreen_Open();
        app.getJobMenu_Metods().click(New_Operation_button);
        app.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.PickupFromTerminal']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        app.getMainMenu_Metods().click(HomeButtonOnJobMenu);


    }

    @Test//(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_DeliveryToTerminal() {
        app.getMainMenu_Metods().Job_GridScreen_Open();
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        app.userMenu_Metods_lang().changeLanguage_byApp();        app.getJobGrid_Metods().clickOnRowInGrid(row);
        app.getJobMenu_Metods().Job_OperationsScreen_Open();
        app.getJobMenu_Metods().click(New_Operation_button);
        app.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.DeliveryToTerminal']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        app.getMainMenu_Metods().click(HomeButtonOnJobMenu);

    }
    @Test//(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_WarehouseOutload() {
        app.getMainMenu_Metods().Job_GridScreen_Open();
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        app.userMenu_Metods_lang().changeLanguage_byApp();
        app.getJobGrid_Metods().clickOnRowInGrid(row);
        app.getJobMenu_Metods().Job_OperationsScreen_Open();
        app.getJobMenu_Metods().click(New_Operation_button);
        app.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.WarehouseOutload']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        app.getMainMenu_Metods().click(HomeButtonOnJobMenu);
    }

    @Test//(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_WarehouseReceiveIn() {
        app.getMainMenu_Metods().Job_GridScreen_Open();
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        app.userMenu_Metods_lang().changeLanguage_byApp();
        app.getJobGrid_Metods().clickOnRowInGrid(row);
        app.getJobMenu_Metods().Job_OperationsScreen_Open();
        app.getJobMenu_Metods().click(New_Operation_button);
        app.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.WarehouseReceiveIn']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        app.getMainMenu_Metods().click(HomeButtonOnJobMenu);

    }


    @Test//(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_BoxDelivery() {

       app.getMainMenu_Metods().Job_GridScreen_Open();
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
       // app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        app.userMenu_Metods_lang().changeLanguage_byApp();
        app.getJobGrid_Metods().clickOnRowInGrid(row);
        app.getJobMenu_Metods().Job_OperationsScreen_Open();
        app.getJobMenu_Metods().click(New_Operation_button);
        app.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.BoxDelivery']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        app.getMainMenu_Metods().click(HomeButtonOnJobMenu);
    }

    @Test//(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_OnSite() {

        app.getMainMenu_Metods().Job_GridScreen_Open();
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
       // app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        app.userMenu_Metods_lang().changeLanguage_byApp();
        app.getJobGrid_Metods().clickOnRowInGrid(row);
        app.getJobMenu_Metods().Job_OperationsScreen_Open();
        app.getJobMenu_Metods().click(New_Operation_button);
        app.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.OnSite']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));

        app.getMainMenu_Metods().click(By.xpath("//a[@class='job-menu__item small-font']"));
    }

    @Test// (dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_Relo() {
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getMainMenu_Metods().Job_GridScreen_Open();
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
       // app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        app.userMenu_Metods_lang().changeLanguage_byApp();
        app.getJobGrid_Metods().clickOnRowInGrid(row);
        app.getJobMenu_Metods().Job_OperationsScreen_Open();
        app.getJobMenu_Metods().click(New_Operation_button);
        app.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.Relo']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        app.getMainMenu_Metods().click(By.xpath("//a[@class='job-menu__item small-font']"));


    }
}