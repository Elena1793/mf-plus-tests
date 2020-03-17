package site.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import site.Data.Resources.BookingType;
import site.Data.WebElements.Booking_Webelements;
import site.Data.WebElements.JobSummary_WebElements;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

import java.util.List;

import static site.Data.WebElements.MainMenu_WebElements.MainMenu_List;
/**
 * Created by user on 23.05.2019.
 */
public class QutationTests extends TestBase {

   // @BeforeTest
    public void Precondition(){
        app.getLoginScreen_Metods().login("testuser4","testuser4");

    }
    @Test(dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")

  //  @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_gblinerstest")
    public void CreateQutation_forExisted_ClientFile(By locatorlanguage, String bookingType,String source, String jobType,String mode, String serviceType, String serviceLevel,
                                                     String firstName, String lastName, String email, String phone, String country1, String country2,
                                                     String city1, String city2,String street1, String street2,String zip1, String zip2)
            throws Exception {


        app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        app.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));
        /*app.getMainMenu_Metods().Job_GridScreen_Open();
        app.getMainMenu_Metods().click(By.xpath("//span[@class='k-input'][contains(text(),'10')]"));
        app.getJobMenu_Metods().click(By.xpath("//div[@class='k-animation-container']//ul//li[contains(text(),'20')]"));*/

        String client = firstName + " " + lastName;
        String ClientFileNum = app.getJobSummary_Metods().getClientFileNum1byClientName(client);
        app.getMainMenu_Metods().ClickOn_Quotation_button();
        app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        //app.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));
        app.Quotation_metods().ClickOn_CreateQutationSA_button();
       // app.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));
        app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getBookingSection_Metods().Select_BookingType(bookingType);

        app.Quotation_metods().Select_source(source);

        app.Quotation_metods().ClickOn_Client_Field();
        app.Quotation_metods().Select_Client(client);
        app.Quotation_metods().ClickOn_ClientFile_Field();
        app.Quotation_metods().Select_ClientFile(ClientFileNum);

        app.Quotation_metods().ClickOn_JobRef_Field();
        app.Quotation_metods().ClickOn_DeselectAll_JobRef();
        app.Quotation_metods().ClickOn_confirmToStandalone_button();
        app.Quotation_metods().ReturnToJob_Grid();

    }

   // @Test(dependsOnMethods = "CreateQutation_forExisted_ClientFile")

    public void CreateQutation_SA_whichHadClientFile(){

        app.Quotation_metods().ClickOn_JobRef_Field();
        app.Quotation_metods().ClickOn_DeselectAll_JobRef();
        app.Quotation_metods().ClickOn_confirmToStandalone_button();
        app.Quotation_metods().ReturnToJob_Grid();
    }


}





