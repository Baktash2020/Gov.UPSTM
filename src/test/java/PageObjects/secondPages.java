package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class secondPages {
	
	
	
	WebDriver driver;
	
    public secondPages (WebDriver x){
		driver = x; 
	}
    
    public WebElement getuserName() {
		WebElement UserName = driver.findElement(By.name("userName"));
		return UserName;
		
	}
	
	public WebElement getpassword() {
		WebElement Password = driver.findElement(By.name("password"));
		return Password;
		
	}
	
	public WebElement getsignIn() {
		WebElement SignIn = driver.findElement(By.name("login"));
		return SignIn;
		
	}
    
    
    
    
 

}
