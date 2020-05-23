package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BirthMonthSteps {
	
	WebDriver driver;
	
	
	@Given("^user is in Birth Month Home Page$")
	public void user_is_in_Birth_Month_Home_Page() throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\GoogleChrome\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
	    
	}
	
	
	@When("^user selects Female$")
	public void user_selects_Female() throws InterruptedException  {
		driver.findElement(By.id("u_0_6")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_7")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_8")).click();
		
	}
	
	@When("^User Selects \"([^\"]*)\"$")
	public void user_Selects(String link) throws InterruptedException           {
	    driver.findElement(By.id("u_0_8")).click();
	    Thread.sleep(3000);
		
	}

	@When("^User sets She in box of \"([^\"]*)\"$")
	public void user_sets_She_in_box_of(String DropItem3) throws InterruptedException     {
     Select gender = new Select(driver.findElement(By.name("preferred_pronoun")));
     gender.selectByIndex(0);
     Thread.sleep(3000);
     gender.selectByIndex(1);
     Thread.sleep(3000);
     gender.selectByIndex(2);
     Thread.sleep(3000);
     gender.selectByIndex(3);

		
		
		
	}
	
	@When("^user enters Gender Optional in the textbox$")
	public void user_enters_Gender_Optional_in_the_textbox() throws InterruptedException       {
		driver.findElement(By.id("u_0_11")).sendKeys("Male");
		Thread.sleep(3000);
      
		
		
	}
	

	@When("^user set the month to \"([^\"]*)\"$")
	public void user_set_the_month_to(String DropItem)  {
		Select dropDown = new Select (driver.findElement(By.id("month")));
		//dropDown.selectByVisibleText(DropItem);
		dropDown.selectByIndex(0);
		dropDown.selectByIndex(1);
		dropDown.selectByIndex(2);
		dropDown.selectByIndex(3);
		dropDown.selectByIndex(4);
		dropDown.selectByIndex(5);
		dropDown.selectByIndex(6);
		dropDown.selectByIndex(7);
		dropDown.selectByIndex(8);
		dropDown.selectByIndex(9);
		dropDown.selectByIndex(10);
		dropDown.selectByIndex(11);
		dropDown.selectByIndex(12);
		    
	}
	
	@When("^user sets Day to \"([^\"]*)\"$")
	public void user_sets_Day_to(String DropItem1)  {
		Select Day = new Select (driver.findElement(By.id("day")));
		Day.selectByIndex(0);
		Day.selectByIndex(2);
		Day.selectByIndex(4);
		Day.selectByIndex(9);
		
	    
	}

	@When("^user sets Year to \"([^\"]*)\"$")
	public void user_sets_Year_to(String DropItem2)  {
		Select Year = new Select (driver.findElement(By.id("year")));
		Year.selectByValue("0");
		Year.selectByValue("1999");
		Year.selectByValue("2000");
		Year.selectByValue("2005");
		Year.selectByValue("2015");
		Year.selectByValue("2020");
		


	}



	@Then("^user closes the Birth Month Page$")
	public void user_closes_the_Birth_Month_Page()  {
	    driver.close();
		
		
		
	}


	

}
