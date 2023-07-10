package testRunner;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class testrun {
	ChromeDriver n;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println(" on login page");
	    System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		 n= new ChromeDriver();
		
		n.get("https://www.facebook.com");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	   System.out.println("enter username and password");
	   n.findElementByName("email").sendKeys("6380606117");
	   n.findElementById("pass").sendKeys("kavi2426");
	}

	@And("click on login button")
	public void click_on_login_button()  {
	   System.out.println("clicking on login button");
	   n.findElementByName("login").click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
	    System.out.println("login home page");
	    Thread.sleep(30000);
	    n.quit();
	}

}
