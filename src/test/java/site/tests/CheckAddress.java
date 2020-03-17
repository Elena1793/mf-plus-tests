package site.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

import static site.Data.WebElements.MainMenu_WebElements.MainMenu_List;

/**
 * Created by user on 23.05.2019.
 */
public class CheckAddress extends TestBase{

    @Test(dataProviderClass = DataProviders.class,dataProvider = "NewAddress")

    public void CreateNewAddress_FromSection(By language, String country1, String country2,String city1, String street1, String zip){


        app.getUserMenu_Metods().changeLanguage(language);
        Assert.assertTrue(app.getUserMenu_Metods().Check_changeLanguage(language, MainMenu_List));

        app.getMainMenu_Metods().Job_GridScreen_Open();
        app.getJobGrid_Metods().clickOnRowInGrid("1");

        app.getAddressForm_Metods().clickAddNewAddressButton_FromSection();
        app.getAddressForm_Metods().newOriginAddress_setCountry(country1);
        app.getAddressForm_Metods().newOriginAddress_setCity(city1);
        app.getAddressForm_Metods().newOriginAddress_setZip(zip);
        app.getAddressForm_Metods().newOriginAddress_setStreet1(street1);
        app.getAddressForm_Metods().newOriginAddress_CreateButton();
        Assert.assertTrue(app.getAddressForm_Metods().
                isElementPresent(By.xpath("//*[@class='place place_from']//span[contains(text(),'"+street1+", "+city1+", "+zip+", "+country1+"')]")));
        app.getJobMenu_Metods().ReturnToJob_Grid();

    }

    @Test(dataProviderClass = DataProviders.class,dataProvider = "NewAddress")

    public void CreateNewAddress_ToSection(By language, String country1, String country2,String city1, String street1, String zip){


        app.getUserMenu_Metods().changeLanguage(language);
        Assert.assertTrue(app.getUserMenu_Metods().Check_changeLanguage(language, MainMenu_List));

        app.getMainMenu_Metods().Job_GridScreen_Open();
        app.getJobGrid_Metods().clickOnRowInGrid("1");

        app.getAddressForm_Metods().clickAddNewAddressButton_ToSection();
        app.getAddressForm_Metods().newDestinationAddress_setCountry(country2);
        app.getAddressForm_Metods().newDestinationAddress_setCity(city1);
        app.getAddressForm_Metods().newDestinationAddress_setZip(zip);
        app.getAddressForm_Metods().newDestinationAddress_setStreet1(street1);
        app.getAddressForm_Metods().newDestinationAddress_CreateButton();
        Assert.assertTrue(app.getAddressForm_Metods().
                isElementPresent(By.xpath("//*[@class='place place_to']//span[contains(text(),'"+street1+", "+city1+", "+zip+", "+country2+"')]")));
        app.getJobMenu_Metods().ReturnToJob_Grid();

    }

  //  @Test(dataProviderClass = DataProviders.class,dataProvider= "EditAddressDetails")
    public void editAddressDetails(By language,String editCountry, String editCity, String editStreet1, String editCompany, String editZip, String residenceType,
                                   String residenceTypeDescription, String floor, String elevatorDetails, String kindOfCran, String parkingType,
                                   String parkingSpotSize, String numberOfSpots, String distanceOfParking, String shuttleDistance, String carryDistance,
                                   String stairsCarryDistance, String carryDetails, String stairsCarryDetails, String additionalStopDetails){

        app.getUserMenu_Metods().changeLanguage(language);
        Assert.assertTrue(app.getUserMenu_Metods().Check_changeLanguage(language, MainMenu_List));

        app.getMainMenu_Metods().Job_GridScreen_Open();
        app.getJobGrid_Metods().clickOnRowInGrid("1");

        app.getAddressDetails_Metods().clickOnEditAddressButton_FromSection();
        app.getAddressDetails_Metods().addressDetails_setCountry(editCountry);
        app.getAddressDetails_Metods().addressDetails_setCity(editCity);
        app.getAddressDetails_Metods().addressDetails_setStreet1 (editStreet1);
        app.getAddressDetails_Metods().addressDetails_setCompany (editCompany);
        app.getAddressDetails_Metods().addressDetails_setZip (editZip);
        app.getAddressDetails_Metods().addressDetails_setResidenceType (residenceType);
        app.getAddressDetails_Metods().addressDetails_setResidenceTypeDescription (residenceTypeDescription);
        app.getAddressDetails_Metods().addressDetails_setFloor (floor);
        app.getAddressDetails_Metods().addressDetails_setElevatorCheckbox_True ();

        app.getAddressDetails_Metods().addressDetails_setElevatorDetails (elevatorDetails);
        app.getAddressDetails_Metods().addressDetails_NeedCraneCheckbox_True ();


     //   app.getAddressDetails_Metods().addressDetails_KindOfCran (kindOfCran);

        app.getAddressDetails_Metods().addressDetails_ParkingCheckbox_True ();
        app.getAddressDetails_Metods().addressDetails_ParkingType (parkingType);


        app.getAddressDetails_Metods().addressDetails_setParkingSpotSize (parkingSpotSize);
        app.getAddressDetails_Metods().addressDetails_setNumberOfSpots (numberOfSpots);
        app.getAddressDetails_Metods().addressDetails_setDistanceOfParking (distanceOfParking);
        app.getAddressDetails_Metods().addressDetails_NeedShuttleCheckbox_True ();
        app.getAddressDetails_Metods().shuttleDistance (shuttleDistance);
        app.getAddressDetails_Metods().addressDetails_CarryRequiredCheckbox_True ();
        app.getAddressDetails_Metods().carryDistance(carryDistance);
        app.getAddressDetails_Metods().carryDetails (carryDetails);
        app.getAddressDetails_Metods().addressDetails_StairsCarryRequiredCheckbox_True ();
        app.getAddressDetails_Metods().StairsCarryDistance (stairsCarryDistance);
        app.getAddressDetails_Metods().stairsCarryDetails (stairsCarryDetails);
        app.getAddressDetails_Metods().addressDetails_additionalStopRequiredCheckbox_True ();
        app.getAddressDetails_Metods().additionalStopDetails (additionalStopDetails);
        app.getAddressDetails_Metods().click(By.xpath("//*[@class='header']//a[@*]"));
        app.getAddressDetails_Metods().click(By.xpath("//a[@*='/Job/Grid']"));



    }
}
