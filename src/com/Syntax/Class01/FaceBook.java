package com.Syntax.Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver face=new ChromeDriver();
        face.get("https://www.facebook.com");
        Thread.sleep(200);


        /*face.findElement(By.id("email")).sendKeys("janel");
        face.findElement(By.id("pass")).sendKeys("janel123");
        face.findElement(By.name("login")).click();
*/

    }
}
