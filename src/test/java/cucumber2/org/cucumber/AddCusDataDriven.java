package cucumber2.org.cucumber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddCusDataDriven {
WebDriver d;
@Given("user  to present in home page")
public void user_to_present_in_home_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAGHU\\eclipse-workspace\\demo\\dri\\chromedriver.exe");
	 d=new ChromeDriver();
	d.get("http://demo.guru99.com/telecom/");
	d.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();

}

@When("fill all info and click submit btn{string},{string},{string},{string},{string}")
public void fill_all_info_and_click_submit_btn(String a, String b, String c, String d1, String e) {

        d.findElement(By.xpath("//label[@for='done']")).click();
		d.findElement(By.id("fname")).sendKeys(a);
		d.findElement(By.id("lname")).sendKeys(b);
		d.findElement(By.id("email")).sendKeys(c);
		d.findElement(By.xpath("//textarea[@id='message']")).sendKeys(d1);
		d.findElement(By.id("telephoneno")).sendKeys(e);
		d.findElement(By.xpath("//input[@type='submit']")).click();

}

@Then("user validate the outcomes and test the outcome")
public void user_validate_the_outcomes_and_test_the_outcome() {
	WebElement l=d.findElement(By.xpath("(//td[@align='center'])[2]"));
	Assert.assertTrue(l.isEnabled());
}


}
