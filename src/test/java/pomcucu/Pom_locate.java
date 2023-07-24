package pomcucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusabledominos.Dominos_Reusable;

public class Pom_locate  extends Dominos_Reusable{
	public Pom_locate() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Locate Me']")
	public WebElement locateme;
	@FindBy(xpath = "//span[text()='NON-VEG PIZZA']")
	public WebElement nonvegpizza;
	@FindBy(xpath = "//div[@data-label='Bestsellers']/child::div[@class='itm-wrppr']/child::div[@data-label='Pepper Barbecue Chicken']/descendant::button[@data-label='addTocart']")
	public WebElement addtocart;
	@FindBy(xpath = "//span[text()='NO THANKS']")
	public WebElement Nothank;
	@FindBy(xpath = "//span[text()='CHECKOUT']")
	public WebElement checkout;
	@FindBy(xpath = "//span[text()='My Address']")
	public WebElement myaddress;
	@FindBy(name = "loginNumber")
	public WebElement loginNo;
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement submitbutton;
	@FindBy(xpath = "//div[text()='Edit Address']")
	public WebElement editaddress;
	@FindBy(name="firstName")
	public WebElement firstname;
	@FindBy(name="lastName")
	public WebElement lastname;
	@FindBy(name="emailBox")
	public WebElement email;
	@FindBy(name="addressBox")
	public WebElement address;
	@FindBy(name="houseNumber")
	public WebElement houseNo;
	@FindBy(xpath = "//input[@value='Save & Continue']")
	public WebElement savecontinue;


	
	
	
	
	
	

}
