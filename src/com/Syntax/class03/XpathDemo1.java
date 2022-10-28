package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/Chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcdafe");
        Thread.sleep(100);
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
        driver.findElement(By.xpath("//button[contains(@type,'sub')]")).click();

        driver.findElement(By.xpath("//input[starts-with@name,'pa')]")).sendKeys("abc123");

    }
}
