package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class login {
WebDriver driver;
	
	@Given("Open Browser Enter Url")
	public void Open_Browser_Enter_Url() {	
	driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}
		
		@When("^Enter UserName (.*)$")
		public void Enter_UserName(String uname) {
			WebElement Ele=driver.findElement(By.id("Email"));
			Ele.clear();
			Ele.sendKeys(uname);	
		}
		@And("^Enter Password (.*)$")
		 public void Enter_Password(String pass) {
			WebElement E=driver.findElement(By.id("Password"));
			E.clear();
			E.sendKeys(pass);
	}
		@And("Click On Submit Btn")
		public void Click_On_Submit_Btn() {
			WebElement El=driver.findElement(By.xpath("//button[@type='submit']"));
			El.click();
		} 
		@Then("Should Open Dashboard Page")
		public void should_open_dashboard_page() {
		   WebElement txt=driver.findElement(By.xpath("(//h1[contains(text(),Dashboard)])[2]"));
		    String s=txt.getText();
		    Assert.assertEquals("Dashboard", s);
		}
		@When("Enter Invalid UserName")
		public void enter_invalid_user_name() {
			WebElement Ele=driver.findElement(By.id("Email"));
			Ele.clear();
			Ele.sendKeys("admin@gmail.com");
		}

		@When("Enter Invalid Password")
		public void enter_invalid_password() {
			WebElement E=driver.findElement(By.id("Password"));
			E.clear();
			E.sendKeys("yash");
		}

		@Then("Should Display Error Message")
		public void should_display_error_message() {
			 WebElement txt=driver.findElement(By.xpath("//div[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]"));
			    String s=txt.getText();
			    Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.", s);
		}

		@When("Enter Blank UserName")
		public void enter_blank_user_name() {
			WebElement Ele=driver.findElement(By.id("Email"));
			Ele.clear();
			Ele.sendKeys(Keys.SPACE);
		}

		@When("Enter Blank Password")
		public void enter_blank_password() {
			WebElement E=driver.findElement(By.id("Password"));
			E.clear();
			E.sendKeys(Keys.SPACE);
		}

		
		@When("Enter Invalid UserName and  Enter Invalid Password")
		public void invalid_cred(DataTable d) {
			
			WebElement Ele=driver.findElement(By.id("Email"));
			Ele.clear();
			Ele.sendKeys(d.asList().get(0));
			WebElement E=driver.findElement(By.id("Password"));
			E.clear();
			E.sendKeys(d.asList().get(1));
		}
		
			
		

}
