package MarketplacePage_PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class MarketplaceHotelsPage{
	
	WebDriver driver;
	JavascriptExecutor jse;
	
	// Creating Hotels
	

	@FindBy(xpath = "//*[@id='inputhotellogo']")
	public WebElement HotellogoImage;
	
	@FindBy(xpath ="//*[@id='btnCrop']")
	public WebElement CropandProceedHotelsBtn;
	
	@FindBy(xpath = "//*[@id='texthotelname1']")
	public WebElement HotelNameTxtBx;
	
	@FindBy(xpath = "//*[@id='eventdropdown1']")
	public WebElement EventHotelDrp;
	
	public void EventHotelDrpDwn(String value) {
		Select select = new Select(EventHotelDrp);
			select.selectByVisibleText(value);
		}

	
	@FindBy(xpath ="//*[@id='feedropdown1']")
	public WebElement TransactionChargesHotelDrp;
	
	public void TransactionChargesHotelDrpDwn(String value) {
		Select select = new Select(TransactionChargesHotelDrp);
			select.selectByVisibleText(value);
		}
	
	@FindBy(xpath = "//*[@id='autocomplete']")
	public WebElement LocationHotelTxtBx;
	
	@FindBy(xpath = "//*[@id='txthotelFromDateTime1']")
	public WebElement SalesStartDateHotel;
	
	@FindBy(xpath = "//*[@id='txthotelToDateTime1']")
	public WebElement SalesEndDateHotel;
	
	@FindBy(xpath ="//*[@id='hoteldescription']")
	public WebElement HotelDescriptionTxtBx;
	
	@FindBy(xpath ="//*[@id='checkEqualWeightageDiv']/i[1]")
	public WebElement RefundHotelRadioBtn;
	
	@FindBy(xpath ="//*[@id='refundstext1']")
	public WebElement RefundAmtDaysTxtBx;
		
	@FindBy(xpath ="//*[@id='checkIndividualWeightageDiv']/i[2]")
	public WebElement  NoRefundHotelRadioBtn;
	
	public void ReturnPolicyRadioBtn(String value) 
	{
				jse = (JavascriptExecutor) driver;
				if (value.equalsIgnoreCase("Refund")) 
					{
					jse.executeScript("arguments[0].scrollIntoView(true);", RefundHotelRadioBtn);
					RefundHotelRadioBtn.click();
				} else if (value.equalsIgnoreCase("No Refund")) {
					jse.executeScript("arguments[0].scrollIntoView(true);", NoRefundHotelRadioBtn);
					NoRefundHotelRadioBtn.click();
				}
			}

	
	@FindBy(xpath ="//*[@id='txtCancellationPolicy']")
	public WebElement CancellationPolicyHotelTxtBx;
	
	@FindBy(xpath ="//*[@id='textroomname1']")
	public WebElement RoomNappppppppppppmeHotelTxtBx;
	
	@FindBy(xpath ="//*[@id='textroomquantity1']")
	public WebElement QuantityHotelTxtBx;
	
	@FindBy(xpath ="//*[@id='selectcurrency1']")
	public WebElement PriceHotelDrp;
	
	public void PriceHotelDrpDwn(String value) {
		Select select = new Select(PriceHotelDrp);
			select.selectByVisibleText(value);
		}
	
	@FindBy(xpath = "//*[@id='textroomprice1']")
	public WebElement PriceValueTxtBx;
	
	@FindBy(xpath="//*[@id='MultipleDiv']/div/div/div[4]/div/div[2]/div[3]/div[2]")
	public WebElement DescriptionHotelTxtBx;
	
	@FindBy(xpath = "//*[@id='addnewrooms']")
	public WebElement AddRoomsHotelBtn;
	
	@FindBy(xpath ="//*[@id='savecancelhotel']/div/a[1]")
	public WebElement SaveHotelBtn;
	
	 
			 
		 }


