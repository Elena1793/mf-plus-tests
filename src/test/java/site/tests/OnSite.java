package site.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

import static site.Data.WebElements.JobMenu_WebElements.Job_Operations_button;
import static site.Data.WebElements.Operation_CV.New_Operation_button;
import static site.Data.WebElements.Operation_CV.Relo_button;

/**
 * Created by Lena on 22.10.2019.
 */
public class OnSite extends TestBase {
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
        app.getOnSite_Metods().clickOnAddStaff_button();
        app.getOnSite_Metods().selectStaffFromDropdownInPopup();
        app.getOnSite_Metods().clickOnAddButtonOnAddStaffPopup();
        app.getOnSite_Metods().selectStaffInStaffGrid();
        app.getOnSite_Metods().clickOnStaffTime_button();
        app.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getOnSite_Metods().clickOnStaffImportToExpenseButton();
        app.getOnSite_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        app.getOnSite_Metods().selectVehicleFromDropdownInPopup();
        app.getOnSite_Metods().clickOnAddButtonOnAddVehiclePopup();
        app.getOnSite_Metods().selectVehicleInVehiclesGrid();
        app.getOnSite_Metods().clickOnVehicleTime_button();
        app.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getOnSite_Metods().clickOnVehicleImportToExpenseButton();
        app.getOnSite_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        app.getOnSite_Metods().selectEquipmentFromDropdownInPopup();
        app.getOnSite_Metods().clickOnAddButtonOnAddEquipmentPopup();
        app.getOnSite_Metods().selectEquipmentInEquipmentsGrid();
        app.getOnSite_Metods().clickOnEquipmentTime_button();
        app.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getOnSite_Metods().clickOnEquipmentImportToExpenseButton();
    }

   // @Test
    public void addRresource_Staff() {

        app.getOnSite_Metods().clickOnAddStaff_button();
        app.getOnSite_Metods().selectStaffFromDropdownInPopup();
        app.getOnSite_Metods().clickOnAddButtonOnAddStaffPopup();
        app.getOnSite_Metods().selectStaffInStaffGrid();
        app.getOnSite_Metods().clickOnStaffTime_button();
        app.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getOnSite_Metods().clickOnStaffImportToExpenseButton();

    }
   // @Test
    public void addRresource_Vehicles() {
        app.getOnSite_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        app.getOnSite_Metods().selectVehicleFromDropdownInPopup();
        app.getOnSite_Metods().clickOnAddButtonOnAddVehiclePopup();
        app.getOnSite_Metods().selectVehicleInVehiclesGrid();
        app.getOnSite_Metods().clickOnVehicleTime_button();
        app.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getOnSite_Metods().clickOnVehicleImportToExpenseButton();
    }

   // @Test
    public void addRresource_Equipment() {
        app.getOnSite_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        app.getOnSite_Metods().selectEquipmentFromDropdownInPopup();
        app.getOnSite_Metods().clickOnAddButtonOnAddEquipmentPopup();
        app.getOnSite_Metods().selectEquipmentInEquipmentsGrid();
        app.getOnSite_Metods().clickOnEquipmentTime_button();
        app.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getOnSite_Metods().clickOnEquipmentImportToExpenseButton();
    }




}
