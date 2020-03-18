package site.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.testng.annotations.*;

import java.io.File;
import java.util.*;

import site.Data.WebElements.SurveyInventory_WebElements;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

import java.util.List;

import static site.Data.WebElements.Inventory_WebElements.*;
import static site.Data.WebElements.MainMenu_WebElements.MainMenu_List;



public class Inventory extends TestBase {

   // @BeforeTest
    public void Precondition() {
        app.getLoginScreen_Metods().login("testuser4", "testuser4");


    }

   @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient")


    public void CreateClientFile_PrivateBookingTypeNewClient(By locatorlanguage, String bookingType,String source, String jobType, String mode, String serviceType,
                                                             String serviceLevel,String firstName, String lastName, String email, String phone,
                                                             String country1, String country2, String city1, String city2, String street1, String street2,
                                                             String zip1, String zip2){
       String item ="Table";
       File attachFile = new File("src/test/resources/item.png");

       app.getUserMenu_Metods().changeLanguage(locatorlanguage);
       app.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));
       app.getMainMenu_Metods().Job_GridScreen_Open();
        String client = firstName + " " + lastName;
       app.getJobGrid_Metods().openJobByClientName(client);
       app.getJobMenu_Metods().Job_InventoryScreen_Open();
       app.getInventory_Methods().clickOninitializeInventoryButton();
       app.getInventory_Methods().addPiece();
       app.getInventory_Methods().selectAddedPieces();
       app.getInventory_Methods().inputItem(item);
       app.getInventory_Methods().createCommentForItem(item,"Item comment");
       app.getInventory_Methods().attachPhotoForItem(item);



       app.getInventory_Methods().selectRoomInTable_RoomConditionSection();
       app.getInventory_Methods().clickOnCreateRommCondition();
       app.getInventory_Methods().enterRoomNoteDetails("Room Details_1");
       app.getInventory_Methods().enterConditionBeforeDescription("before_1");
       app.getInventory_Methods().attachFileByPath(uploadButton_roomBefore,attachFile);
       app.getInventory_Methods().addElementBeforeCondition("Walls");
       app.getInventory_Methods().attachPhotoElementBefore("Walls",attachFile);
       app.getInventory_Methods().enterConditionAfterDescription("conditionAfterDescription");
       app.getInventory_Methods().attachFileByPath(By.xpath("//input[@id='roomAfterUpload']"),attachFile);
       app.getInventory_Methods().attachPhotoElementAfter("Walls", attachFile);
       app.getSurvey_Metods().ReturnToJob_Grid();

    }


}

// app.getInventory_Methods().OpenPageByUrl("https://mfcdev.voxme.com/PackingInventory/Inventory?clientFileId=4388&jobId=5007");
// app.getInventory_Methods().deleteAllPieces();



     /*  while(app.getInventory_Methods().isElementPresent(By.xpath("//div[@id='roomElementBeforeGrid']//tbody//tr"))){
           app.getInventory_Methods().click(By.xpath("//div[@id='roomElementBeforeGrid']//tbody//tr"));
           app.getInventory_Methods().waitForElementByVisibility(By.xpath("//button[@id='deleteElementBefore']"));
           app.getInventory_Methods().click(By.xpath("//button[@id='deleteElementBefore']"));
       }*/
