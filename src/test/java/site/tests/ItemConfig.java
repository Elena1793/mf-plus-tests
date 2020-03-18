package site.tests;


import org.testng.annotations.Test;
import site.tests.TestManager.TestBase;

/**
 * Created by Lena on 21.11.2019.
 */
public class ItemConfig extends TestBase {

    @Test(priority = 1)
    public void createItem (){
        app.getMainMenu_Metods().ManagementScreen_Open();
        app.getManagementMenu_Metods().ItemsScreen_Open();
        app.getItemsConfig_Methods().clickOnAddNewItem_button();
        app.getItemsConfig_Methods().enterItem("Item15");
        app.getItemsConfig_Methods().selectItemCategory("Others");
        app.getItemsConfig_Methods().enterVolumeItem(5);
        app.getItemsConfig_Methods().enterWeightItem(6);
        app.getItemsConfig_Methods().chooseRoom("Hallway");
        app.getItemsConfig_Methods().setAplicationField("Both");
        app.getItemsConfig_Methods().setUseForField("Both");
        app.getItemsConfig_Methods().clickOnSaveAddedItem_button();


    }
    @Test(priority = 2)
    public void addAssociatedMaterialsForItem(){
        app.getItemsConfig_Methods().chooseItem_inItemsGrid("Item15");
        app.getItemsConfig_Methods().clickOnAddAssociatedMaterials_button();
        app.getItemsConfig_Methods().selectMaterialFrom_MaterialsDropdown_InAssociatedMaterialsGrid("test");
        app.getItemsConfig_Methods().enterQuantityForAssociatedMaterial(2);
        app.getItemsConfig_Methods().saveAddedAssociatedMaterial_button();
    }
}
