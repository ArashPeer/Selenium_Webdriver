package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class NestedFrame_Automation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        List<WebElement> f = driver.findElements(By.tagName("frame"));
        System.out.println("Total number of frames::"+ " "+f.size());

        driver.switchTo().frame(1);
        String bottomFrame = driver.findElement(By.tagName("body")).getText();
        System.out.println("bottomFrame = " + bottomFrame);






    }
}
