package com.Syntax.ReviewClass;

import com.syntaxClass02.WebOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Class1Basic {

    public static void main(String[] args) throws InterruptedException {
        /*What is Selenium?
        *   Selenium is an automation tool
        *
        * We are using web-driver which was not in our intellij,
        * so we download it from internet and linked it with our project.
        *  The methods that we call like driver .get
        *  the interfaces that we are using is available in jar.
        * We also need Drivers for selenium to work
        *And  We connected the web-diver with our IntelliJ using system.property
        *
        *
        * */
        System.setProperty("webdriver.chrome.driver","Drivers/Chromedriver.exe");
        // After we set up our driver, we need to create an instance
        WebDriver driver =new ChromeDriver();

        // Then Open the Facebook
        driver.get("https://www.facebook.com");
        //
        // we can add Thread .sleep if our code is not running because of the page is open so fast
        Thread.sleep(5000);
       // quit the browser
      //  driver.quit();
        // when we use navigate it is not going to wait for browser to open fully, while get is will wait for browser to open fully
        // If we have text in the link, So we can use linktext to use our code.
        driver.findElement(By.linkText("Crete new Account")).click();

    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
    Thread.sleep(100);
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abcagsa");

    }
}
