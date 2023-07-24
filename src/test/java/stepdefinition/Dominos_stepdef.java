package stepdefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pomcucu.Dominos_pom;
import pomcucu.Peperchick;
import pomcucu.Pom_locate;
import reusabledominos.Dominos_Reusable;

public class Dominos_stepdef extends Dominos_Reusable {
	Dominos_pom pom;
	 Peperchick pom1;
	 Pom_locate pom2;
	 
	@Given("user launches url")
	public void user_launches_url() {
		getdriver();
		loadurl("https://www.dominos.co.in/");
		maxiwindow();
		pom = new Dominos_pom();

		
	}
		@Given("clicks our menubutton")
		public void clicks_our_menubutton() {
			buttonclick(pom.Ourmenu);

		}
		@Given("clicks nonvegpizzabutton")
		public void clicks_nonvegpizzabutton() {
			buttonclick(pom.Nonvegpizza);
		}
		@Given("clicks peper barbecue button")
		public void clicks_peper_barbecue_button() {
			pom1 = new Peperchick();
			buttonclick(pom1.peperbarbequechicken);
			}
		@Given("orderonline")
		public void orderonline() throws InterruptedException {
			buttonclick(pom1.orderonline);
			windowhandle();
		}
		@Then("click locateme button")
		public void click_locateme_button() throws InterruptedException {
			pom2 = new Pom_locate();
			buttonclick(pom2.locateme);
			Thread.sleep(10000);
		}
		@Then("then clicks non veg pizza")
		public void then_clicks_non_veg_pizza() throws InterruptedException {
			buttonclick(pom2.nonvegpizza);
			Thread.sleep(10000);
		}
		@Then("then add to cart button for pepper barbque chicken")
		public void then_add_to_cart_button_for_pepper_barbque_chicken() throws InterruptedException {
			WebDriverWait wait  =new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-label='Non-Veg Pizza']/child::div[@class='itm-wrppr']/child::div[@data-label='Pepper Barbecue Chicken']/descendant::button[@data-label='addTocart']"))).click();
			}
		
		@Then("clicks extra cheese for nothanks button")		
		public  void clicks_extra_cheese_for_nothanks_button() {
			pom2 = new Pom_locate();

			buttonclick(pom2.Nothank);
		}
		
	@Then("then clicks checkoutbutton")
		public void then_clicks_checkoutbutton() {
			buttonclick(pom2.checkout);

		}
		@Then("then clicks myaddress button")
		public void then_clicks_myaddress_button() {
			buttonclick(pom2.myaddress);
			
		}
		@Then("then enter mobile number")
		public void then_enter_mobile_number() {
			sendInput(pom2.loginNo,"7358590906");
		}
		@Then("then click submit button")
		public void then_click_submit_button() throws InterruptedException {
			Thread.sleep(5000);
			buttonclick(pom2.submitbutton);
		} 
		@Then("then click edit address button")
		public void then_click_edit_address_button() {
			buttonclick(pom2.editaddress);
		}
		@Then("then fill details")
		public void then_fill_details() {
			sendInput(pom2.firstname, "prasanna");
			sendInput(pom2.lastname, "natarajan");
			sendInput(pom2.email, "snprasanna2210@gmail.com");
			sendInput(pom2.address, "thirumalai annex first street");
			sendInput(pom2.houseNo, "plot no:6");
		}
		@Then("then save and continue")
		public void then_save_and_continue() {
			buttonclick(pom2.savecontinue);
			
		}



	}

