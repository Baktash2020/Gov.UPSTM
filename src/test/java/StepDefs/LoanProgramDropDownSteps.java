package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class LoanProgramDropDownSteps {

	
	WebDriver driver;
	
	
	@Given("^user is in the Home Page of American$")
	public void user_is_in_the_Home_Page_of_American()  {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\Chromed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("^user selects \"([^\"]*)\"$")
	public void user_selects(String loan)  {
	    
		Select Loan = new Select (driver.findElement(By.id("loan_amount")));
		Loan.selectByVisibleText("Less than $70,000");
		Loan.selectByVisibleText("$70,001 - $80,000");
		
		
		
	}
	
	

	@Then("^user closes the page of American$")
	public void user_closes_the_page_of_American() {

    driver.close();
		
		
		
	}


	

	
	
	
	
	
	
	
}
