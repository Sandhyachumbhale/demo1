package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class adactin_home {
	@FindBy(xpath="//input[@name='username_show']") private WebElement usershow;
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutbtn;
	
	@FindBy(xpath="//a[text()='Click here to login again']") private WebElement Loginagain;
	
	
	@FindBy(xpath="//*[@id='location']") private WebElement Location;
	@FindBy(xpath="//*[@id='hotels']") private WebElement Hotels;
	@FindBy(xpath="//*[@id='room_type']") private WebElement RoomType;
	@FindBy(xpath="//*[@id='room_nos']") private WebElement NumberofRoom;
	@FindBy(xpath="//*[@id='datepick_in']") private WebElement CheckinDate;
	@FindBy(xpath="//*[@id='datepick_out']") private WebElement CheckoutDate;
	@FindBy(xpath="//*[@id='adult_room']") private WebElement AdultsperRoom;
	@FindBy(xpath="//*[@id='child_room']") private WebElement ChildperRoom;
	@FindBy(xpath="//*[@id='Submit']") private WebElement Searchbtn;
	
	
	@FindBy(xpath="//*[@id='radiobutton_0']") private WebElement Radiobtn;
	@FindBy(xpath="//*[@id='continue']") private WebElement Continuebtn;
	
	@FindBy(xpath="//*[@id='first_name']") private WebElement FN;
	@FindBy(xpath="//*[@id='last_name']") private WebElement LN;
	@FindBy(xpath="//*[@id='address']") private WebElement BillingAddress;
	@FindBy(xpath="//*[@id='cc_num']") private WebElement CCN;
	@FindBy(xpath="//*[@id='cc_type']") private WebElement CCT;
	@FindBy(xpath="//*[@id='cc_exp_month']") private WebElement EDMonth;
	@FindBy(xpath="//*[@id='cc_exp_year']") private WebElement EDYear;
	@FindBy(xpath="//*[@id='cc_cvv']") private WebElement CVV;
	@FindBy(xpath="//*[@id='book_now']") private WebElement BookNowBtn;

	




	 public adactin_home(WebDriver driver)
	{
	PageFactory.initElements(driver,this);

	}

	 public String getusername()
		{
		String s1=usershow.getAttribute("value");
		String a1[]=s1.split(" ");
		String z1=a1[0];
		String Actualun=a1[1];
		
		return Actualun;
		}
	 public void logout()
	    {
	        logoutbtn.click();	
	    }
	 
	 public void againlogin()
	 {
		 Loginagain.click();;
	 }
	 public void SelectLocation(String Loc)
	 {
		 Select s1=new Select(Location);
		 s1.selectByVisibleText(Loc);
		 
	 }
	 
	 public void SelectHotels(String hotel)
	 {
		 Select s1=new Select(Hotels);
		 s1.selectByVisibleText(hotel);
		 
	 }
	 
	 public void SelectRoomType(String RT)
	 {
		 Select s1=new Select(RoomType);
		 s1.selectByVisibleText(RT);
		 
	 }
	 
	 public void SelectNumberOfRooms1(String Nor)
	 {
		 
		 Select s1=new Select(NumberofRoom);
		 s1.selectByVisibleText(Nor);
	 }
	 
	 public void EnterCheckinDate(String CID)
	 {
		 CheckinDate.sendKeys(CID); 
	 }
	 
	 public void EnterCheckoutdate(String COD)
	 {
		 CheckoutDate.sendKeys(COD);
	 }
	 public void SelectAdultsperRoom(String APR)
	 {
		 
		 Select s1=new Select(AdultsperRoom);
		 s1.selectByVisibleText(APR);
	 }
	 
	 public void SelectChildperRoom(String CPR)
	 {
		 
		 Select s1=new Select(ChildperRoom);
		 s1.selectByVisibleText(CPR);
	 }
	 
	 public void ClickSearchBTN()
	 {
		 Searchbtn.click();
		 
	 }
	 
	 public void ClickRadioBTN()
	 {
		 Radiobtn.click();
		 
	 }
	 
	 public void ClickContinueBTN()
	 {
		 Continuebtn.click();
		 
	 }
	 
	 public void EnterFirstName(String Fn)
	 {
		 FN.sendKeys(Fn); 
	 }
	 public void EnterLastName(String Ln)
	 {
		 LN.sendKeys(Ln); 
	 }
	 
	 public void EnterBillingAddress(String BA)
	 {
		 BillingAddress.sendKeys(BA); 
	 }
	 
	 public void EnterCCN(String Ccn)
	 {
		CCN.sendKeys(Ccn); 
	 }
	 
	 public void EnterCCT(String Cct)
	 {
		CCT.sendKeys(Cct); 
	 }
	 
	 public void SelectEDMonth(String edm)
	 {
		 
		 Select s1=new Select(EDMonth);
		 s1.selectByVisibleText(edm);
	 }
	 
	 public void SelectEDYear(String edy)
	 {
		 
		 Select s1=new Select(EDYear);
		 s1.selectByVisibleText(edy);
	 }
	 public void EnterCVV(String Cvv)
	 {
		CVV.sendKeys(Cvv); 
	 }
	 
	 public void ClickBooknowBTN()
	 {
		 BookNowBtn.click();
		 
	 }
	 }


