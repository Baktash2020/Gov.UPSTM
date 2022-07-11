package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DropDown2Steps {
	
	WebDriver driver;
	
	@Given("^user is on the Main Page to select birthday$")
	public void user_is_on_the_Main_Page_to_select_birthday() throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilla\\Desktop\\Chro\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("");
		


	}

	

	@When("^user set birth month to \"([^\"]*)\"$")
	public void user_set_birth_month_to(String DropItem) throws InterruptedException  {
     Select DropDown = new Select(driver.findElement(By.id("month")));
     DropDown.selectByVisibleText("Jun");
     Thread.sleep(3000);
     DropDown.selectByVisibleText("Oct");
     
     
		
	}

	@Then("^user close the Main Page$")
	public void user_close_the_Main_Page()  {
		
		driver.close();
	    
	}

	@When("^user clicks on \"([^\"]*)\" radio button$")
	public void user_clicks_on_radio_button(String Button)  {
   // driver.findElement(By.xpath("//*[@id=]/span[1]/label")).click();

		
	}

	
	
	
	

}
