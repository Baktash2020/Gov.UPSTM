package StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.secondPages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class second {
	
	WebDriver driver;
	secondPages SP;
	
	
	
	@Given("^user is in the Mercury Home Page$")
	public void user_is_in_the_Mercury_Home_Page() throws InterruptedException  {
     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilla\\Desktop\\Chro\\chromedriver.exe");
		driver= new ChromeDriver();
		
		SP = new secondPages (driver);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://newtours.demoaut.com/index.php");
		Thread.sleep(3000);
         
	}

	@When("^user enters Username in the textbox$")
	public void user_enters_Username_in_the_textbox()  {
    SP.getuserName().sendKeys("Baktash");

	}

	@When("^user enters Password in mercury textbox$")
	public void user_enters_Password_in_mercury_textbox()  {
    SP.getpassword().sendKeys("123wert");

		
	}

	@When("^user clicks sign in button$")
	public void user_clicks_sign_in_button()  {
	    SP.getsignIn().isSelected();
		
		
	}

	@Then("^user closes Mercury sign in page$")
	public void user_closes_Mercury_sign_in_page()  {
    driver.close();

		
		
	}



}
