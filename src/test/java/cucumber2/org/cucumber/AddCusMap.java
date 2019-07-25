package cucumber2.org.cucumber;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class AddCusMap {
WebDriver d;
@Given("user navigte to home page n user click no add customer")
public void user_navigte_to_home_page_n_user_click_no_add_customer() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAGHU\\eclipse-workspace\\demo\\dri\\chromedriver.exe");
	 d=new ChromeDriver();
	d.get("http://demo.guru99.com/telecom/");
	d.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();

}

@When("fill all info")
public void fill_all_info(DataTable e) {
	Map<String,String>as=e.asMap(String.class, String.class);
	d.findElement(By.xpath("//label[@for='done']")).click();
	
	d.findElement(By.id("fname")).sendKeys(as.get("f_name"));
			d.findElement(By.id("lname")).sendKeys(as.get("L_name"));
			d.findElement(By.id("email")).sendKeys(as.get("mail"));
			d.findElement(By.xpath("//textarea[@id='message']")).sendKeys(as.get("add"));
			d.findElement(By.id("telephoneno")).sendKeys(as.get("p_no"));
}

@When("click on the submit button")
public void click_on_the_submit_button() {
	d.findElement(By.xpath("//input[@type='submit']")).click();
	}

@Then("user validate the result")
public void user_validate_the_result() {
	WebElement l=d.findElement(By.xpath("(//td[@align='center'])[2]"));
	Assert.assertTrue(l.isEnabled());
}

}
