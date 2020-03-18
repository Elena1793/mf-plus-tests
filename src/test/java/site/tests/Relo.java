package site.tests;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

import static site.Data.WebElements.JobMenu_WebElements.Job_Operations_button;
import static site.Data.WebElements.Operation_CV.BoxDelivery_button;
import static site.Data.WebElements.Operation_CV.New_Operation_button;
import static site.Data.WebElements.Operation_CV.Relo_button;

/**
 * Created by Lena on 22.10.2019.
 */
public class Relo extends TestBase {


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
        app.getJobGrid_Metods().click(Relo_button);
        app.getJobGrid_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getRelo_Metods().clickOnAddStaff_button();
        app.getRelo_Metods().selectStaffFromDropdownInPopup();
        app.getRelo_Metods().clickOnAddButtonOnAddStaffPopup();
        app.getRelo_Metods().selectStaffInStaffGrid();
        app.getRelo_Metods().clickOnStaffTime_button();
        app.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getRelo_Metods().clickOnStaffImportToExpenseButton();
        app.getRelo_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        app.getRelo_Metods().selectVehicleFromDropdownInPopup();
        app.getRelo_Metods().clickOnAddButtonOnAddVehiclePopup();
        app.getRelo_Metods().selectVehicleInVehiclesGrid();
        app.getRelo_Metods().clickOnVehicleTime_button();
        app.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getRelo_Metods().clickOnVehicleImportToExpenseButton();
        app.getRelo_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        app.getRelo_Metods().selectEquipmentFromDropdownInPopup();
        app.getRelo_Metods().clickOnAddButtonOnAddEquipmentPopup();
        app.getRelo_Metods().selectEquipmentInEquipmentsGrid();
        app.getRelo_Metods().clickOnEquipmentTime_button();
        app.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getRelo_Metods().clickOnEquipmentImportToExpenseButton();
    }


  //  @Test
    public void addRresource_Staff() {

        app.getRelo_Metods().clickOnAddStaff_button();
        app.getRelo_Metods().selectStaffFromDropdownInPopup();
        app.getRelo_Metods().clickOnAddButtonOnAddStaffPopup();
        app.getRelo_Metods().selectStaffInStaffGrid();
        app.getRelo_Metods().clickOnStaffTime_button();
        app.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getRelo_Metods().clickOnStaffImportToExpenseButton();

    }
  //  @Test
    public void addRresource_Vehicles() {
        app.getRelo_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        app.getRelo_Metods().selectVehicleFromDropdownInPopup();
        app.getRelo_Metods().clickOnAddButtonOnAddVehiclePopup();
        app.getRelo_Metods().selectVehicleInVehiclesGrid();
        app.getRelo_Metods().clickOnVehicleTime_button();
        app.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getRelo_Metods().clickOnVehicleImportToExpenseButton();
    }

  //  @Test
    public void addRresource_Equipment() {
        app.getRelo_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        app.getRelo_Metods().selectEquipmentFromDropdownInPopup();
        app.getRelo_Metods().clickOnAddButtonOnAddEquipmentPopup();
        app.getRelo_Metods().selectEquipmentInEquipmentsGrid();
        app.getRelo_Metods().clickOnEquipmentTime_button();
        app.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getRelo_Metods().clickOnEquipmentImportToExpenseButton();
    }




}
