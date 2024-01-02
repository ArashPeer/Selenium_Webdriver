package SeleniumBasics.Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Automation {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/slider/");

        driver.switchTo().frame(0);//since the element is in the frame we need to use swich method

        WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

        Actions act = new Actions(driver);
        act.moveToElement(slider).dragAndDropBy(slider, 400, 0).build().perform();
    }
}
