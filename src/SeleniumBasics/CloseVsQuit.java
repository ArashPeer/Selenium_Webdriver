package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://the-internet.herokuapp.com/upload");

        Thread.sleep(3000);
        String MainTab = driver.getWindowHandle();
        System.out.println("MainTab = " + MainTab);

        Thread.sleep(3000);
//        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://google.com");
        System.out.println("New Window :: Google Info "+driver.getWindowHandle());

        Thread.sleep(3000);
        driver.switchTo().window(MainTab);
        System.out.println(driver.getTitle());

        driver.close();//this method will close the displayed window the remaining will be still open
//        driver.quit();//this method will quit all the browsers which are open.

    }
}
