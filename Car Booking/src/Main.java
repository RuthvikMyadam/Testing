// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {

    WebDriver driver;

    public void launchBrowser(){
        driver = new SafariDriver();
        driver.get("http://localhost/Jewelry/Login.php");
    }

    public void onClick(){
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("vidya");
    }

    public void onClick1() throws InterruptedException {
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("vidya@12");
        // Thread.sleep(2000);
    }

    public void onClick2() {
        WebElement loginButton = driver.findElement(By.id("submit"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", loginButton);
    }

    public void onClick3() {
        driver.get("http://localhost/Jewelry/Artificial.php");
    }

    public void onClick4() {
        driver.get("http://localhost/Jewelry/ShoppingCart.php");
    }

    public void onClick5() {
        driver.get("http://localhost/Jewelry/Payment.php");
    }

    public void onClick6(String cardNumber, String cardHolder, String expiryMonth, String expiryYear, String cvv) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        WebElement cardNumberElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cardNumber")));
        cardNumberElement.sendKeys(cardNumber);

        WebElement cardHolderElement = driver.findElement(By.id("cardHolder"));
        cardHolderElement.sendKeys(cardHolder);

        WebElement expiryMonthElement = driver.findElement(By.id("expiryMonth"));
        expiryMonthElement.sendKeys(expiryMonth);

        WebElement expiryYearElement = driver.findElement(By.id("expiryYear"));
        expiryYearElement.sendKeys(expiryYear);

        WebElement cvvElement = driver.findElement(By.id("cvv"));
        cvvElement.sendKeys(cvv);

    }

    public void onClick8() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        WebElement payNowButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='submit'][value='Pay Now']")));
        payNowButton.click();
    }

    public void onClick9() {
        driver.get("http://localhost/Jewelry/Order.php");
    }

    public void onClick10() {
        WebElement backButton = driver.findElement(By.cssSelector("button"));
        backButton.click();
        driver.get("http://localhost/Jewelry/Home.php");
    }

    public static void  main(String[] args) throws InterruptedException {

        Main obj = new Main();
        obj.launchBrowser();
        obj.onClick();
        System.out.println("Test Case 1: Passed\n");
        obj.onClick1();
        System.out.println("Test Case 2: Passed\n");
        obj.onClick2();
        System.out.println("Test Case 3: Passed\n");
        obj.onClick3();
        System.out.println("Test Case 4: Passed\n");
        obj.onClick4();
        System.out.println("Test Case 5: Passed\n");
        obj.onClick5();
        System.out.println("Test Case 6: Passed\n");
        obj.onClick6("1234567890123456", "John Doe", "01", "2025", "123");
        System.out.println("Test Case 7: Passed\n");
        obj.onClick8();
        System.out.println("Test Case 8: Passed\n");
        obj.onClick9();
        System.out.println("Test Case 9: Passed\n");
        obj.onClick10();
        System.out.println("Test Case 10: Passed\n");
        System.out.println("All test cases passed!");
    }
}