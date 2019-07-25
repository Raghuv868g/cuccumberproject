package cucumber2.org.cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTarrif {
WebDriver d;
@Given("user to be in home page")
public void user_to_be_in_home_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAGHU\\eclipse-workspace\\demo\\dri\\chromedriver.exe");
	 d=new ChromeDriver();
	d.get("http://demo.guru99.com/telecom/");
}

@When("user click on add tarrif btn and if all the detail")
public void user_click_on_add_tarrif_btn_and_if_all_the_detail() {
	d.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
d.findElement(By.id("rental1")).sendKeys("2");
d.findElement(By.id("local_minutes")).sendKeys("1");
d.findElement(By.id("inter_minutes")).sendKeys("3");
d.findElement(By.id("sms_pack")).sendKeys("6");
d.findElement(By.id("minutes_charges")).sendKeys("5");
d.findElement(By.id("inter_charges")).sendKeys("2");
d.findElement(By.id("sms_charges")).sendKeys("7");
d.findElement(By.id("inter_charges")).sendKeys("3");

	}

@When("user click submit btn")
public void user_click_submit_btn() {
	d.findElement(By.xpath("//input[@type='submit']")).click();

 }

@Then("user varify the outcome")
public void user_varify_the_outcome() {
	Assert.assertTrue(d.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
  }


}
