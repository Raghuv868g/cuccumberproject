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

public class TwoDlistCus {
	static WebDriver d;
	@Given("user should be  page")
	public void user_should_be_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-12\\git\\cuccumberproject\\target\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("http://demo.guru99.com/telecom/");
	}

	@When("user to click submit btn and fill details properly")
	public void user_to_click_submit_btn_and_fill_details_properly(DataTable cus) {
		d.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	List<List<String>> rs= cus.asLists(String.class);
	

		d.findElement(By.id("fname")).sendKeys(rs.get(0).get(1));
		d.findElement(By.id("lname")).sendKeys(rs.get(1).get(2));
		d.findElement(By.id("email")).sendKeys(rs.get(2).get(3));
		d.findElement(By.xpath("//textarea[@id='message']")).sendKeys(rs.get(3).get(3));
		d.findElement(By.id("telephoneno")).sendKeys(rs.get(4).get(2));}

	@When("user to click sub button")
	public void user_to_click_sub_button() {
		d.findElement(By.xpath("//input[@type='submit']")).click();
		}


	@Then("user validate the result of outcomes")
	public void user_validate_the_result_of_outcomes() {
		WebElement l=d.findElement(By.xpath("(//td[@align='center'])[2]"));
		Assert.assertTrue(l.isEnabled());
	}



}
