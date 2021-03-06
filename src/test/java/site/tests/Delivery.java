package site.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

import static site.Data.WebElements.JobMenu_WebElements.Job_Operations_button;
import static site.Data.WebElements.Operation_CV.Delivery_button;
import static site.Data.WebElements.Operation_CV.New_Operation_button;
import static site.Data.WebElements.Operation_CV.Pickup_button;

/**
 * Created by Lena on 22.10.2019.
 */
public class Delivery extends TestBase {
   // @BeforeClass
    public void Precondition(){
        Integer row1 =(int)(Math.random()*8)+1;
        String row = String.valueOf(row1);
        System.out.print(row);

        app.getOperationsCV_metods().create_Delivery(row);

    }

   // @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_gblinerstest")
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
        app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getJobGrid_Metods(). click(New_Operation_button);
        app.getJobGrid_Metods().click(Delivery_button);
        app.getJobGrid_Metods(). waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));

        app.getBoxDelivery_Metods().clickOnAddStaff_button();
                             //app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));

        app.getBoxDelivery_Metods().selectStaffFromDropdownInPopup();
        app.getBoxDelivery_Metods().clickOnAddButtonOnAddStaffPopup();
                app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getBoxDelivery_Metods().selectStaffInStaffGrid();
        app.getBoxDelivery_Metods().clickOnStaffTime_button();
        app.getBoxDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getBoxDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getBoxDelivery_Metods().clickOnStaffImportToExpenseButton();

       /* try {
            Thread.sleep((long) 1000.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
       app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getBoxDelivery_Metods().clickOnAddVehicles_button_InVehiclesGrid();
              //  app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getBoxDelivery_Metods().selectVehicleFromDropdownInPopup();
        app.getBoxDelivery_Metods().clickOnAddButtonOnAddVehiclePopup();
        app.getBoxDelivery_Metods().selectVehicleInVehiclesGrid();
        app.getBoxDelivery_Metods().clickOnVehicleTime_button();
        app.getBoxDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getBoxDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getBoxDelivery_Metods().clickOnVehicleImportToExpenseButton();

     /*   try {
            Thread.sleep((long) 1500.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
       app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getBoxDelivery_Metods().clickOnAddEquipment_button_InEquipmentGrid();
                //app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getBoxDelivery_Metods().selectEquipmentFromDropdownInPopup();
        app.getBoxDelivery_Metods().clickOnAddButtonOnAddEquipmentPopup();
        app.getBoxDelivery_Metods().selectEquipmentInEquipmentsGrid();
        app.getBoxDelivery_Metods().clickOnEquipmentTime_button();
        app.getBoxDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getBoxDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getBoxDelivery_Metods().clickOnEquipmentImportToExpenseButton();
    }

   // @Test
    public void addRresource_Staff() {

        app.getBoxDelivery_Metods().clickOnAddStaff_button();
        app.getBoxDelivery_Metods().selectStaffFromDropdownInPopup();
        app.getBoxDelivery_Metods().clickOnAddButtonOnAddStaffPopup();
        app.getBoxDelivery_Metods().selectStaffInStaffGrid();
        app.getBoxDelivery_Metods().clickOnStaffTime_button();
        app.getBoxDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getBoxDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getBoxDelivery_Metods().clickOnStaffImportToExpenseButton();

    }
   // @Test
    public void addRresource_Vehicles() {
        app.getBoxDelivery_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        app.getBoxDelivery_Metods().selectVehicleFromDropdownInPopup();
        app.getBoxDelivery_Metods().clickOnAddButtonOnAddVehiclePopup();
        app.getBoxDelivery_Metods().selectVehicleInVehiclesGrid();
        app.getBoxDelivery_Metods().clickOnVehicleTime_button();
        app.getBoxDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getBoxDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getBoxDelivery_Metods().clickOnVehicleImportToExpenseButton();
    }

   // @Test
    public void addRresource_Equipment() {
        app.getBoxDelivery_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        app.getBoxDelivery_Metods().selectEquipmentFromDropdownInPopup();
        app.getBoxDelivery_Metods().clickOnAddButtonOnAddEquipmentPopup();
        app.getBoxDelivery_Metods().selectEquipmentInEquipmentsGrid();
        app.getBoxDelivery_Metods().clickOnEquipmentTime_button();
        app.getBoxDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getBoxDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getBoxDelivery_Metods().clickOnEquipmentImportToExpenseButton();
    }

 }
