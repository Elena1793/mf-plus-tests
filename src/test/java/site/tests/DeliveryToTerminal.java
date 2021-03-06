package site.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

import static site.Data.WebElements.JobMenu_WebElements.Job_Operations_button;
import static site.Data.WebElements.Operation_CV.DeliveryToTerminal_button;
import static site.Data.WebElements.Operation_CV.New_Operation_button;
import static site.Data.WebElements.Operation_CV.PickupFromTerminal_button;

/**
 * Created by Lena on 22.10.2019.
 */
public class DeliveryToTerminal extends TestBase {
 //   @BeforeClass
    public void Precondition(){
        Integer row1 =(int)(Math.random()*8)+1;
        String row = String.valueOf(row1);
        System.out.print(row);
        app.getOperationsCV_metods().create_DeliveryToTerminal(row);

    }

    @Test(priority=1,dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")
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
        app.getJobGrid_Metods(). click(New_Operation_button);
        app.getJobGrid_Metods().click(DeliveryToTerminal_button);
        app.getJobGrid_Metods(). waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getPickupFromTerminal_Metods().clickOnAddStaff_button();
        app.getPickupFromTerminal_Metods().selectStaffFromDropdownInPopup();
        app.getPickupFromTerminal_Metods().clickOnAddButtonOnAddStaffPopup();
        app.getPickupFromTerminal_Metods().selectStaffInStaffGrid();
        app.getPickupFromTerminal_Metods().clickOnStaffTime_button();
        app.getPickupFromTerminal_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getPickupFromTerminal_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getPickupFromTerminal_Metods().clickOnStaffImportToExpenseButton();
                 app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getPickupFromTerminal_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        app.getPickupFromTerminal_Metods().selectVehicleFromDropdownInPopup();
        app.getPickupFromTerminal_Metods().clickOnAddButtonOnAddVehiclePopup();
        app.getPickupFromTerminal_Metods().selectVehicleInVehiclesGrid();
        app.getPickupFromTerminal_Metods().clickOnVehicleTime_button();
        app.getPickupFromTerminal_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getPickupFromTerminal_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getPickupFromTerminal_Metods().clickOnVehicleImportToExpenseButton();


    }


  //  @Test
    public void addRresource_Staff() {

        app.getDeliveryToTerminal_Metods().clickOnAddStaff_button();
        app.getDeliveryToTerminal_Metods().selectStaffFromDropdownInPopup();
        app.getDeliveryToTerminal_Metods().clickOnAddButtonOnAddStaffPopup();
        app.getDeliveryToTerminal_Metods().selectStaffInStaffGrid();
        app.getDeliveryToTerminal_Metods().clickOnStaffTime_button();
        app.getDeliveryToTerminal_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getDeliveryToTerminal_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getDeliveryToTerminal_Metods().clickOnStaffImportToExpenseButton();

    }
  //  @Test
    public void addRresource_Vehicles() {
        app.getDeliveryToTerminal_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        app.getDeliveryToTerminal_Metods().selectVehicleFromDropdownInPopup();
        app.getDeliveryToTerminal_Metods().clickOnAddButtonOnAddVehiclePopup();
        app.getDeliveryToTerminal_Metods().selectVehicleInVehiclesGrid();
        app.getDeliveryToTerminal_Metods().clickOnVehicleTime_button();
        app.getDeliveryToTerminal_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getDeliveryToTerminal_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getDeliveryToTerminal_Metods().clickOnVehicleImportToExpenseButton();
    }

}
