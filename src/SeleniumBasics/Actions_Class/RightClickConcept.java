package SeleniumBasics.Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");


        WebElement rightClickMe =  driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        Actions act = new Actions(driver);
        act.contextClick(rightClickMe).build().perform();

        WebElement edit = driver.findElement(By.xpath("/html/body/ul/li[1]"));
        edit.click();

        System.out.println(driver.switchTo().alert().getText());// it will print the text within alert box
        Thread.sleep(2000);
        driver.switchTo().alert().accept();//this statement will close the alert box
        driver.close();




    }
}
