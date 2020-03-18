package site.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import site.Data.WebElements.JobSummary_WebElements;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

import static site.Data.Resources.Source.Google;
import static site.Data.WebElements.MainMenu_WebElements.MainMenu_List;


public class Survey_Test extends TestBase {
    //  @BeforeTest
    public void Precondition() {
        app.getLoginScreen_Metods().login("testuser4", "testuser4");
    }



    @Test(dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")
    //dependsOnMethods - if methods failed current Test wouldn't run

    public void CreateSurvey_ForExistClientFile(By locatorlanguage, String bookingType,String source, String jobType,
                                                String mode, String serviceType, String serviceLevel,
                                                String firstName, String lastName, String email, String phone,
                                                String country1, String country2, String city1, String city2,
                                                String street1, String street2, String zip1, String zip2) {
        app.getUserMenu_Metods().changeLanguage(locatorlanguage);

      /* app.getMetodsCreateFile().CreateFile_NewClient(source, jobType, mode, serviceType, serviceLevel,
               firstName, lastName, email, phone);*/

        String client = firstName + " " + lastName;
        String ClientFileNum = app.getJobSummary_Metods().getClientFileNum1byClientName(client);

        app.getMainMenu_Metods().ClickOn_Surveys_button();
        app.getSurvey_Metods().ClickOn_CreateSurveySA_button();
        app.getBookingSection_Metods().Select_Source(source);
        app.getSurvey_Metods().ClickOn_Client_Field();
        app.getSurvey_Metods().Select_Client(client);
        app.getSurvey_Metods().ClickOn_ClientFile_Field();
        app.getSurvey_Metods().Select_ClientFile(ClientFileNum);

        app.getSurvey_Metods().ClickOn_JobRef_Field();
        app.getSurvey_Metods().ClickOn_DeselectAll_JobRef();
        app.getSurvey_Metods().ClickOn_confirmToStandalone_button();
        app.getSurvey_Metods().ReturnToJob_Grid();

        //app.getSurvey_Metods().click(By.xpath("//a[@*='/Survey/Grid']"));
        /*app.getSurvey_Metods().type(By.xpath("//input[@id='SurveyDetails']"),ClientFileNum);
        app.getSurvey_Metods().click(By.xpath("//button[@id='filterBtn']"));
        app.getSurvey_Metods().click(By.xpath("//td[1]/a"));*/
    }

    // @Test(dependsOnMethods = "CreateSurvey_ForExistClientFile")

    public void CreateSurveySA_FromSurveyOfClientFile() {

        app.getSurvey_Metods().ClickOn_JobRef_Field();
        app.getSurvey_Metods().ClickOn_DeselectAll_JobRef();
        app.getSurvey_Metods().ClickOn_confirmToStandalone_button();
        app.getSurvey_Metods().ReturnToJob_Grid();
    }

    //  @Test

    public void CreateSurveySA_NewClient() {

        app.getMainMenu_Metods().ClickOn_Surveys_button();
        app.getSurvey_Metods().ClickOn_CreateSurveySA_button();
        app.getBookingSection_Metods().Select_Source(Google);
        app.getSurvey_Metods().waitForElementByLeavingDOM(By.id("spinner-js-header"));
        app.getSurvey_Metods().click(By.xpath("//button[@id='clientPlus']"));
        //app.getSurvey_Metods().waitForElementByLeavingDOM(By.xpath("//div[@class='k-overlay'][@style = 'display: none; z-index: 10002; opacity: 0;']"));
//By.xpath("//div[@class='k-overlay'][@style = 'display: block; z-index: 10002; opacity: 0.5;']")

        app.getSurvey_Metods().click(By.xpath("//input[@id='newPartyName']"));
        app.getSurvey_Metods().type(By.xpath("//input[@id='newPartyName']"), "test");
        app.getSurvey_Metods().type(By.xpath("//input[@id='newPersonFirstName']"), "first");
        app.getSurvey_Metods().type(By.xpath("//input[@id='newPersonLastName']"), "last");
        app.getSurvey_Metods().type(By.xpath("//input[@id='newPersonEmail']"), "email@eee.net");
        app.getSurvey_Metods().type(By.xpath("//input[@id='newPersonPhone']"), "3535353");
        app.getSurvey_Metods().click(By.xpath("//button[@id='saveNewParty']"));
    }
}