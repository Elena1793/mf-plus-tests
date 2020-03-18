package site.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import site.Data.WebElements.JobSummary_WebElements;
import site.Data.WebElements.MainMenu_WebElements;
import site.Data.WebElements.UserMenu_WebElements;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

import static site.Data.Resources.GlobalResources.ScreensURL.Job_Grid;


/**
 * Created by user on 13.05.2018.
 */
public class CreateFileTests extends TestBase implements UserMenu_WebElements, MainMenu_WebElements {


       // @BeforeTest
        public void Precondition(){
            app.getLoginScreen_Metods().login("testuser4","testuser4");

        }


   @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient")
  //  @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_gblinerstest")

         public void createFile (By locatorlanguage, String bookingType,String source, String jobType, String mode, String serviceType,
                                 String serviceLevel,String firstName, String lastName, String email, String phone,
                                 String country1, String country2, String city1, String city2, String street1, String street2,
                                 String zip1, String zip2){

            app.getUserMenu_Metods().changeLanguage(locatorlanguage);
       app.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));


                Assert.assertTrue(app.getUserMenu_Metods().Check_changeLanguage(locatorlanguage, MainMenu_List));
            app.getMetodsCreateFile().CreateFile_NewClient(source, jobType, mode, serviceType, serviceLevel,
                        firstName, lastName, email, phone);
                Assert.assertEquals(app.getMetodsCreateFile().getExistText(JobSummary_WebElements.Mode_field),mode,"Mode_field: ");
                Assert.assertEquals(app.getMetodsCreateFile().getExistText(JobSummary_WebElements.JobType_field),jobType,"JobType_field: ");
                Assert.assertEquals(app.getMetodsCreateFile().getExistText(JobSummary_WebElements.ServiceType_field),serviceType,"ServiceType_field: ");
                Assert.assertEquals(app.getMetodsCreateFile().getExistText(JobSummary_WebElements.ServiceLevel_field),serviceLevel,"ServiceLevel_field: ");
                Assert.assertEquals(app.getMetodsCreateFile().getExistText(JobSummary_WebElements.Shipper_Field_FromSection),firstName+" "+lastName,"Shipper_Field: ");
                Assert.assertEquals(app.getMetodsCreateFile().getExistText(JobSummary_WebElements.ShipperEmail_DetailsSection),email,"ShipperEmail: ");
                Assert.assertEquals(app.getMetodsCreateFile().getExistText(JobSummary_WebElements.ShipperMobilePhone_DetailsSection),phone,"ShipperHomePhone: ");
      //  app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
                app.getAddressDetails_Metods().waitForElementByNOTvisibility(By.xpath("//[@class=\"popup-wrapper properties-wrapper\"]"));
            app.getAddressForm_Metods().createNewAddtess("from",country1, city1, street1, zip1);
            app.getJobMenu_Metods().ReturnToJob_Grid();
           // app.getJobSummary_Metods().createNewAddtess();

        //  app.getAddressForm_Metods().createNewAddtess("to",country2, city2, street2, zip2);


         }




    }



