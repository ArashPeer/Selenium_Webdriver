package SeleniumBasics.Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement srcElement = driver.findElement(By.id("box1"));
        WebElement targetElement = driver.findElement(By.id("box105"));

        Actions act = new Actions(driver);
//        act.clickAndHold(srcElement).moveToElement(targetElement).release().build().perform();//this is one way
        act.dragAndDrop(srcElement,targetElement).build().perform();

        if(srcElement.getText().equals("Oslo") || targetElement.getText().equals("South Korea")){
            System.out.println("TEST CASE PASSED");
        }else{
            System.out.println("TEST CASE FAILED");
        }


    }
}
