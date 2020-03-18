package site.tests;


import org.openqa.selenium.By;

import org.testng.annotations.Test;
import site.Data.Resources.Units;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;


import static site.Data.WebElements.JobMenu_WebElements.Job_Operations_button;
import static site.Data.WebElements.Operation_CV.New_Operation_button;

import static site.Data.WebElements.Operation_CV.WarehouseReceiveIn_button;

/**
 * Created by Lena on 22.10.2019.
 */
public class WarehouseReceiveIn extends TestBase {


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
        app.getJobGrid_Metods().OpenPage(Job_Operations_button, "Transaction/ClientFileGrid");
        app.getJobGrid_Metods().click(New_Operation_button);
        app.getJobGrid_Metods().click(WarehouseReceiveIn_button);
        app.getJobGrid_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getWarehouseReceiveIn_Metods().AddLoadUniteButton();
        app.getWarehouseReceiveIn_Metods().selectLoadUniteInLoadingUnitType_dropdown(new Units(locatorlanguage).getAirvan());
        app.getWarehouseReceiveIn_Metods().setNetVolumeInLoadUnitsGrid("100");
        app.getWarehouseReceiveIn_Metods().setGrossVolumeInLoadUnitsGrid("200");
        app.getWarehouseReceiveIn_Metods().setNetWeightInLoadUnitsGrid("300");
        app.getWarehouseReceiveIn_Metods().setGrossWeightInLoadUnitsGrid("400");
        app.getWarehouseReceiveIn_Metods().setLocationInLoadUnitsGrid();
        app.getWarehouseReceiveIn_Metods().clickOnSaveButtonInLoadUnitsGrid();
        app.getWarehouseReceiveIn_Metods().clickOnAddStaff_button();
        app.getWarehouseReceiveIn_Metods().selectStaffFromDropdownInPopup();
        app.getWarehouseReceiveIn_Metods().clickOnAddButtonOnAddStaffPopup();
        app.getWarehouseReceiveIn_Metods().selectStaffInStaffGrid();
        app.getWarehouseReceiveIn_Metods().clickOnStaffTime_button();
        app.getWarehouseReceiveIn_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getWarehouseReceiveIn_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getWarehouseReceiveIn_Metods().clickOnStaffImportToExpenseButton();

    }

  //  @Test
    public void addRresource_Staff() {
        app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getWarehouseReceiveIn_Metods().clickOnAddStaff_button();
        app.getWarehouseReceiveIn_Metods().selectStaffFromDropdownInPopup();
        app.getWarehouseReceiveIn_Metods().clickOnAddButtonOnAddStaffPopup();
        app.getWarehouseReceiveIn_Metods().selectStaffInStaffGrid();
        app.getWarehouseReceiveIn_Metods().clickOnStaffTime_button();
        app.getWarehouseReceiveIn_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getWarehouseReceiveIn_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getWarehouseReceiveIn_Metods().clickOnStaffImportToExpenseButton();


    }

  //  @Test
    public void addLoadUnit1(){
        app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getWarehouseReceiveIn_Metods().AddLoadUniteButton();
        app.getWarehouseReceiveIn_Metods().click(By.xpath("//span[@aria-owns=\"LoadingUnitType_listbox\"]"));
        app.getWarehouseReceiveIn_Metods().dropdownSelectElement(Units.Airvan,By.xpath("//ul[@id='LoadingUnitType_listbox']/li"));
        app.getWarehouseReceiveIn_Metods().setNetVolumeInLoadUnitsGrid("100");
        app.getWarehouseReceiveIn_Metods().setGrossVolumeInLoadUnitsGrid("200");
        app.getWarehouseReceiveIn_Metods().setNetWeightInLoadUnitsGrid("300");
        app.getWarehouseReceiveIn_Metods().setGrossWeightInLoadUnitsGrid("400");
        app.getWarehouseReceiveIn_Metods().setLocationInLoadUnitsGrid();
        app.getWarehouseReceiveIn_Metods().clickOnSaveButtonInLoadUnitsGrid();
    }



}
