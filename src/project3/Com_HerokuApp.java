package project3;
/**
 * Project-3 - ProjectName : com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Com_HerokuApp {
    static String browser = "Chrome";
    static String baseurl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else{
            System.out.println("Invalid Browser Name");
        }

        driver.get(baseurl);  // open url
        System.out.println(driver.getTitle());    // print the title of the page
        System.out.println(driver.getCurrentUrl());  // get current url
        System.out.println(driver.getPageSource());  // print the page source
        driver.findElement(By.id("username")).sendKeys("tomsmith");  // enter the username
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");  //enter the password
        driver.findElement(By.className("radius")).click();  // click on login button
        System.out.println("The Current URL is : " +driver.getCurrentUrl()); // print the current url
        driver.navigate().refresh(); // refresh the page
        //driver.quit(); // close the browser

    }
}
