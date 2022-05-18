package Data_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefForLogin {
	WebDriver driver;
	String projectpath = System.getProperty("user.dir");

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		String setProperty = System.setProperty("webdriver.chrome.driver", projectpath + "/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(DataTable DataTable) {
		List<List<String>> data = DataTable.cells();
		driver.findElement(By.id("txtUsername")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("txtPassword")).sendKeys(data.get(0).get(1));
//		driver.findElement(By.id("txtUsername")).sendKeys(data.get(1).get(0));
//		driver.findElement(By.id("txtUsername")).sendKeys(data.get(1).get(1));
//		driver.findElement(By.id("txtUsername")).sendKeys(data.get(2).get(0));
//		driver.findElement(By.id("txtUsername")).sendKeys(data.get(2).get(1));

		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		System.out.println("welcome Ridam! you have successfully logged in");
		driver.close();
		driver.quit();
	}

}
