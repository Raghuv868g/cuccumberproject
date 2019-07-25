package cucumber2.org.cucumber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class AddCus1Dimen {
	WebDriver d;
	@Given("user navigte to home pag")
	public void user_navigte_to_home_pag() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAGHU\\eclipse-workspace\\demo\\dri\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("http://demo.guru99.com/telecom/");
}

	@Given("user click non add customer")
	public void user_click_non_add_customer() {
		d.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
}

	@When("fill all details")
	public void fill_all_details(DataTable value) {
		
	
d.findElement(By.xpath("//label[@for='done']")).click();
List<String> val=value.asList(String.class);
		d.findElement(By.id("fname")).sendKeys(val.get(0));
		d.findElement(By.id("lname")).sendKeys(val.get(1));
		d.findElement(By.id("email")).sendKeys(val.get(2));
		d.findElement(By.xpath("//textarea[@id='message']")).sendKeys(val.get(3));
		d.findElement(By.id("telephoneno")).sendKeys(val.get(4));

	}

	@When("click on submit btn")
	public void click_on_submit_btn() {
		d.findElement(By.xpath("//input[@type='submit']")).click();
		 
	}

	@Then("I validate the outcome")
	public void i_validate_the_outcome() {
		WebElement l=d.findElement(By.xpath("(//td[@align='center'])[2]"));
		Assert.assertTrue(l.isEnabled());
		}


}
