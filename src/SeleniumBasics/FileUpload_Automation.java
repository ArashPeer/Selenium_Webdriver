package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Automation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement uploadFile =  driver.findElement(By.id("file-upload"));
        uploadFile.sendKeys("/Users/arashpeermohammad/Desktop/textfile.rtf");
        WebElement submit =  driver.findElement(By.id("file-submit"));
        submit.click();



    }
}
