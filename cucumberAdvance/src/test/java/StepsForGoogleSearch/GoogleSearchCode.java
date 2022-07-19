package StepsForGoogleSearch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchCode {

	WebDriver driver = null;

	@Before(value = "@capgemini", order = 1)
	public void setup() {
		System.out.println("Inside: Tag Capgemini");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();		
//		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("CapGemini");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER); 

	}

	@Before(value = "@accenture", order = 2)
	public void setup1() {
		System.out.println("Inside: Tag Accenture");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Accenture");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click(); 

	}

	@After("@capgemini")
	public void teardown() {
		System.out.println("Inside: teardown");
		driver.close();
		driver.quit();
	}

	@After("@accenture")
	public void teardown1() {
		System.out.println("Inside: teardown1");
		driver.close();
		driver.quit();
	}

	@Given("User is on google page")
	public void user_opens_google_page() {
		System.out.println("Inside: user opens google page ");

	}

	@When("User enters text")
	public void user_enters_Capgemini() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside: User enters text");

	}

	@Then("User closes the browser")
	public void user_closes_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside: User closes the browser");

	}
}