package SeleniumBasics.Actions_Class;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Clicked_And_Hold {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jqueryscript.net/demo/tap-hold-event-handler/");

        WebElement clickAndHold =  driver.findElement(By.id("1"));

       Actions tapAndClicked = new Actions(driver);
//       tapAndClicked.clickAndHold(clickAndHold).build().perform();
        tapAndClicked.doubleClick(clickAndHold).build().perform();


    }
}
