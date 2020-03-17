package site.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import site.tests.TestManager.DataProviders;
import site.tests.TestManager.TestBase;

/**
 * Created by Lena on 20.11.2019.
 */
public class MaterialsConfig extends TestBase {

    @Test(priority=1,dataProviderClass = DataProviders.class,dataProvider = "createMaterialsConfig")
    public void createMateria_PackType(By locatorlanguage, String FirstName,
                                       DataProviders.Materials materialsPackType,
                                       DataProviders.Materials materialsPackType1,DataProviders.Materials materialsCrate,
                                       DataProviders.Materials materialsCrate1, DataProviders.Materials associatedMaterials) {
        app.getMainMenu_Metods().ManagementScreen_Open();
        app.getManagementMenu_Metods().MaterialsScreen_Open();
        app.getMaterialsConfig_Methods().clickOnAddMaterials_button();
        app.getMaterialsConfig_Methods().enterMaterialsType(materialsPackType.getMaterialType());
        app.getMaterialsConfig_Methods().enterCostMaterials(materialsPackType.getCoast());
        app.getMaterialsConfig_Methods().enterWidthMaterials(materialsPackType.getWidth());
        app.getMaterialsConfig_Methods().enterLengthMaterials(materialsPackType.getLength());
        app.getMaterialsConfig_Methods().enterHeightMaterials(materialsPackType.getHeight());
        app.getMaterialsConfig_Methods().enterVolumeMaterials(materialsPackType.getVolume());
        app.getMaterialsConfig_Methods().trueIsPackingType_checkbox();
        app.getMaterialsConfig_Methods().saveCreatedMaterials();

    }
    @Test(priority=2,dataProviderClass = DataProviders.class,dataProvider = "createMaterialsConfig")
    public void createMaterials_Crate(By locatorlanguage, String FirstName,
                                      DataProviders.Materials materialsPackType,
                                      DataProviders.Materials materialsPackType1,DataProviders.Materials materialsCrate,
                                      DataProviders.Materials materialsCrate1, DataProviders.Materials associatedMaterials) {
        app.getMainMenu_Metods().ManagementScreen_Open();
        app.getManagementMenu_Metods().MaterialsScreen_Open();
        app.getMaterialsConfig_Methods().clickOnAddMaterials_button();
        app.getMaterialsConfig_Methods().enterMaterialsType(materialsCrate.getMaterialType());
        app.getMaterialsConfig_Methods().enterCostMaterials(materialsCrate.getCoast());
        app.getMaterialsConfig_Methods().enterWidthMaterials(materialsCrate.getWidth());
        app.getMaterialsConfig_Methods().enterLengthMaterials(materialsCrate.getLength());
        app.getMaterialsConfig_Methods().enterHeightMaterials(materialsCrate.getHeight());
        app.getMaterialsConfig_Methods().enterVolumeMaterials(materialsCrate.getVolume());
        app.getMaterialsConfig_Methods().trueIsCrate_checkbox();
        app.getMaterialsConfig_Methods().saveCreatedMaterials();

    }
    @Test(priority=3,dataProviderClass = DataProviders.class,dataProvider = "createMaterialsConfig")
    public void addAssociatedMaterialsForMaterial(By locatorlanguage, String FirstName,
                                                  DataProviders.Materials materialsPackType,
                                                  DataProviders.Materials materialsPackType1,DataProviders.Materials materialsCrate,
                                                  DataProviders.Materials materialsCrate1, DataProviders.Materials associatedMaterials) {
        app.getMainMenu_Metods().ManagementScreen_Open();
        app.getManagementMenu_Metods().MaterialsScreen_Open();
        app.getMaterialsConfig_Methods().clickOnAddMaterials_button();
        app.getMaterialsConfig_Methods().enterMaterialsType(associatedMaterials.getMaterialType());
        app.getMaterialsConfig_Methods().enterCostMaterials(associatedMaterials.getCoast());
        app.getMaterialsConfig_Methods().enterWidthMaterials(associatedMaterials.getWidth());
        app.getMaterialsConfig_Methods().enterLengthMaterials(associatedMaterials.getLength());
        app.getMaterialsConfig_Methods().enterHeightMaterials(associatedMaterials.getHeight());
        app.getMaterialsConfig_Methods().enterVolumeMaterials(associatedMaterials.getVolume());
        app.getMaterialsConfig_Methods().saveCreatedMaterials();

        app.getMaterialsConfig_Methods().chooseMaterial_inMaterialsGrid(materialsPackType.getMaterialType());
        app.getMaterialsConfig_Methods().clickOnAddAssociatedMaterials_button();
        app.getMaterialsConfig_Methods().selectMaterialIn_MaterialsDropdown_InAssociatedMaterialsGrid(associatedMaterials.getMaterialType());
        app.getMaterialsConfig_Methods().enterQuantityForAssociatedMaterial(associatedMaterials.getQuantity());
        app.getMaterialsConfig_Methods().saveAddedAssociatedMaterial_button();

    }
}
