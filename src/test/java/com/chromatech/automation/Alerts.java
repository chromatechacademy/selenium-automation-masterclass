package com.chromatech.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {
        /*
         * TOPIC: HANDLING ALERTS
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        WebElement alertTextBox = driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']"));
        alertTextBox.sendKeys("Chroma Tech Academy");

        // CLICKING ON BUTTON THAT OPENS ALERT WITH 'OK' OPTION
        // WebElement alertButton = driver.findElement(By.xpath("//input[@value='Alert']"));
        // alertButton.click();
        // Thread.sleep(2000);

        // CLICKING ON BUTTON THAT OPENS ALERT WITH 'OK' AND 'CANCEL'
        WebElement confirmButton = driver.findElement(By.xpath("//input[@value='Confirm']"));
        confirmButton.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        String alertText = alert.getText();
        System.out.println(alertText);

        // alert.accept();
        alert.dismiss();
        
        Thread.sleep(2000);
        driver.quit();

    }

}
