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
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilla\\Desktop\\Chro\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("");
		Thread.sleep(2000);
		
		//driver.navigate().forward();
		// When User go back to main page
		
	    
	}
	
	
	@When("^User clicks on Terms$")
	public void user_clicks_on_Terms()  {
		driver.findElement(By.id("terms-link")).click();
		
		
	    
	}
	
	@When("^User close the page$")
	public void user_close_the_page()   {
     driver.close();
     // And User close the page

	}

	@When("^User go back to main page$")
	public void user_go_back_to_main_page()  {
		driver.navigate().back();

	    
	}

	@When("^User clicks on Policy Data$")
	public void user_clicks_on_Policy_Data()  {
    driver.findElement(By.id("privacy-link")).click();

		
		
	}

	@When("^User clicks on Cookies Policy$")
	public void user_clicks_on_Cookies_Policy()               {
		driver.findElement(By.id("cookie-use-link")).click();
	    
	}

	@When("^User Clicks on Creat a Page for Celebrity$")
	public void user_Clicks_on_Creat_a_Page_for_Celebrity()     {
		driver.findElement(By.linkText("Create a Page")).click();
	     
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
	
	
	@When("^User Enters Email or Phone in The text box$")
	public void user_Enters_Email_or_Phone_in_The_text_box()    {
     driver.findElement(By.name("email")).sendKeys("Shamila");

	}

	@When("^User Enters Password in The text box$")
	public void user_Enters_Password_in_The_text_box()  {
    driver.findElement(By.name("pass")).sendKeys("Taagor");

		
		
	}

	@When("^User clicks On Log In$")
	public void user_clicks_On_Log_In() throws Throwable {
		driver.findElement(By.id("u_0_b")).click();
	    
	}
	
	@When("^user enters \"([^\"]*)\" in the FirstName text box$")
	public void user_enters_in_the_FirstName_text_box(String FirstName)  {
	    driver.findElement(By.name("firstname")).sendKeys(FirstName);
	}

	@When("^user enters \"([^\"]*)\" in The LastName text box$")
	public void user_enters_in_The_LastName_text_box(String LastName)  {
	    driver.findElement(By.name("lastname")).sendKeys(LastName);
	}

	@When("^user enters \"([^\"]*)\" in The MobileNumber text box$")
	public void user_enters_in_The_MobileNumber_text_box(String MobileNumber)  {
		driver.findElement(By.name("reg_email__")).sendKeys(MobileNumber);
	    
	}

	@When("^user enters \"([^\"]*)\" in The NewPassword text box$")
	public void user_enters_in_The_NewPassword_text_box(String NewPassword)  {
		driver.findElement(By.name("reg_passwd__")).sendKeys(NewPassword);
	    
	}
	
	
	
	
	
	
	



	

}
