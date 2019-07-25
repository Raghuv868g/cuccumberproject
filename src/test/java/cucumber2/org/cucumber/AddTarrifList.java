package cucumber2.org.cucumber;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTarrifList {
	WebDriver d;
	@Given("user should present in home page and click add tariff btn")
	public void user_should_present_in_home_page_and_click_add_tariff_btn() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAGHU\\eclipse-workspace\\demo\\dri\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("http://demo.guru99.com/telecom/");
	}

	@When("user fill all form and click submit button")
	public void user_fill_all_form_and_click_submit_button(DataTable  k) {
		d.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
List<String>data=k.asList(String.class);

d.findElement(By.id("rental1")).sendKeys(data.get(1));
d.findElement(By.id("local_minutes")).sendKeys(data.get(0));
d.findElement(By.id("inter_minutes")).sendKeys(data.get(2));
d.findElement(By.id("sms_pack")).sendKeys(data.get(1));
d.findElement(By.id("minutes_charges")).sendKeys(data.get(3));
d.findElement(By.id("inter_charges")).sendKeys(data.get(4));
d.findElement(By.id("sms_charges")).sendKeys(data.get(5));
d.findElement(By.id("inter_charges")).sendKeys(data.get(4));
d.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("user validate the outcomes")
	public void user_validate_the_outcomes() {
		Assert.assertTrue(d.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
		 	 }

}
