package site.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import site.tests.TestManager.TestBase;

/**
 * Created by Lena on 22.10.2019.
 */
public class Relo extends TestBase {
    @BeforeClass
    public void Precondition(){
        Integer row1 =(int)(Math.random()*8)+1;
        String row = String.valueOf(row1);
        System.out.print(row);
        app.getOperationsCV_metods().create_Relo(row);

    }

    @Test
    public void addRresource_Staff() {

        app.getRelo_Metods().clickOnAddStaff_button();
        app.getRelo_Metods().selectStaffFromDropdownInPopup();
        app.getRelo_Metods().clickOnAddButtonOnAddStaffPopup();
        app.getRelo_Metods().selectStaffInStaffGrid();
        app.getRelo_Metods().clickOnStaffTime_button();
        app.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getRelo_Metods().clickOnStaffImportToExpenseButton();

    }
    @Test
    public void addRresource_Vehicles() {
        app.getRelo_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        app.getRelo_Metods().selectVehicleFromDropdownInPopup();
        app.getRelo_Metods().clickOnAddButtonOnAddVehiclePopup();
        app.getRelo_Metods().selectVehicleInVehiclesGrid();
        app.getRelo_Metods().clickOnVehicleTime_button();
        app.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getRelo_Metods().clickOnVehicleImportToExpenseButton();
    }

    @Test
    public void addRresource_Equipment() {
        app.getRelo_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        app.getRelo_Metods().selectEquipmentFromDropdownInPopup();
        app.getRelo_Metods().clickOnAddButtonOnAddEquipmentPopup();
        app.getRelo_Metods().selectEquipmentInEquipmentsGrid();
        app.getRelo_Metods().clickOnEquipmentTime_button();
        app.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        app.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        app.getRelo_Metods().clickOnEquipmentImportToExpenseButton();
    }




}
