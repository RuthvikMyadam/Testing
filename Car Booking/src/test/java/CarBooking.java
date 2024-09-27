import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarBooking {

    WebDriver driver;

    @BeforeTest
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/ruthvikm/Downloads/chromedriver-mac-arm64/chromedriver");

        driver = new ChromeDriver();
        driver.get("http://localhost/AdvSE_Avinash/Home.html");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void Home(){
        WebElement buttonElement = driver.findElement(By.id("home"));
        buttonElement.click();
    }

    @Test(priority = 2)
    public void About(){
        WebElement buttonElement = driver.findElement(By.id("about"));
        buttonElement.click();
    }

    @Test(priority = 3)
    public void Services(){
        WebElement buttonElement = driver.findElement(By.id("services"));
        buttonElement.click();
    }

    @Test(priority = 4)
    public void Contact(){
        WebElement buttonElement = driver.findElement(By.id("contact"));
        buttonElement.click();
    }

    @Test(priority = 5)
    public void Login(){
        WebElement buttonElement = driver.findElement(By.id("login"));
        buttonElement.click();
    }

    @Test(priority = 6)
    public void Register(){
        WebElement buttonElement = driver.findElement(By.id("registration-btn"));
        buttonElement.click();

        WebElement username = driver.findElement(By.id("username"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("user7");

        WebElement email = driver.findElement(By.id("username1"));
        email.isDisplayed();
        email.isEnabled();
        email.sendKeys("user3@uta.com");

        WebElement password = driver.findElement(By.id("password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("Admins");

        WebElement buttonElement2 = driver.findElement(By.id("registration-btn"));
        buttonElement2.click();
    }

    @Test(priority = 8)
    public void LoginTo(){
        WebElement username = driver.findElement(By.id("username"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("user7");

        WebElement password = driver.findElement(By.id("password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("Admins");

        WebElement buttonElement = driver.findElement(By.id("login-btn"));
        buttonElement.click();
    }

    @Test(priority = 9)
    public void HomeAfterLogin(){
        WebElement buttonElement = driver.findElement(By.id("home"));
        buttonElement.click();
    }

    @Test(priority = 10)
    public void MidSizedCars(){
        WebElement buttonElement = driver.findElement(By.id("mid-sized"));
        buttonElement.click();
    }

    @Test(priority = 11)
    public void LuxuryCars(){
        WebElement buttonElement = driver.findElement(By.id("luxury"));
        buttonElement.click();
    }

    @Test(priority = 12)
    public void CompactCars(){
        WebElement buttonElement = driver.findElement(By.id("compact"));
        buttonElement.click();

        WebElement buttonElement1 = driver.findElement(By.id("Honda__"));
        buttonElement1.click();
    }

    @Test(priority = 13)
    public void Dates(){
        WebElement buttonElement = driver.findElement(By.id("book"));
        buttonElement.click();
    }

    @Test(priority = 13)
    public void Book(){
        WebElement buttonElement = driver.findElement(By.id("pay"));
        buttonElement.click();
    }

    @Test(priority = 14)
    public void Payment(){
        WebElement cardnumber = driver.findElement(By.id("card-number"));
        cardnumber.isDisplayed();
        cardnumber.isEnabled();
        cardnumber.sendKeys("8734-1283-1281-1110");

        WebElement expiry = driver.findElement(By.id("expiry"));
        expiry.isDisplayed();
        expiry.isEnabled();
        expiry.sendKeys("12/31");

        WebElement CVV = driver.findElement(By.id("cvv"));
        CVV.isDisplayed();
        CVV.isEnabled();
        CVV.sendKeys("862");

        WebElement Name = driver.findElement(By.id("name"));
        Name.isDisplayed();
        Name.isEnabled();
        Name.sendKeys("John Mayer");

        WebElement buttonElement = driver.findElement(By.id("Booking"));
        buttonElement.click();
    }
}
