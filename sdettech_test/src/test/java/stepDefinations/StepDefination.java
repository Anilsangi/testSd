package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefination {
	
WebDriver driver;
	
	@Given("^navigate to takealot page$")
    public void navigate_to_takealot_page() throws Throwable {
        
        driver.navigate().to("https://www.takealot.com/");
    }

    @When("^user logged in using username as “username” and password as “password”$")
    public void user_logged_in_using_username_as_username_and_password_as_password() throws Throwable {
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gamidianilkumarsa@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("May03@1992");
        driver.findElement(By.xpath("//body")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("cloths");
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        }
 
@Then("^home page should be displayed$")
    public void home_page_should_be_displayed() throws Throwable {
   driver.findElement(By.xpath("//body/div[@id='shopfront-app']/div[4]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
    }
}
