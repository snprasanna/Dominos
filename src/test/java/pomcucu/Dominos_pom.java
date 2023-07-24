package pomcucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusabledominos.Dominos_Reusable;

public class Dominos_pom extends Dominos_Reusable {
	public Dominos_pom() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[text()='OUR MENU']")
	public WebElement Ourmenu;
	@FindBy(xpath = "(//a[text()='View All'])[2]")
	public WebElement Nonvegpizza;
	
	
	

}
