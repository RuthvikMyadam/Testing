import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {

    WebDriver driver;

    public void waitForElement(By by) {
        // Specify the timeout duration using java.time.Duration
        Duration timeout = Duration.ofSeconds(10); // Adjust the timeout as needed

        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/ruthvikm/Downloads/chromedriver-mac-arm64/chromedriver");

        driver = new ChromeDriver();
        driver.get("file:///Users/ruthvikm/Downloads/Shopyourstyle/Home.html");
    }

    public void submitForm(){
        WebElement nameInput = driver.findElement(By.name("name"));
        WebElement emailInput = driver.findElement(By.name("email"));
        WebElement element = driver.findElement(By.id("message"));

        nameInput.sendKeys("John Doe");
        emailInput.sendKeys("john@example.com");
        element.sendKeys("This is a sample test case");
        WebElement submitButton = driver.findElement(By.id("submit-button"));
        submitButton.click();
    }

    public void onClick(){
        WebElement buttonElement = driver.findElement(By.id("contact"));
        buttonElement.click();
    }

    public void onClick1(){
        WebElement buttonElement = driver.findElement(By.id("about"));
        buttonElement.click();
    }

    public static void main(String[] args) {

        Main obj = new Main();
        obj.launchBrowser();
        obj.onClick();
        obj.submitForm();
        obj.onClick1();

    }
}