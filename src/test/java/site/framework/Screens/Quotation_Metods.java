package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import site.Data.Resources.BookingType;
import site.Data.Resources.GlobalResources.ScreensURL;
import site.Data.WebElements.*;
import site.framework.ApplicationManager.BasisMetods;

import static site.Data.WebElements.JobMenu_WebElements.Job_Home_button;

/**
 * Created by user on 15.07.2018.
 */
public class Quotation_Metods extends BasisMetods {

    public Quotation_Metods(WebDriver wd) {

        super(wd);
    }

    public void CreateQuotationSA_BookingType_Private(String bookingType, String source, String client, String JobRef){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        OpenPage(MainMenu_WebElements.Quotations_button, ScreensURL.Quotation_Grid);
        click(QuotationGrid_WebElements.CreateQuotation_button);
        waitForElementByNOTvisibility(By.id("page-preloader"));
        isPageOpened("Quotation");
        //  selectBookingType(bookingType);
        click(Booking_Webelements.BookingType_dropdown_button);//By.xpath("/[@aria-owns=\"bookingType_listbox\"]")
        dropdownSelectElement(bookingType,Booking_Webelements.BookingType_dropdown_List);

        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-booking"))));

        if (bookingType==BookingType.Private){
            click(Booking_Webelements.BookedSource_button);
            waitForElementByNOTvisibility(By.id("page-preloader"));
            dropdownSelectElement_withoutCheckingClickableElement(source, By.xpath("//ul[@id='source_listbox']//li"));

            (new WebDriverWait(wd, 300))
                    .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-header")))); //ожидание пока элемент исчезнет из DOM

            click(By.xpath("//*[@id='client']"));
            type(By.xpath("//*[@id='client']"),client);
            dropdownSelectElement(client,By.xpath("//ul[@id='client_listbox']/li"));

            waitForElementByNOTvisibility(By.id("clientErrorWrapper"));
            click(By.xpath("//*[@aria-owns='clientFile_listbox']"));
            type(By.xpath("//*[@class='k-animation-container']//*[@class='k-textbox']"),JobRef);
            dropdownSelectElement_withoutCheckingClickableElement(JobRef, QuotationDetails_WebElements.ClientFile_dropdown_list);

            // click(By.xpath("//ul[@id='jobs_taglist']//*[@class='k-icon k-i-close']"));
        }
        if (bookingType== BookingType.Agent || bookingType==BookingType.Move_management){
            click(By.xpath("//*[@id='booker']"));
            type(By.xpath("//*[@id='booker']"),"Moscow");
            dropdownSelectElement_withoutCheckingClickableElement("Moscow", By.xpath("//ul[@id='booker_listbox']//li"));
            (new WebDriverWait(wd, 300))
                    .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-header"))));

            click(By.xpath("//*[@id='client']"));
            type(By.xpath("//*[@id='client']"),client);
            dropdownSelectElement(client,By.xpath("//ul[@id='client_listbox']/li"));
        }
        if (bookingType == BookingType.Corporate || bookingType==BookingType.Corporate_competitive || bookingType==BookingType.Commercial){
            click(By.id("account"));
            type(By.id("account"),"ES_Account1" );
            dropdownSelectElement_withoutCheckingClickableElement("ES_Account1", By.xpath("//ul[@id='account_listbox']//li"));

            click(Booking_Webelements.BookedSource_button);
            waitForElementByNOTvisibility(By.id("page-preloader"));
            dropdownSelectElement_withoutCheckingClickableElement(source, By.xpath("//ul[@id='source_listbox']//li"));

        }



    }


    public void ClickOn_CreateQutationSA_button(){


        click(QuotationGrid_WebElements.CreateQuotation_button);

        waitForElementByNOTvisibility(By.id("page-preloader"));
        isPageOpened("Quotation/Grid");
    }

    public void ClickOn_Client_Field(){
        /*(new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-header"))));*/ //ожидание пока элемент исчезнет из DOM
        waitForElementByLeavingDOM(By.id("spinner-js-header"));
        click(By.xpath("//*[@id='client']"));
    }

    public void Select_Client(String client){
        type(By.xpath("//*[@id='client']"),client);
        dropdownSelectElement(client,By.xpath("//ul[@id='client_listbox']/li"));

    }

    public void ClickOn_ClientFile_Field(){
        waitForElementByNOTvisibility(By.id("clientErrorWrapper"));
        click(By.xpath("//*[@aria-owns='clientFile_listbox']"));
    }

    public void Select_ClientFile(String JobRef){
        type(By.xpath("//*[@class='k-animation-container']//*[@class='k-textbox']"),JobRef);
        dropdownSelectElement_withoutCheckingClickableElement(JobRef, QuotationDetails_WebElements.ClientFile_dropdown_list);
    }

    public void ClickOn_JobRef_Field(){
        checkLoadingElementBySpinner(By.id("spinner-js-properties"));
        click(By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']"));
    }
    public void ClickOn_DeselectAll_JobRef(){
        click(By.xpath("//div[@class=\"k-animation-container\"]//button[@id='deselectAllButton']"));
    }
    public void ClickOn_confirmToStandalone_button(){
        waitForElementByNOTvisibility(By.xpath("//*[@//class='k-overlay']"));
        click(By.xpath("//button[@id='confirmToStandalone']"));
    }

    public void ClickOn_toStandaloneWindowClose(){
        waitForElementByNOTvisibility(By.xpath("/[@//class=\"k-overlay\"]"));//By.xpath("/[@//class=\"k-overlay\"]")
        click(SurveyDetails_WebElements.ToStandaloneWindowClose);//By.xpath("//a[@id='toStandaloneWindowClose']")
    }
    public void ReturnToJob_Grid(){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(Job_Home_button);
        isPageOpened(ScreensURL.Job_Grid);
    }

    public void Select_source(String source){
        click(Booking_Webelements.BookedSource_button);
        waitForElementByNOTvisibility(By.id("page-preloader"));
        dropdownSelectElement_withoutCheckingClickableElement(source, By.xpath("//ul[@id='source_listbox']//li"));
    }


























   /* private void selectBookingType(String bookingType){
        click(Booking_Webelements.BookingType_dropdown_button);//By.xpath("/*//*[@aria-owns=\"bookingType_listbox\"]")
        dropdownSelectElement(bookingType,Booking_Webelements.BookingType_dropdown_List);

    }

    private void selectSource (String source){
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-booking"))));

        click(Booking_Webelements.BookedSource_button);
        waitForElementBy_NOTvisibility(By.id("page-preloader"));
        dropdownSelectElement_withoutCheckingClickableElement(source, By.xpath("//ul[@id='source_listbox']//li"));
    }

    private void selectBooker (){
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-booking"))));
        click(By.xpath("/*//*[@id='booker']"));
        type(By.xpath("/*//*[@id='booker']"),ExistedData.booker);
        dropdownSelectElement_withoutCheckingClickableElement(ExistedData.booker, By.xpath("//ul[@id='booker_listbox']//li"));
    }

    private void selectAccount(){
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-booking"))));
        click(By.id("account"));
        type(By.id("account"),ExistedData.account );
        dropdownSelectElement_withoutCheckingClickableElement(ExistedData.account, By.xpath("//ul[@id='account_listbox']//li"));
    }

    private void selectClient(String client){
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-header"))));

        click(By.xpath("/*//*[@id='client']"));
        type(By.xpath("/*//*[@id='client']"),client);
        dropdownSelectElement(client,By.xpath("//ul[@id='client_listbox']/li"));

    }

    private void selectJobRef(String JobRef){
        waitForElementBy_NOTvisibility(By.id("clientErrorWrapper"));
        click(By.xpath("/*//*[@aria-owns='clientFile_listbox']"));
        type(By.xpath("/*//*[@class='k-animation-container']/*//*[@class='k-textbox']"),JobRef);
        dropdownSelectElement_withoutCheckingClickableElement(JobRef, QuotationDetails_WebElements.ClientFile_dropdown_list);

    }

    private void fillBookingForm(String bookingType, String source){
        selectBookingType(bookingType);
        if (bookingType==BookingType.Private){
            selectSource(source);
        }
        if (bookingType== BookingType.Agent || bookingType==BookingType.Move_management){
            selectBooker();
        }
        if (bookingType == BookingType.Corporate || bookingType==BookingType.Corporate_competitive || bookingType==BookingType.Commercial){
            selectAccount();
            selectSource(source);
        }
    }
*/
}

