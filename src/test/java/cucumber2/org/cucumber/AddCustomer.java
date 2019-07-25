package cucumber2.org.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddCustomer {
	WebDriver d;
	@Given("user navigte to home page")
	public void user_navigte_to_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAGHU\\eclipse-workspace\\demo\\dri\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("http://demo.guru99.com/telecom/");
 }

	@Given("user click no add customer")
	public void user_click_no_add_customer() {
		d.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		}

	@When("fill all detail")
	public void fill_all_detail(io.cucumber.datatable.DataTable dataTable) {

		d.findElement(By.id("fname")).sendKeys("raghu");
		d.findElement(By.id("lname")).sendKeys("varan");
		d.findElement(By.id("email")).sendKeys("raghu@gmail.com");
		d.findElement(By.xpath("//textarea[@id='message']")).sendKeys("green tech");
		d.findElement(By.id("telephoneno")).sendKeys("8220325156");
}

	@When("click on submit button")
	public void click_on_submit_button() {
		d.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		WebElement l=d.findElement(By.xpath("(//td[@align='center'])[2]"));
		Assert.assertTrue(l.isEnabled());
	}
}
