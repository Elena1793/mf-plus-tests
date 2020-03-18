package site.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import site.Data.WebElements.*;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

import static site.Data.Resources.GlobalResources.ScreensURL.Job_Grid;

/**
 * Created by user on 20.05.2019.
 */
public class CheckMenu extends TestBase implements UserMenu_WebElements, MainMenu_WebElements, ManagementScreen_WebElements,JobMenu_WebElements {


    @Test(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")

    public void checkManagementMenu(By locatorlanguage) {

        app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        Assert.assertTrue(app.getUserMenu_Metods().Check_changeLanguage(locatorlanguage, MainMenu_List));


        app.getMainMenu_Metods().ManagementScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().ReportsGlobalScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().ReportsClientScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().SuppliersScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().AgentsScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().ClientsScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().ResourcesScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().MaterialsScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().ExchangeRatesScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().TasksScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().click(By.xpath("//a[contains(text(),'Quote types')]"));
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().OfficeStaffScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().UsersScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().RolesScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().ItemsScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().ResidenceSettingsScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().OtherSettingsScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().CompanyStructureScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().NotificationConfigScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().DictionaryScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().LeadsScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().Questions_and_servicesScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().StatusesScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().DocumentsScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().Offered_servicesScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().Billable_servicesScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getManagementMenu_Metods().Licenses_servicesScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getMainMenu_Metods().ManagementScreen_Open();
    }

    @Test (dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")

    public void checkMainMenu(By locatorlanguage) {
        app.getUserMenu_Metods().OpenPageByUrl(Job_Grid);
        app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        Assert.assertTrue(app.getUserMenu_Metods().Check_changeLanguage(locatorlanguage, MainMenu_List));

        app.getMainMenu_Metods().ClickOn_Surveys_button();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getMainMenu_Metods().FinancialsScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getMainMenu_Metods().Opportunity_GridScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getMainMenu_Metods().Warehouse_GridScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getMainMenu_Metods().Transactions_GridScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getMainMenu_Metods().ClickOn_Quotation_button();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getMainMenu_Metods().Shipments_GridScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getMainMenu_Metods().Tasks_GridScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getMainMenu_Metods().DailyAgendaScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getMainMenu_Metods().Job_GridScreen_Open();


    }

    @Test (dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")

    public void checkJobMenu(By locatorlanguage) {
        app.getUserMenu_Metods().OpenPageByUrl(Job_Grid);
        app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        Assert.assertTrue(app.getUserMenu_Metods().Check_changeLanguage(locatorlanguage, MainMenu_List));

       // app.getMainMenu_Metods().Job_GridScreen_Open();

        app.getMainMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        app.getJobMenu_Metods().click(By.xpath("//tr[1]/td[1]/a[1]"));
        app.getJobMenu_Metods().Job_SummaryScreen_Open();

        Assert.assertTrue(app.getUserMenu_Metods().Check_changeLanguage(locatorlanguage, Job_Menu_list));

        app.getJobMenu_Metods().Job_TasksScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getJobMenu_Metods().Job_DocumentsScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getJobMenu_Metods().Job_CommunicationHistoryScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getJobMenu_Metods().Job_SurveysScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getJobMenu_Metods().Job_QuotationsScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getJobMenu_Metods().Job_ShipmentsScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getJobMenu_Metods().Job_OperationsScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getJobMenu_Metods().Job_InventoryScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getJobMenu_Metods().Job_ExpensesScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getJobMenu_Metods().Job_InvoicesScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getJobMenu_Metods().Job_WarehouseScreen_Open();
        app.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        app.getJobMenu_Metods().Job_SatisfactionSurveyScreen_Open();

        app.getJobMenu_Metods().ReturnToJob_Grid();

    }

}

