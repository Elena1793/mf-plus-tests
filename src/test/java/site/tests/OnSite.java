package site.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import site.Data.WebElements.OnSite_WebElements;
import site.tests.TestManager.TestBase;

/**
 * Created by Lena on 22.10.2019.
 */
public class OnSite extends TestBase {
    @BeforeClass
    public void Precondition(){
        Integer row1 =(int)(Math.random()*8)+1;
        String row = String.valueOf(row1);
        System.out.print(row);
        app.getOperationsCV_metods().create_OnSite(row);

    }

    @Test
    public void addRresource_Staff() {

        app.getOnSite_Metods().clickOnAddStaff_button();
        app.getOnSite_Metods().selectStaffFromDropdownInPopup();
        app.getOnSite_Metods().clickOnAddButtonOnAddStaffPopup();
        app.getOnSite_Metods().selectStaffInStaffGrid();
        app.getOnSite_Metods().clickOnStaffTime_button();
        app.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getOnSite_Metods().clickOnStaffImportToExpenseButton();

    }
    @Test
    public void addRresource_Vehicles() {
        app.getOnSite_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        app.getOnSite_Metods().selectVehicleFromDropdownInPopup();
        app.getOnSite_Metods().clickOnAddButtonOnAddVehiclePopup();
        app.getOnSite_Metods().selectVehicleInVehiclesGrid();
        app.getOnSite_Metods().clickOnVehicleTime_button();
        app.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getOnSite_Metods().clickOnVehicleImportToExpenseButton();
    }

    @Test
    public void addRresource_Equipment() {
        app.getOnSite_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        app.getOnSite_Metods().selectEquipmentFromDropdownInPopup();
        app.getOnSite_Metods().clickOnAddButtonOnAddEquipmentPopup();
        app.getOnSite_Metods().selectEquipmentInEquipmentsGrid();
        app.getOnSite_Metods().clickOnEquipmentTime_button();
        app.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getOnSite_Metods().clickOnEquipmentImportToExpenseButton();
    }




}
