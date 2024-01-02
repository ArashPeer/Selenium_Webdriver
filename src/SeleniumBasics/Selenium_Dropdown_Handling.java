package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Selenium_Dropdown_Handling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        //Note we cannot go like driver. fin.. we need to make Select constructor first
        Select obj = new Select(driver.findElement(By.id("dropdown")));
//        obj.selectByIndex(1);
//        obj.selectByValue("2");
//        obj.selectByVisibleText("Option 1");
        obj.selectByVisibleText("Option 1");

        //count the number of options available in the dropdown.
        List<WebElement> dropdownValuesCount = obj.getOptions();
        System.out.println(dropdownValuesCount.size());

        for (int i = 0; i < dropdownValuesCount.size(); i++) {
            System.out.println("i = " + i);

        }

    }
}
