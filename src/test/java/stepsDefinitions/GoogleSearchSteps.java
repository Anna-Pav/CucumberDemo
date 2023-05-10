package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSteps {

    private WebDriver driver;

    @Given("google browser is open")
    public void google_browser_is_open() {
        System.out.println("Given step");
        System.setProperty("Webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe"); //forward slash works on all machines, double backward slashes work only on pc
        driver = new ChromeDriver();
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("And step");
        driver.get("https://google.com");
    }

    @When("the user enters a text in search box")
    public void the_user_enters_a_text_in_search_box() throws InterruptedException {
        System.out.println("When step");
        driver.findElement(By.id("W0wltc")).click();
        WebElement searchBar = driver.findElement(By.id("APjFqb"));
        searchBar.sendKeys("automation testing");
        Thread.sleep(2000);
        searchBar.sendKeys(Keys.RETURN);
        Thread.sleep(2000);

    }

    @Then("the user in navigated to search results")
    public void the_user_in_navigated_to_search_results() {
        System.out.println("Then step");
        WebElement searchPageResults = driver.findElement(By.className("gm7Ysb"));
        searchPageResults.isDisplayed();
    }

}
