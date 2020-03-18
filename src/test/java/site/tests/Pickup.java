package site.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

import java.util.LinkedList;

import static site.Data.Resources.GlobalResources.ScreensURL.Job_Grid;
import static site.Data.WebElements.JobMenu_WebElements.Job_Operations_button;
import static site.Data.WebElements.MainMenu_WebElements.MainMenu_List;
import static site.Data.WebElements.Operation_CV.New_Operation_button;
import static site.Data.WebElements.Operation_CV.Pickup_button;

/**
 * Created by Lena on 22.10.2019.
 */
public class Pickup extends TestBase {
  //  @BeforeClass
    public void Precondition(){
        Integer row1 =(int)(Math.random()*8)+1;
        String row = String.valueOf(row1);
        System.out.print(row);
        app.getOperationsCV_metods().create_Pickup(row);

    }
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
        try {
            Thread.sleep((long) 1000.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     //   app.getJobGrid_Metods(). waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getBoxDelivery_Metods().clickOnAddStaff_button();

     //   app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));


        app.getBoxDelivery_Metods().selectStaffFromDropdownInPopup();


        app.getBoxDelivery_Metods().clickOnAddButtonOnAddStaffPopup();
        app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));


        app.getBoxDelivery_Metods().selectStaffInStaffGrid();
        app.getBoxDelivery_Metods().clickOnStaffTime_button();
        app.getBoxDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();

        app.getBoxDelivery_Metods().clickCloseButtonOnTimesSheetWindow();

        app.getBoxDelivery_Metods().clickOnStaffImportToExpenseButton();
       // app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));

        app.getBoxDelivery_Metods().clickOnAddVehicles_button_InVehiclesGrid();

       // app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));

        app.getBoxDelivery_Metods().selectVehicleFromDropdownInPopup();



        app.getBoxDelivery_Metods().clickOnAddButtonOnAddVehiclePopup();

      //  app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));

        app.getBoxDelivery_Metods().selectVehicleInVehiclesGrid();


        app.getBoxDelivery_Metods().clickOnVehicleTime_button();

        app.getBoxDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();

        app.getBoxDelivery_Metods().clickCloseButtonOnTimesSheetWindow();

        app.getBoxDelivery_Metods().clickOnVehicleImportToExpenseButton();
       // app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getBoxDelivery_Metods().clickOnAddEquipment_button_InEquipmentGrid();

     //   app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));

        app.getBoxDelivery_Metods().selectEquipmentFromDropdownInPopup();


        app.getBoxDelivery_Metods().clickOnAddButtonOnAddEquipmentPopup();
      //  app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getBoxDelivery_Metods().selectEquipmentInEquipmentsGrid();
        app.getBoxDelivery_Metods().clickOnEquipmentTime_button();

        app.getBoxDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getBoxDelivery_Metods().clickCloseButtonOnTimesSheetWindow();

        app.getBoxDelivery_Metods().clickOnEquipmentImportToExpenseButton();
        app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
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

    LinkedList <Integer> l = new LinkedList<>();

   // @Test
    public void addRresource_Staff1() {
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));

      //  app.getUserMenu_Metods().OpenPageByUrl(Job_Grid);
     //  app.getUserMenu_Metods().changeLanguage(locatorlanguage);
      //  Assert.assertTrue(app.getUserMenu_Metods().Check_changeLanguage(locatorlanguage, Job));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

        //app.getJobMenu_Metods().click(By.xpath("//button[@id='staffAdd']"));

        app.getJobMenu_Metods().waitForElementByVisibility(By.xpath("/[@class='blockCompleted btn btn__simple k-button k-button-icon'][@id='staffAdd']"));
        app.getJobMenu_Metods().click(By.xpath("/[@class='blockCompleted btn btn__simple k-button k-button-icon'][@id='staffAdd']"));


        //app.getUserMenu_Metods().waitForElementByVisibility(By.xpath("//div[@id='addResourceWindow']"));
        app.getJobMenu_Metods().waitForElementByVisibility(By.xpath("/[@class='k-widget k-window k-state-focused']"));
        app.getJobMenu_Metods().click(By.xpath("//div[@id='addResourceWindow']//div[@class='k-widget k-multiselect k-header big']"));
        //app.getJobMenu_Metods().click(By.xpath("//div[@class='popup__content']//div[@class='form__group']//div[@class='k-multiselect-wrap k-floatwrap']"));
        app.getJobMenu_Metods().click(By.xpath("//ul[@id='resources_listbox']/li[@data-offset-index='0']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getJobMenu_Metods().click(By.xpath("//button[@id='addResource']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//div[@class='k-overlay']"));
        app.getJobMenu_Metods().click(By.xpath("//div[@id='staffGrid']//div[@class='k-grid-content']//tr")); //div[@id='vehiclesGrid']/[@class='k-selectable']
        app.getJobMenu_Metods().click(By.xpath("//button[@id='staffTime']"));
        app.getJobMenu_Metods().waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        app.getJobMenu_Metods().waitForElementByVisibility(By.xpath("/[@class='k-widget k-window k-state-focused']"));
        app.getJobMenu_Metods().click(By.xpath("//button[@id='timeSheetsAdd']"));

        app.getJobMenu_Metods().click(By.xpath("//a[@class='btn btn_sm btn__cancel k-button timesheetClose']"));
        //app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//div[@class='k-overlay']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getJobMenu_Metods().click(By.xpath("//button[@id='staffImportToExpense']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

        //div[@class='k-overlay']
    }
   //@Test
    public void addRresource_Equipment1( ) {
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));

        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getJobMenu_Metods().waitForElementByVisibility(By.xpath("//*[@class='blockCompleted btn btn__simple k-button k-button-icon'][@id='equipmentAdd']"));
        app.getJobMenu_Metods().click(By.xpath("//*[@class='blockCompleted btn btn__simple k-button k-button-icon'][@id='equipmentAdd']"));
        app.getJobMenu_Metods().waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
     //   app.getJobMenu_Metods().click(By.xpath("//button[@id='equipmentAdd']"));
        app.getJobMenu_Metods().click(By.xpath("//div[@id='addResourceWindow']//div[@class='k-widget k-multiselect k-header big']"));
        //div[@id='addResourceWindow']//div[@class='k-widget k-multiselect k-header big']
        //div[@class='popup__content']//div[@class='form__group']//div[@class='k-multiselect-wrap k-floatwrap']
        app.getJobMenu_Metods().click(By.xpath("//ul[@id='resources_listbox']/li[@data-offset-index='0']"));
        app.getJobMenu_Metods().click(By.xpath("//button[@id='addResource']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//div[@class='k-overlay']"));
        app.getJobMenu_Metods().click(By.xpath("//div[@id='equipmentGrid']//div[@class='k-grid-content']//tr")); //div[@id='vehiclesGrid']//*[@class='k-selectable']
        app.getJobMenu_Metods().click(By.xpath("//button[@id='equipmentTime']"));
        app.getJobMenu_Metods().waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        app.getJobMenu_Metods().waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        app.getJobMenu_Metods().click(By.xpath("//button[@id='timeSheetsAdd']"));

        app.getJobMenu_Metods().click(By.xpath("//a[@class='btn btn_sm btn__cancel k-button timesheetClose']"));
       // app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//div[@class='k-overlay']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getJobMenu_Metods().click(By.xpath("//button[@id='equipmentImportToExpense']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }
    //*[@class='blockCompleted btn btn__simple k-button k-button-icon'][@id='equipmentAdd']
  //  @Test
    public void addRresource_Vehicles1() {
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));

        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getJobMenu_Metods().waitForElementByVisibility(By.xpath("//*[@class='blockCompleted btn btn__simple k-button k-button-icon'][@id='vehiclesAdd']"));
        app.getJobMenu_Metods().click(By.xpath("//*[@class='blockCompleted btn btn__simple k-button k-button-icon'][@id='vehiclesAdd']"));

        // app.getJobMenu_Metods().waitForElementByNOTvisibility(By.xpath("//div[@class='k-widget k-window'][@xpath='7']"));
        //  app.getJobMenu_Metods().waitForElementByVisibility(By.xpath("//div[@class='popup__content']//div[@class='form__group']"));

//app.getJobMenu_Metods().click(By.xpath("//div[34]"));
        // app.getJobMenu_Metods().waitForElementByClickable_Locator(By.xpath("//span[@id='headerText']"));
        app.getJobMenu_Metods().waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        // app.getJobMenu_Metods().click(By.xpath("//div[@id='addResourceWindow']//div[@class='popup__content']//div[@class='k-widget k-multiselect k-header big']"));
        //app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getJobMenu_Metods().click(By.xpath("//div[@class='popup__content']//div[@class='form__group']//div[@class='k-multiselect-wrap k-floatwrap']"));

        // app.getJobMenu_Metods().dropdownSelectElement("Alex Pen",By.xpath("//ul[@id='resources_listbox']/li"));
        app.getJobMenu_Metods().click(By.xpath("//ul[@id='resources_listbox']/li[@data-offset-index='0']"));
        app.getJobMenu_Metods().click(By.xpath("//button[@id='addResource']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//div[@class='k-overlay']"));
        //app.getJobMenu_Metods().click(By.xpath("//div[@id='equipmentGrid']//table[@class='k-selectable']")); //div[@id='vehiclesGrid']//div[@class='k-grid-content']//tr
        app.getJobMenu_Metods().click(By.xpath("//div[@id='vehiclesGrid']//div[@class='k-grid-content']//tr")); //div[@id='vehiclesGrid']//*[@class='k-selectable']
        app.getJobMenu_Metods().click(By.xpath("//button[@id='vehiclesTime']"));
        app.getJobMenu_Metods().waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        app.getJobMenu_Metods().waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        app.getJobMenu_Metods().click(By.xpath("//button[@id='timeSheetsAdd']"));

        app.getJobMenu_Metods().click(By.xpath("//a[@class='btn btn_sm btn__cancel k-button timesheetClose']"));
       // app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//div[@class='k-overlay']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        app.getJobMenu_Metods().click(By.xpath("//button[@id='vehiclesImportToExpense']"));
        app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }
}
