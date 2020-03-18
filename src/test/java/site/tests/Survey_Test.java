package site.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;
import static site.Data.Resources.Source.Google;


public class Survey_Test extends TestBase {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")
    //dependsOnMethods - if methods failed current Test wouldn't run

    public void CreateSurvey_ForExistClientFile(By locatorlanguage, String bookingType,String source, String jobType,
                                                String mode, String serviceType, String serviceLevel,
                                                String firstName, String lastName, String email, String phone,
                                                String country1, String country2, String city1, String city2,
                                                String street1, String street2, String zip1, String zip2) {

        app.getUserMenu_Metods().changeLanguage(locatorlanguage);
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
        app.getSurvey_Metods().click(By.xpath("//input[@id='newPartyName']"));
        app.getSurvey_Metods().type(By.xpath("//input[@id='newPartyName']"), "test");
        app.getSurvey_Metods().type(By.xpath("//input[@id='newPersonFirstName']"), "first");
        app.getSurvey_Metods().type(By.xpath("//input[@id='newPersonLastName']"), "last");
        app.getSurvey_Metods().type(By.xpath("//input[@id='newPersonEmail']"), "email@eee.net");
        app.getSurvey_Metods().type(By.xpath("//input[@id='newPersonPhone']"), "3535353");
        app.getSurvey_Metods().click(By.xpath("//button[@id='saveNewParty']"));
    }
}