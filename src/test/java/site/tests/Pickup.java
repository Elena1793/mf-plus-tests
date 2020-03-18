package site.tests;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;
import static site.Data.WebElements.JobMenu_WebElements.Job_Operations_button;
import static site.Data.WebElements.Operation_CV.New_Operation_button;
import static site.Data.WebElements.Operation_CV.Pickup_button;

/**
 * Created by Lena on 22.10.2019.
 */
public class Pickup extends TestBase {

    @Test(priority=1,dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")

   // @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_gblinerstest")

    public void init(By locatorlanguage, String bookingType, String source, String jobType,
                     String mode, String serviceType, String serviceLevel,
                     String firstName, String lastName, String email, String phone,
                     String country1, String country2, String city1, String city2,
                     String street1, String street2, String zip1, String zip2){

        app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        app.getMainMenu_Metods().Job_GridScreen_Open();
        String client = firstName + " " + lastName;
        app.getJobGrid_Metods().openJobByClientName(client);
        app.getJobGrid_Metods().OpenPage(Job_Operations_button,"Transaction/ClientFileGrid");
        app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getJobGrid_Metods(). click(New_Operation_button);
        app.getJobGrid_Metods().click(Pickup_button);
        app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getPickup_Metods().clickOnAddStaff_button();
        app.getPickup_Metods().selectStaffFromDropdownInPopup();
        app.getPickup_Metods().clickOnAddButtonOnAddStaffPopup();
        app.getPickup_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getPickup_Metods().selectStaffInStaffGrid();
        app.getPickup_Metods().clickOnStaffTime_button();
        app.getPickup_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getPickup_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getPickup_Metods().clickOnStaffImportToExpenseButton();
        app.getPickup_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        app.getPickup_Metods().selectVehicleFromDropdownInPopup();
        app.getPickup_Metods().clickOnAddButtonOnAddVehiclePopup();
        app.getPickup_Metods().selectVehicleInVehiclesGrid();
        app.getPickup_Metods().clickOnVehicleTime_button();
        app.getPickup_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getPickup_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getPickup_Metods().clickOnVehicleImportToExpenseButton();
        app.getPickup_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        app.getPickup_Metods().selectEquipmentFromDropdownInPopup();
        app.getPickup_Metods().clickOnAddButtonOnAddEquipmentPopup();
        app.getPickup_Metods().selectEquipmentInEquipmentsGrid();
        app.getPickup_Metods().clickOnEquipmentTime_button();
        app.getPickup_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getPickup_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getPickup_Metods().clickOnEquipmentImportToExpenseButton();
        app.getPickup_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
    }



  //  @Test(priority=2)
    public void addRresource_Staff() {

        app.getPickup_Metods().clickOnAddStaff_button();
        app.getPickup_Metods().selectStaffFromDropdownInPopup();
        app.getPickup_Metods().clickOnAddButtonOnAddStaffPopup();
        app.getPickup_Metods().selectStaffInStaffGrid();
        app.getPickup_Metods().clickOnStaffTime_button();
        app.getPickup_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getPickup_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getPickup_Metods().clickOnStaffImportToExpenseButton();

    }
  //  @Test(priority=3)
    public void addRresource_Vehicles() {
        app.getPickup_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        app.getPickup_Metods().selectVehicleFromDropdownInPopup();
        app.getPickup_Metods().clickOnAddButtonOnAddVehiclePopup();
        app.getPickup_Metods().selectVehicleInVehiclesGrid();
        app.getPickup_Metods().clickOnVehicleTime_button();
        app.getPickup_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getPickup_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getPickup_Metods().clickOnVehicleImportToExpenseButton();
    }

  //  @Test(priority=4)
    public void addRresource_Equipment() {
        app.getPickup_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        app.getPickup_Metods().selectEquipmentFromDropdownInPopup();
        app.getPickup_Metods().clickOnAddButtonOnAddEquipmentPopup();
        app.getPickup_Metods().selectEquipmentInEquipmentsGrid();
        app.getPickup_Metods().clickOnEquipmentTime_button();
        app.getPickup_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getPickup_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getPickup_Metods().clickOnEquipmentImportToExpenseButton();
    }


}
