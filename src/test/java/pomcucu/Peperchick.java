package pomcucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusabledominos.Dominos_Reusable;

public class Peperchick extends Dominos_Reusable {
	public Peperchick() {
		PageFactory.initElements(driver, this);
	}
	//sample pom
	@FindBy(linkText = "PEPPER BARBECUE & ONION")
	public WebElement peperbarbequechicken;
	//sample pom
	@FindBy(xpath = "//a[text()='Order Online']")
	public WebElement orderonline;
	
	
	

}
