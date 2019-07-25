package cucumber2.org.cucumber;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddtariffMap {
	WebDriver d;
@Given("user should present in home page and click on add tariff btn")
public void user_should_present_in_home_page_and_click_on_add_tariff_btn() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAGHU\\eclipse-workspace\\demo\\dri\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("http://demo.guru99.com/telecom/");
	}


@When("user fill all form and click submit btn")
public void user_fill_all_form_and_click_submit_btn(DataTable dataTable) {
	Map<String,String> as = dataTable.asMap(String.class, String.class);
	d.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	d.findElement(By.id("rental1")).sendKeys(as.get("name"));
	d.findElement(By.id("local_minutes")).sendKeys(as.get("name1"));
	d.findElement(By.id("inter_minutes")).sendKeys(as.get("name2"));
	d.findElement(By.id("sms_pack")).sendKeys(as.get("name3"));
	d.findElement(By.id("minutes_charges")).sendKeys(as.get("name4"));
	d.findElement(By.id("inter_charges")).sendKeys(as.get("name5"));
	d.findElement(By.id("sms_charges")).sendKeys(as.get("name"));
	d.findElement(By.id("inter_charges")).sendKeys(as.get("name1"));
	d.findElement(By.xpath("//input[@type='submit']")).click();

}

@Then("user validate the outcome")
public void user_validate_the_outcome() {
	Assert.assertTrue(d.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
}}
