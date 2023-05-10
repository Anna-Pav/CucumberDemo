//package stepsDefinitions;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import io.cucumber.java.en.Given;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class LoginSteps {
//
//    private WebDriver driver;
//
//    @Given("the browser is open")
//    public void the_browser_is_open() {
//        System.out.println("Given step");
//        System.setProperty("Webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe"); //forward slash works on all machines, double backward slashes work only on pc
//        driver = new ChromeDriver();
//
//    }
//
//    @And("the user is on login page")
//    public void the_user_is_on_login_page() {
//        driver.get("https://example.testproject.io/web/");
//    }
//
//    @When("the user enters correct username and password")
//    public void the_user_enters_correct_username_and_password() {
//
//        driver.findElement(By.id("name")).sendKeys("Anna");
//        driver.findElement(By.id("password")).sendKeys("12345");
//        driver.findElement(By.id("login")).click();
//    }
//    @Then("the user is navigated to the home page")
//    public void the_user_is_navigated_to_the_home_page() {
//        driver.getPageSource().contains("Logout");
  //      or driver.findElement(By.id("logout")).isDisplayed();
//    }
//}
//