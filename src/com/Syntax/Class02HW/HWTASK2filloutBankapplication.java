package com.Syntax.Class02HW;

import com.syntaxClass02.WebOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTASK2filloutBankapplication {

    public static void main(String[] args) {

        //Task2:
       /* navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/
        System.setProperty("webdriver.chrome.driver","Drivers/Chromedriver.exe");
        WebDriver driver=new ChromeDriver();
   driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
   driver.manage().window().maximize();
   driver.findElement(By.id("customer.firstName")).sendKeys("Masiha");
   driver.findElement(By.id("customer.lastName")).sendKeys("Abdullah");
   driver.findElement(By.name("customer.address.street")).sendKeys("5803Storage");
   driver.findElement(By.name("customer.address.city")).sendKeys("Alexandria");
   driver.findElement(By.name("customer.address.state")).sendKeys("Virginia");
   driver.findElement(By.id("customer.address.zipCode")).sendKeys("22312");
   driver.findElement(By.id("customer.phoneNumber")).sendKeys("8625290555");
   driver.findElement(By.id("customer.ssn")).sendKeys("781563219");
   driver.findElement(By.name("customer.username")).sendKeys("MasihaAbdullah@12");driver.findElement(By.id("customer.password")).sendKeys("AbC@@123");
   driver.findElement(By.id("repeatedPassword")).sendKeys("AbC@@123");
   driver.findElement(By.className("button")).click();
   driver.quit();

    }
}
