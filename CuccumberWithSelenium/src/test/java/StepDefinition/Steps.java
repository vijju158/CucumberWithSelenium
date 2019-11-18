package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.PendingException;
	
import cucumber.api.java.en.Then;		
public class Steps {				
    WebDriver driver;			
     @Given("^Open the Chrome and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {    
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\E000748\\Downloads\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();	
       driver.get("http://demo.guru99.com/v4");
     }		
    @When("^Enter Username and Password$")				
    public void user_enters_UserName_and_Password() throws Throwable 							
    {		
       driver.findElement(By.name("uid")).sendKeys("mngr233256");							
       driver.findElement(By.name("password")).sendKeys("juhAgup");							
    }		
    @Then("^Reset the credential$")					
    public void	Reset_the_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();					
    }
    @Then("^Press Login button$")					
    public void	Login_Button() throws Throwable 							
    {		
       driver.findElement(By.name("btnLogin")).click();					
    }
    @And("^Close the browser$")					
    public void	Close_Browser() throws Throwable 							
    {		
       driver.close();			
    }	
}