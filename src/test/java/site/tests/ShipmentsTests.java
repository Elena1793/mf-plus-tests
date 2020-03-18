package site.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import site.Data.Resources.Units;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

import static site.Data.WebElements.JobMenu_WebElements.Job_Shipments_button;

/**
 * Created by Lena on 08.03.2020.
 */
public class ShipmentsTests extends TestBase{
    @Test(priority=1,dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")
    public void init(By locatorlanguage, String bookingType, String source, String jobType,
                     String mode, String serviceType, String serviceLevel,
                     String firstName, String lastName, String email, String phone,
                     String country1, String country2, String city1, String city2,
                     String street1, String street2, String zip1, String zip2) {


        app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        app.getMainMenu_Metods().Job_GridScreen_Open();
        String client = firstName + " " + lastName;
        app.getJobGrid_Metods().openJobByClientName(client);
        app.getJobGrid_Metods().OpenPage(Job_Shipments_button, "Shipment/ClientFileGrid");
        app.getShipments_Methods().createJobShipment();
        app.getShipments_Methods().addShipmentUniteButton();
        app.getShipments_Methods().selectLoadUniteInLoadingUnitType_dropdown(new Units(locatorlanguage).getAirvan());
        app.getShipments_Methods().setGrossVolumeInShipmentUnitsGrid("100");
        app.getShipments_Methods().setGrossWeightInShipmentUnitsGrid("200");
        app.getShipments_Methods().setLocationInShipmentUnitsGrid();
        app.getShipments_Methods().clickOnSaveButtonInLoadUnitsGrid();
    //    clickOnCalendarIcon_ETD();
   //     setNextDay_ETD();
  //      clickOnCalendarIcon_ETD();
  //      setPrevDay_ETD();
       // clickOnCalendarIcon_ETD();
      //  setCurrentDay_ETD();

       String res= app.getShipments_Methods().getExistText(By.xpath("//td[@aria-selected='true']/a"));
        System.out.println("============="+res);
      //  app.getShipments_Methods().click(By.xpath("//*[@aria-controls='etd_timeview']"));
       // app.getShipments_Methods(.getAtributExistTextByTitle()

      //  app.getShipments_Methods().click(By.xpath("//*[@aria-controls='eta_dateview']"));
      //  app.getShipments_Methods().click(By.xpath("//*[@aria-controls='eta_timeview']"));
    }

    private void setCurrentDay_ETD() {
        String str=app.getShipments_Methods().getAtributExistTextByTitle(By.xpath("//a[contains(@class,'k-link k-nav-today')]"));
        String currentDate=str.split(" ")[2].split("\\,")[0];
        app.getShipments_Methods().waitForElementByVisibility(By.xpath("//a[@class='k-link'][contains(text(),'"+currentDate+"')]"));
        app.getShipments_Methods().click(By.xpath("//a[@class='k-link'][contains(text(),'"+currentDate+"')]"));
    }

    private void clickOnCalendarIcon_ETD() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        app.getShipments_Methods().click(By.xpath("//*[@aria-controls='etd_dateview']"));
    }

    private void setPrevDay_ETD() {
        String str=app.getShipments_Methods().getAtributExistTextByTitle(By.xpath("//a[contains(@class,'k-link k-nav-today')]"));
        String st=str.split(" ")[2].split("\\,")[0];
        int res=Integer.parseInt(st)-1;
        String newDate=String.valueOf(res);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        app.getShipments_Methods().waitForElementByClickable_Locator(By.xpath("//a[@class='k-link'][contains(text(),'"+newDate+"')]"));
        app.getShipments_Methods().click(By.xpath("//a[@class='k-link'][contains(text(),'"+st+"')]//../.././/a[@class='k-link'][contains(text(),'"+newDate+"')]"));
    }

    private void setNextDay_ETD() {
        String str=app.getShipments_Methods().getAtributExistTextByTitle(By.xpath("//a[contains(@class,'k-link k-nav-today')]"));
        String st=str.split(" ")[2].split("\\,")[0];
        int res=Integer.parseInt(st)+1;
        String newDate=String.valueOf(res);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        app.getShipments_Methods().waitForElementByClickable_Locator(By.xpath("//a[@class='k-link'][contains(text(),'"+newDate+"')]"));
        app.getShipments_Methods().click(By.xpath("//a[@class='k-link'][contains(text(),'"+st+"')]//../.././/a[@class='k-link'][contains(text(),'"+newDate+"')]"));
    }


}
