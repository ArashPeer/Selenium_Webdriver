package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Automation_Page {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement updLocation = driver.findElement(By.id("nav-global-location-popover-link"));
        updLocation.isDisplayed();
        updLocation.isEnabled();
        updLocation.click();

        String actualResult = updLocation.getText();
        String expectedResult = "Delivering to Converse 78109\n" +
                "Update location";
        if(actualResult.equals(expectedResult)){
            System.out.println("True! " + expectedResult);
        }else{
            System.out.println("error!");
        }
    }
}
