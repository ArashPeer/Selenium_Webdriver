package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Links_Automation {
    /*
    Test cases:
    1- Verify the total number of links present on the webpage
    2- print those urls
    3- use assertion to verify the process
    Note: Logic
    */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://google.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for (int i =0; i <links.size(); i++){
            System.out.println(links.get(i).getAttribute("href"));
            System.out.println(links.get(i).getText());
        }


    }
}
