package SeleniumBasics.Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://best.aliexpress.com/?gatewayAdapt=glo2usa&browser_redirect=true");

        Actions act = new Actions(driver);

        WebElement more = driver.findElement(By.className("pc2023-header-tab--more-tab--3Xov0hz"));
        WebElement electronic = driver.findElement(By.xpath("//a[@class='pc2023-header-tab--more-item--A1mqyV4'][normalize-space()='Electronics']"));
        act.moveToElement(more).moveToElement(electronic).click().build().perform();
    }
}
