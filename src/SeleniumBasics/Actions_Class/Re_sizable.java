package SeleniumBasics.Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Re_sizable {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://jqueryui.com/resizable/");
        driver.get("https://strml.github.io/react-resizable/examples/1.html");

//        driver.switchTo().frame(0);

        WebElement resize = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/span[2]"));

        Actions act = new Actions(driver);
        Thread.sleep(3000);
//        act.clickAndHold(resize).moveByOffset(300, 300).release().build().perform();
        act.moveToElement(resize).dragAndDropBy(resize, 400, 300).build().perform();
        Thread.sleep(3000);

    }
}
