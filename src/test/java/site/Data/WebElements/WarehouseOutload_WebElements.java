package site.Data.WebElements;

import org.openqa.selenium.By;

/**
 * Created by Lena on 10.11.2019.
 */
public interface WarehouseOutload_WebElements {

    By AddStaff_button_StaffGrid =By.xpath("//button[@id='staffAdd']");
    By StaffDropdownField = By.xpath("//div[@class='popup__content']//div[@class='form__group']//div[@class='k-multiselect-wrap k-floatwrap']");
    By StaffElementInStaffDropdown= By.xpath("//ul[@id='resources_listbox']/li[@data-offset-index='0']");


    By AddButtonOnAddStaffPopUp = By.xpath("//button[@id='addResource']");
    By StaffElementInStaffGrid=By.xpath("//div[@id='staffGrid']//div[@class='k-grid-content']//tr");
    By StaffTimeButtonOnStaffGrid = By.xpath("//button[@id='staffTime']");
    By AddTimeSheetButtonInTimesSheetWindow =By.xpath("//button[@id='timeSheetsAdd']");
    By CloseButtonOnTimesSheetWindow=By.xpath("//a[@class='btn btn_sm btn__cancel k-button timesheetClose']");
    By StaffImportToExpenseButton= By.xpath("//button[@id='staffImportToExpense']");
}
