package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

       WebElement checkBox =  driver.findElement(By.xpath("//label[normalize-space()='Sports']"));

       checkBox.click();
       Thread.sleep(5000);
       checkBox.click();

        System.out.println(checkBox.getText());

    }
}
