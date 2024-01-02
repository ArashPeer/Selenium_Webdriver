package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Navigation_Method {

    /*Test Case
    * 1- launch the Selenium official website "https://www.selenium.dev/"
    * 2- Navigate to download section "https://www.selenium.dev/downloads/"
    * 3- Navigate back to Selenium official website
    * 4- Navigate forward to download section
    * 5- Navigate to refresh the page.
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        driver.navigate().to("https://www.selenium.dev/downloads/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
    }
}
