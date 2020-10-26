package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMsteps {
    WebDriver driver;



    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
      System.setProperty("webdriver.chrome.driver","/Users/dtg_egrassa/Downloads/chromedriver");
      driver = new ChromeDriver();
    }

    @When("I open orange HRM homepage")
    public void i_open_orange_hrm_homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    @Then("I verify that logo the logo present on page")
    public void i_verify_that_logo_the_logo_present_on_page() {
        boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true,status);

    }

    @And("close browser")
    public void close_browser() {
        driver.quit();


    }

}
