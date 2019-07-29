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

public class twoMapAddCus {
	static WebDriver d;
	@Given("user should be  homepage")
	public void user_should_be_homepage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-12\\git\\cuccumberproject\\target\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("http://demo.guru99.com/telecom/");
	}

	@When("user to click submit btn and fil")
	public void user_to_click_submit_btn_and_fil(io.cucumber.datatable.DataTable cus) {
		d.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	List<Map<String,String>> rs= cus.asMaps(String.class, String.class);
	

		d.findElement(By.id("fname")).sendKeys(rs.get(0).get("F_name"));
		d.findElement(By.id("lname")).sendKeys(rs.get(1).get("L_name"));
		d.findElement(By.id("email")).sendKeys(rs.get(2).get("Mail"));
		
		d.findElement(By.xpath("//textarea[@id='message']")).sendKeys(rs.get(3).get("Add"));
		d.findElement(By.id("telephoneno")).sendKeys(rs.get(4).get("phone"));}

	@When("user to click sub button and wait for next page login")
	public void user_to_click_sub_button() {
		d.findElement(By.xpath("//input[@type='submit']")).click();
		}


	@Then("user verify the result")
	public void user_validate_the_result() {
		WebElement l=d.findElement(By.xpath("(//td[@align='center'])[2]"));
		Assert.assertTrue(l.isEnabled());
	}

}
