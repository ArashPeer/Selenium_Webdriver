package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_Automation {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement radioButton = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
        radioButton.isDisplayed();
        radioButton.isEnabled();
        radioButton.isSelected();
        radioButton.click();
        System.out.println(radioButton.getAttribute("class"));
        System.out.println(radioButton.getText());


    }
}
