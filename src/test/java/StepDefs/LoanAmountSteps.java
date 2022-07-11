package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoanAmountSteps {
	
	
	WebDriver driver;
	
	
	@Given("^user is in Loan Amount Home Page$")
	public void user_is_in_Loan_Amount_Home_Page()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilla\\Desktop\\Chro\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("^user sets Loan Amount$")
	public void user_sets_Loan_Amount()  {
	    
	

		
		Select Loan = new Select(driver.findElement(By.xpath("//*[@id=")));
		Loan.selectByIndex(1);
		Loan.selectByIndex(3);
		Loan.selectByIndex(7);
		
		
		


	}

	@Then("^user closes Loan Amount Page$")
	public void user_closes_Loan_Amount_Page()     {
		driver.quit();


	}


	

}
