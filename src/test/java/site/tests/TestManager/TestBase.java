package site.tests.TestManager;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import site.framework.ApplicationManager.ApplicationManager;
import site.Data.Resources.GlobalResources.Version;
import site.Data.Resources.GlobalResources.MainPageType;

import static site.Data.WebElements.UserMenu_WebElements.*;


public class TestBase{
By locatorlanguage = English_language;

    protected final ApplicationManager app =
            new ApplicationManager(BrowserType.CHROME, Version.development, MainPageType.Management,locatorlanguage);
    @BeforeClass
    public void setUp() throws Exception {
        app.init();
        app.getLoginScreen_Metods().login("testuser4", "Testuser44");
       // app.getUserMenu_Metods().changeLanguage(locatorlanguage);
    }
  /* protected final ApplicationManager app =
           new ApplicationManager(BrowserType.CHROME, Version.development, MainPageType.Job_Grid,locatorlanguage);
    @BeforeClass
    public void setUp() throws Exception {
        app.init();
        app.getLoginScreen_Metods().login("gblinerstest1", "Gblinerstest1");
       // app.getUserMenu_Metods().changeLanguage(locatorlanguage);
    }*/

   /* @AfterTest
    public void tearDown() {


        app.stop();
    }*/



}
