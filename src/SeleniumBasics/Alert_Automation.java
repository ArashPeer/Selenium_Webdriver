package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Automation {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        System.out.println(driver.getTitle());
//
//        WebElement result = driver.findElement(By.id("result"));
//        System.out.println(result.getText());

//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().dismiss();
//        WebElement alertResult = driver.findElement(By.id("result"));
//        System.out.println(alertResult.getText());

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("This is my alert");
        driver.switchTo().alert().getText();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        WebElement alertResult = driver.findElement(By.id("result"));
        System.out.println(alertResult.getText());







    }
}
