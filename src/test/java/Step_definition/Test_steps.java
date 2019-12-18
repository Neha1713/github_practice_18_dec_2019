package Step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert; 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps {

	static WebDriver driver;
	@Given("user is on Home Page")
	public void user_is_on_Home_Page() {  

	      System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
	      driver= new ChromeDriver(); 
	      driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("user navigate to Login Page")
	public void user_navigate_to_Login_Page() {
		driver.findElement(By.linkText("SignIn")).click();
		String str1=  driver.getTitle();
		System.out.println(str1);
		Assert.assertEquals(str1,"Login" );  
	}

	@When("user enters UserName and Password")
	public void user_enters_UserName_and_Password() {
	    
	    driver.findElement(By.name("userName")).sendKeys("lalitha");
	    driver.findElement(By.name("password")).sendKeys("password123");
	    driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();	
	    
	    
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() throws Exception {
		String str= driver.getTitle();
		System.out.println(str);
		Thread.sleep(3000);
	}

	@When("User Logout from the Application")
	public void user_Logout_from_the_Application() {
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/a")).click();
	    	}

	@Then("message displayed Logout Successfully")
	public void message_displayed_Logout_Successfully() {
		System.out.println("LogOut Successfully");

	    
	}

}
