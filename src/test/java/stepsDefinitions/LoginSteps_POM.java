package stepsDefinitions;

import Pages.loginPOMPage;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps_POM {

    private WebDriver driver;
    loginPOMPage login;

    @Before
    public void setUp(){
        System.setProperty("Webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe"); //forward slash works on all machines, double backward slashes work only on pc
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("the user has opened the browser")
    public void the_user_has_opened_the_browser() {
        System.out.println("Browser started");

    }
    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get("https://example.testproject.io/web/");
        login = new loginPOMPage(driver);
    }
    @When("^the user enters (.*) and (.*)$")
    public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {


       login.enterUsername(username);
       login.enterPassword(password);

       Thread.sleep(2000);
       login.clickLogin();

       Thread.sleep(2000);

       /* driver.findElement(By.id("name")).sendKeys(username);  --we are now getting these actions from the POM page
        driver.findElement(By.id("password")).sendKeys(password); -- by creating an instance of the POM page
        Thread.sleep(2000);
        driver.findElement(By.id("login")).click();*/
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        login.checkLogoutButtonIsDisplayed();
    }

    //second scenario - login unsuccessful
    @When("the user enters wrong credential")
    public void the_user_enters_wrong_credential() {
        login.enterWrongCredentials();
    }
    @Then("error message appears to the user")
    public void error_message_appears_to_the_user() throws InterruptedException {
        login.errorMessageShowsUp();

    }

}
