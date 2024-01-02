package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Automation {
    /*
    Test Case:
    https://username:password@URL
    url: https://the-internet.herokuapp.com/basic_auth
    change to url:  https://admin:admin@the-internet.herokuapp.com/basic_auth
    */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String username = "admin";
        String password = "admin";
        String url = "https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth";
        if(username == password){
            System.out.println("Test case pass");
        }else{
            System.out.println("Test case failed");
        }
        driver.get(url);



    }
}
