package site.tests;

import org.testng.annotations.Test;
import site.tests.TestManager.TestBase;


public class LoginTests extends TestBase {




   // @Test(priority = 2)
    public  void loginTestValid(){
        app.getLoginScreen_Metods().login("testuser4", "testuser4");





    }



}
