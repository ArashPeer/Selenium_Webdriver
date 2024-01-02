package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //click on the link basic auth
        WebElement basicAuth = driver.findElement(By.linkText("Basic Auth"));
        basicAuth.isDisplayed();
        basicAuth.isEnabled();
        basicAuth.click();

        //provide userName
//        WebElement userName = driver.findElement(By.name("password"));
//        userName.isDisplayed();
//        userName.isEnabled();
//        userName.sendKeys("admin123");
//
//        WebElement pwd = driver.findElement(By.name("password"));
//        pwd.isDisplayed();
//        pwd.isEnabled();
//        pwd.sendKeys("admin123");


        //provide login

//            Thread.sleep(5000);
//            WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
//            login.click();

        //login validation.

    }
}
