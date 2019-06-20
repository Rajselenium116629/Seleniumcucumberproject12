package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testme.utility.Drivers;

public class loginfeature {
	WebDriver driver;

@Given("The URL of demo web shop")
public void the_URL_of_demo_web_shop() {
	driver=Drivers.getDriver("chrome");
	PageFactory.initElements(driver,Loginpages.class);
	driver.get("http://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	Assert.assertEquals("Demo Web shop. Login",driver.getTitle());
}

@When("user enters {word} as (admin|guest|vendor) username")
public void user_enters_as_username(String string) {
	Loginpages.email.sendKeys(string);
}
@When("user enters {word} as password")
public void user_enters_as_password(String string) {
	Loginpages.password.sendKeys(string);
	
}

@Then("user is in valid page")
public void user_is_in_valid_page() {
  Loginpages.signin.click();
   Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
}

}
