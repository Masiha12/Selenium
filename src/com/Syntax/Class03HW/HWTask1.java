package com.Syntax.Class03HW;

import com.syntaxClass02.WebOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTask1 {

    public static void main(String[] args) throws InterruptedException {



        Task1:
        /*Navigate to http://syntaxprojects.com/
        Click on start practicing
        click on simple form demo
        enter any text on first text box
        click on show message
        quit the browser*/

        System.setProperty("webdriver.chrome.driver","Drivers/Chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://syntaxprojects.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(200);
        driver.findElement(By.xpath("//a[starts-with(@class,'list')]")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Selenium is interesting! ");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        driver.quit();

    }
}
