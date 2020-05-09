package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterP {
	
	
	WebDriver driver;
	public RegisterP (WebDriver x) {
		driver = x; 
	}
	
	public WebElement getregister(){
		WebElement Register = driver.findElement(By.linkText("REGISTER"));
		return Register; 
	}
	
	public WebElement getfirstName() {
		WebElement FirstName = driver.findElement(By.name("firstName"));
		return FirstName;
		
	}
	
	public WebElement getlastName() {
		WebElement LastName = driver.findElement(By.name("lastName"));
		return LastName;
		
	}
	
	public WebElement getphone() {
		WebElement Phone = driver.findElement(By.name("phone"));
		return Phone;
		
	}
	
	public WebElement getemail() {
		WebElement Email = driver.findElement(By.name("userName"));
		return Email;
		
	}
	
	public WebElement getaddress1() {
		WebElement Address = driver.findElement(By.name("address1"));
		return Address;
		
	}
	
	public WebElement getaddress2() {
		WebElement Address1 = driver.findElement(By.name("address2"));
		return Address1;
		
	}
	
	public WebElement getcity() {
		WebElement City = driver.findElement(By.name("city"));
		return City;
		
	}
	
	public WebElement getstate() {
		WebElement State = driver.findElement(By.name("state"));
		return State;
		
	}
	
	public WebElement getpostalcode() {
		WebElement PostalCode = driver.findElement(By.name("postalCode"));
		return PostalCode;
		
	}
	
	public WebElement getcounty() {
		WebElement Country = driver.findElement(By.name("country"));
		return Country;
		
	}
	
	public WebElement getusername() {
		WebElement UserName = driver.findElement(By.name("email"));
		return UserName;
		
	}
	
	public WebElement getpassword() {
		WebElement Password = driver.findElement(By.name("password"));
		return Password;
		
	}
	
	public WebElement getconfirmpassword() {
		WebElement ConfirmPassord = driver.findElement(By.name("confirmPassword"));
		return ConfirmPassord;
		
	}
	public WebElement getsubmit() {
		WebElement Submit = driver.findElement(By.name("register"));
		return Submit;
		
	}
	
	

}
