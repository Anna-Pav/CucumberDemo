//package stepsDefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class ParametirisedLoginSteps {
//
//    private WebDriver driver;
//
//    @Given("the user has opened the browser")
//    public void the_user_has_opened_the_browser() {
//        System.out.println("Given step");
//        System.setProperty("Webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe"); //forward slash works on all machines, double backward slashes work only on pc
//        driver = new ChromeDriver();
//    }
//    @Given("user is on login page")
//    public void user_is_on_login_page() {
//        driver.get("https://example.testproject.io/web/");
//    }
//    @When("^the user enters (.*) and (.*)$")
//    public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {
//        driver.findElement(By.id("name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//        Thread.sleep(2000);
//        driver.findElement(By.id("login")).click();
//    }
//    @Then("user is navigated to the home page")
//    public void user_is_navigated_to_the_home_page() {
//        driver.findElement(By.id("logout")).isDisplayed();
//    }
//}
