package site.tests;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

/**
 * Created by user on 27.05.2018.
 */
public class JobSummuryTests extends TestBase {
   // @BeforeTest
    public void Precondition(){
        app.getLoginScreen_Metods().login("testuser4","testuser4");


    }

    //@Test(dataProviderClass = DataProviders.class,dataProvider ="NewAddress")
    public void CreateNewAddresses(By locatorlanguage, String countryOtigin, String countryDestinaton, String city, String street1, String zip){
        app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        app.getMainMenu_Metods().Job_GridScreen_Open();
        app.getJobMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        app.getJobMenu_Metods().click(By.xpath("//a[@href=\"/Job/JobSummary?id=893\"]"));
        app.getAddressForm_Metods().createNewAddtess("from",countryOtigin, city, street1, zip);
        app.getAddressForm_Metods().createNewAddtess("to",countryDestinaton, city, street1, zip);

    }


    // @Test(dataProviderClass = DataProviders.class,dataProvider ="EditAddressDetails")
    public void EditAddressDetails (By locatorlanguage,String editCountry, String editCity, String editStreet1, String editCompany, String editZip, String residenceType,
                                     String residenceTypeDescription, String floor, String elevatorDetails, String kindOfCran, String parkingType,
                                     String parkingSpotSize, String numberOfSpots, String distanceOfParking, String shuttleDistance, String carryDistance,
                                     String stairsCarryDistance, String carryDetails, String stairsCarryDetails, String additionalStopDetails){
        app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        app.getMainMenu_Metods().Job_GridScreen_Open();
        app.getJobMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        app.getJobMenu_Metods().click(By.xpath("//tr[1]/td[1]//a")); //app.getJobMenu_Metods().click(By.xpath("//a[@href=\"/Job/JobSummary?id=893\"]"));


        app.getAddressDetails_Metods().editAddress(editCountry, editCity, editStreet1, editCompany, editZip, residenceType,
                residenceTypeDescription, floor, elevatorDetails, kindOfCran, parkingType,
                parkingSpotSize, numberOfSpots, distanceOfParking, shuttleDistance, carryDistance, stairsCarryDistance,
                carryDetails, stairsCarryDetails, additionalStopDetails);

    }
}
