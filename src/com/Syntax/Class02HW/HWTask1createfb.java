package com.Syntax.Class02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTask1createfb {




        public static void main(String[] args) throws InterruptedException {
            // Task1:
       /* navigate to fb.com
        click on create new account
        fill up all the textbooks
         close the pop-up
        close the browser*/
            System.setProperty("webdriver.chrome.driver","Drivers/Chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            Thread.sleep(1000);
            driver.findElement(By.partialLinkText("Create new account")).click();
            Thread.sleep(1000);
            driver.findElement(By.name("firstname")).sendKeys("Masiha");
            driver.findElement(By.name("lastname")).sendKeys("Abdullah");
            Thread.sleep(1000);
            driver.findElement(By.name("reg_email__")).sendKeys("masiha@12394.gmsil.com");
            driver.findElement(By.name("reg_email_confirmation__")).sendKeys("masiha@12394.gmsil.com");
            driver.findElement(By.id("password_step_input")).sendKeys("adc123@25");
            driver.findElement(By.id("month")).sendKeys("April");
            driver.findElement(By.name("birthday_day")).sendKeys("25");
            driver.findElement(By.name("birthday_year")).sendKeys("1991");
            driver.findElement(By.className("_58mt")).click();
            driver.findElement(By.name("websubmit")).click();
            driver.quit();
        }
    }


