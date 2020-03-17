package site.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import site.tests.TestManager.TestBase;

/**
 * Created by user on 21.05.2018.
 */
public class ReportsGlobalScreen_Test extends TestBase {
 //   @BeforeTest
    public void Precondition(){
        app.getLoginScreen_Metods().login("testuser4","testuser4");

    }

 //   @Test(priority = 1)
    public void ReportsGlobalScreenMenu(){
         app.getLoginScreen_Metods().login("testuser4","testuser4");
         app.getMainMenu_Metods().ManagementScreen_Open();
         app.getReportsGlobal_Metods().EnvelopesScreen_Open();
         app.getReportsGlobal_Metods().IteratorsScreen_Open();
         app.getReportsGlobal_Metods().TablesScreen_Open();
         app.getReportsGlobal_Metods().VariablesScreen_Open();
    }

}
