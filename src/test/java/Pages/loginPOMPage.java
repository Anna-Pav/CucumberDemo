package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class loginPOMPage {

    private WebDriver driver;

    public loginPOMPage(WebDriver driver) {
        this.driver = driver;

        //verify we are on the correct page
        if(!driver.getTitle().equals("TestProject Demo")){
            throw new IllegalStateException("Incorrect Page: " + driver.getCurrentUrl());
        }
    }

    private By username = By.id("name");
    private By password = By.id("password");
    private By loginButton = By.id("login");
    private By logoutButton = By.id("logout");


    public void enterUsername(String usernameInput){
        driver.findElement(username).sendKeys(usernameInput);
    }

    public void enterPassword(String passwordInput){
        driver.findElement(password).sendKeys(passwordInput);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    public void checkLogoutButtonIsDisplayed(){
        driver.findElement(logoutButton).isDisplayed();
    }

    public void enterWrongCredentials(){
        driver.findElement(username).sendKeys("user");
        driver.findElement(password).sendKeys("123");
        clickLogin();
    }

    public void errorMessageShowsUp() throws InterruptedException {
        //get the error message element and print it in the console
        By error = By.xpath("//*[@id=\"pageLogin\"]/form/div[2]/div/div[2]");
        new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(error)).stream().map(element->element.getAttribute("innerHTML")).collect(Collectors.toList());
        List<WebElement> list = driver.findElements(error);
        System.out.println(list.get(0).getText());

        // WebElement error2 =  driver.findElement(By.className("invalid-feedback"));
      //...?  String print = error2.getAttribute("innerHTML");
      //...?  System.out.println(print);


    }

}
