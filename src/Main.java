import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.System;
public class Main {
    //1 test case: launch the chrome driver. Done
    //2 Navigate to the URL
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.gmail.com");
//        String title =  driver.getTitle();
//        System.out.println("title = " + title);
//        driver.manage().window().maximize();
//
//       WebElement search =  driver.findElement(By.id("twotabsearchtextbox"));//By.id()
//        search.sendKeys("Sony Camera");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("email")).sendKeys("arashperzai");
//        driver.findElement(By.id("pass")).sendKeys("Arash.1986");
//        driver.findElement(By.name("login")).click();
//        driver.getTitle();
//        driver.manage().window().maximize();
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poco f1");
//        driver.findElement(By.id("nav-search-submit-button")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.linkText("Include Out of Stock")).click();

        driver.findElement(By.id("identifierId")).sendKeys("arashperzai");
        Thread.sleep(3000);
        driver.findElement(By.className("VfPpkd-TkwUic")).click();

        String title = driver.getTitle();
        String expRes = "Gmail";

        if(title.equals(expRes)){
            System.out.println("expRes = " + expRes+ " actRes "+ expRes);
        }else{
            System.out.println("Title is not matching! ");
        }

    }
}