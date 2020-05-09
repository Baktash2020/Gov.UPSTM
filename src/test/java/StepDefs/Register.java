package StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.RegisterP;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	
	
	WebDriver driver;
	RegisterP RP;
	
	@Given("^user is in the Mercury HomePage$")
	public void user_is_in_the_Mercury_HomePage() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\GoogleChrome\\chromedriver.exe");
		driver= new ChromeDriver();
		RP = new RegisterP (driver);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php?osCsid=c4d65d2675ac03bacd83ce6abf7e89af");
		Thread.sleep(3000);
		
	}
	
	

	@When("^user enters \"([^\"]*)\" in first name text box$")
	public void user_enters_in_first_name_text_box(String FirstName)  {
    RP.getfirstName().sendKeys(FirstName);

	}

	@When("^user enters \"([^\"]*)\" in last name text box$")
	public void user_enters_in_last_name_text_box(String LastName)  {
    RP.getlastName().sendKeys(LastName);

		
	}

	@When("^user enters \"([^\"]*)\" in phone no text box$")
	public void user_enters_in_phone_no_text_box(String Phone)  {
	    RP.getphone().sendKeys(Phone);
	}

	@When("^user enters \"([^\"]*)\" in Email text box$")
	public void user_enters_in_Email_text_box(String Email)  {
    RP.getemail().sendKeys(Email);

	}

	@When("^user enters \"([^\"]*)\" in address(\\d+) text box$")
	public void user_enters_in_address_text_box(String Address1, int Address2)  {
	    RP.getaddress1().sendKeys(Address1);
	}

	@When("^user enters \"([^\"]*)\" in city text box$")
	public void user_enters_in_city_text_box(String City)  {
    RP.getcity().sendKeys(City);

	}

	@When("^user enters \"([^\"]*)\" in state text box$")
	public void user_enters_in_state_text_box(String State)  {
		RP.getstate().sendKeys(State);
	    
	}

	@When("^user enters \"([^\"]*)\" in postalcode text box$")
	public void user_enters_in_postalcode_text_box(String PostelCode)  {
	    RP.getpostalcode().sendKeys(PostelCode);
	}

	@When("^user enters \"([^\"]*)\" in country text box$")
	public void user_enters_in_country_text_box(String Country)  {
    RP.getcounty().sendKeys(Country);

		
	}


	@When("^user enters User Name$")
	public void user_enters_User_Name()  {
	RP.getusername().sendKeys("AqdasJan");
		
	}

	@When("^user enters PassWord$")
	public void user_enters_PassWord()  {
    RP.getpassword().sendKeys("123987");

		
	}

	@When("^user confirms passWord$")
	public void user_confirms_passWord()  {
    RP.getconfirmpassword().sendKeys("123987");

		
	}

	@When("^user clicks Submit$")
	public void user_clicks_Submit()  {
    

		
		
	}

	@Then("^user close Register Page$")
	public void user_close_Register_Page()  {

    driver.close();
		
		
	}



}
