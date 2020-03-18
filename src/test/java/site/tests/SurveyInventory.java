package site.tests;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import site.Data.Resources.GlobalResources.ScreensURL;
import site.Data.Resources.Item;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;
import java.io.File;
import java.time.LocalTime;
import static site.Data.WebElements.MainMenu_WebElements.Management_button;
import static site.Data.WebElements.Operation_CV.HomeButtonOnJobMenu;

/**
 * Created by Lena on 11.11.2019.
 */
public class SurveyInventory extends TestBase {
    LocalTime date = LocalTime.now();
   // int date=2323;
    public DataProviders.Materials existMaterialsPackType;
    DataProviders.Materials existMaterialsPackType1;
    DataProviders.Materials existMaterialsCrate;
    DataProviders.Materials existMaterialsCrate1;
    DataProviders.Materials existAssociatedMaterials;
    DataProviders.Item existItem = new DataProviders.Item("Item"+date, Item.Category.Other,5,6,
            Item.Room.Hallway1,Item.Application.Both,Item.UseFor.Both);
    DataProviders.Item existItemWithAssociatedMaterials = new DataProviders.Item("Item-AM"+date,Item.Category.Other,7,8,
            Item.Room.Hallway1,Item.Application.Both,Item.UseFor.Both);

    @Test(priority=1,dataProviderClass = DataProviders.class,dataProvider = "createMaterialsConfig")
    public void precondition1(By locatorlanguage, String FirstName,
                              DataProviders.Materials materialsPackType,
                              DataProviders.Materials materialsPackType1,DataProviders.Materials materialsCrate,
                              DataProviders.Materials materialsCrate1, DataProviders.Materials associatedMaterials) {
        app.getUserMenu_Metods().changeLanguage(locatorlanguage);
       // app.getMainMenu_Metods().ManagementScreen_Open();
        app.getUserMenu_Metods().OpenPage(Management_button, ScreensURL.Iterators);
        app.getManagementMenu_Metods().MaterialsScreen_Open();

        app.getMaterialsConfig_Methods().createNewMaterials_PakingType(
                materialsPackType.getMaterialType(), materialsPackType.getCoast(),materialsPackType.getWidth(),
                materialsPackType.getLength(), materialsPackType.getHeight(), materialsPackType.getVolume());

        app.getMaterialsConfig_Methods().createNewMaterials_PakingType(
                materialsPackType1.getMaterialType(), materialsPackType1.getCoast(),materialsPackType1.getWidth(),
                materialsPackType1.getLength(),materialsPackType1.getHeight(),materialsPackType1.getVolume());

        app.getMaterialsConfig_Methods().createNewMaterials_NotPackTypeNotCrate(
                associatedMaterials.getMaterialType(), associatedMaterials.getCoast(),associatedMaterials.getWidth(),
                associatedMaterials.getLength(),associatedMaterials.getHeight(),associatedMaterials.getVolume());

        app.getMaterialsConfig_Methods().createNewMaterials_CRATE(
                materialsCrate.getMaterialType(), materialsCrate.getCoast(), materialsCrate.getWidth(),
                materialsCrate.getLength(),materialsCrate.getHeight(),materialsCrate.getVolume());

        app.getMaterialsConfig_Methods().createNewMaterials_CRATE(
                materialsCrate1.getMaterialType(),materialsCrate1.getCoast(),materialsCrate1.getWidth(),
                materialsCrate1.getLength(),materialsCrate1.getHeight(),materialsCrate1.getVolume());

        app.getMaterialsConfig_Methods().addAssociatedMaterials(
                materialsPackType.getMaterialType(), associatedMaterials.getMaterialType(), associatedMaterials.getQuantity());
        existMaterialsPackType=materialsPackType;
        existMaterialsPackType1=materialsPackType1;
        existMaterialsCrate=materialsCrate;
        existMaterialsCrate1=materialsCrate1;
        existAssociatedMaterials=associatedMaterials;

        app.getManagementMenu_Metods().ItemsScreen_Open();
        app.getItemsConfig_Methods().createItem(existItem);
        app.getItemsConfig_Methods().createItemWithAsssociatedMaterials(existItemWithAssociatedMaterials,
                associatedMaterials.getMaterialType(),associatedMaterials.getQuantity());

    }

   @Test(priority=2,dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")
  //@Test(priority=2,dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_gblinerstest")

    public void CreateSurvey_ForExistClientFile(By locatorlanguage, String bookingType, String source, String jobType,
                                                String mode, String serviceType, String serviceLevel,
                                                String firstName, String lastName, String email, String phone,
                                                String country1, String country2, String city1, String city2,
                                                String street1, String street2, String zip1, String zip2) {

        app.getUserMenu_Metods().changeLanguage(locatorlanguage);

        app.getMainMenu_Metods().Job_GridScreen_Open();
        String client = firstName + " " + lastName;

        app.getJobGrid_Metods().openJobByClientName(client);
        app.getJobMenu_Metods().Job_SurveysScreen_Open();
        app.getSurvey_Metods().ClickOn_CreateNewSurvey_CV_button();
        app.getSurvey_Metods().ClickOn_CreateSurveyInventory_button();

        app.getSurvey_Metods().ClickOn_ModeDropdown();
        app.getSurvey_Metods().SelectModeFromDropdown(mode);
        app.getSurvey_Metods().ClickOn_RoomDropdown();
        app.getSurvey_Metods().SelectRoomFromDropdown(existItem.getRoom());
        try {
            Thread.sleep((long) 500.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        app.getSurvey_Metods().ClickOn_AddStandartItems();
        app.getSurvey_Metods().waitForElementByNOTvisibility(By.xpath("/[@class='k-overlay']"));
        app.getSurvey_Metods().SetQtyForItem_onAddItemModalWindow(existItem.getItemType(),2);
        app.getSurvey_Metods().ClickOn_SaveButton_onAddItemModalWindow();
      app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getSurvey_Metods().ClickOn_AddStandartItems();
        app.getSurvey_Metods().waitForElementByNOTvisibility(By.xpath("/[@class='k-overlay']"));
        app.getSurvey_Metods().SetQtyForItem_onAddItemModalWindow(existItemWithAssociatedMaterials.getItemType(),2);
        app.getSurvey_Metods().ClickOn_SaveButton_onAddItemModalWindow();
        System.out.println("existMaterialsPackType.getMaterialType()=" + existMaterialsPackType.getMaterialType());
        app.getSurvey_Metods().SetPackTypeForItem(existMaterialsPackType.getMaterialType());
       app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        File attachFile = new File("src/test/resources/item.png");
       app.getSurvey_Metods().attachPhotoForItem(attachFile);
        try {
            Thread.sleep((long) 500.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        app.getSurvey_Metods().checkboxPBOisTRUE();
       // app.getSurvey_Metods().OpenPageByUrl("https://mfcdev.voxme.com/SurveyInventory/SurveyInventory?surveyId=3031");
       selectRoomInTable_RoomConditionSection(existItem.getRoom());
       enterRoomNoteDetails("Details");
       clickOnCreateRommCondition();
       enterConditionBeforeDescription("before");
        app.getSurvey_Metods().attachFileByPath(By.xpath("//*[@id='roomBeforeUpload']"),attachFile);
        app.getSurvey_Metods().click(By.xpath("//*[@aria-owns=\"elementBefore_listbox\"]"));
        app.getSurvey_Metods().dropdownSelectElement("Walls",By.xpath("//ul[@id='elementBefore_listbox']/li"));
        app.getSurvey_Metods().click(By.xpath("//button[@id='addElementBefore']"));
        app.getSurvey_Metods().click(By.xpath("//div[@id='roomElementBeforeGrid']//td[contains(text(),'Walls')]"));
        app.getSurvey_Metods().attachFileByPath(By.xpath("//*[@id='roomElementBeforeUpload']"),attachFile);
        app.getSurvey_Metods().click(By.xpath("//textarea[@id='conditionAfterDescription']"));
        app.getSurvey_Metods().type(By.xpath("//textarea[@id='conditionAfterDescription']"),"conditionAfterDescription");
        app.getSurvey_Metods().attachFileByPath(By.xpath("//input[@id='roomAfterUpload']"),attachFile);

        app.getSurvey_Metods().click(By.xpath("//div[@id='roomElementAfterGrid']//td[contains(text(),'Walls')]"));
        app.getSurvey_Metods().attachFileByPath(By.xpath("//*[@id='roomElementAfterUpload']"),attachFile);


//button[@id='createRoomBeforePhoto']




        app.getMainMenu_Metods().click(HomeButtonOnJobMenu);

    }

    private void enterConditionBeforeDescription(String before) {
        app.getSurvey_Metods().click(By.xpath("//textarea[@id='conditionBeforeDescription']"));
        app.getSurvey_Metods().type(By.xpath("//textarea[@id='conditionBeforeDescription']"),"before");
    }

    private void clickOnCreateRommCondition() {
        app.getSurvey_Metods().click(By.xpath("//button[@id='createRoomConditions']"));
        app.getSurvey_Metods().waitForElementByLeavingDOM(By.id("spinner-roomDetails"));
    }

    private void enterRoomNoteDetails(String details) {
        app.getSurvey_Metods().click(By.xpath("//textarea[@id='roomNoteDetails']"));
        app.getSurvey_Metods().type(By.xpath("//textarea[@id='roomNoteDetails']"),"Details");
    }

    private void selectRoomInTable_RoomConditionSection(String room) {
        app.getSurvey_Metods().click(By.xpath("//table[contains(@class,'js-rooms-content k-selectable')]//tr//td[contains(text(),'"+existItem.getRoom()+"')]"));
    }


}

 /* List<WebElement> langList = app.getSurvey_Metods().getList_byLocator(By.xpath("//table[@class='js-items-content k-selectable']//tr"));
        float res = 0;
        for (int i = 1; i <= langList.size(); i++) {
            System.out.println(app.getSurvey_Metods().getExistText(By.xpath("//table[@class='js-items-content k-selectable']//tr[" + i + "]//td[4]")));
            String s = app.getSurvey_Metods().getExistText(By.xpath("//table[@class='js-items-content k-selectable']//tr[" + i + "]//td[4]"));
            res = res + Float.parseFloat(s);
        }
        System.out.println("res="+res);*/