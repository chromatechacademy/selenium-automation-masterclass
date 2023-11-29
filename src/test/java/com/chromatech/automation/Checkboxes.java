package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        /**
         * ----- HANDLING CHECKBOXES WITH UNIQUE ATTRIBUTE AND ATTRIBUTE VALUES -----
         */

        // driver.findElement(By.xpath("//input[@value='option1']")).click();
        // driver.findElement(By.xpath("//input[@value='option2']")).click();
        // driver.findElement(By.xpath("//input[@value='option3']")).click();

        /**
         * ----- HANDLING CHECKBOXES WITH NON-UNIQUE ATTRIBUTE AND ATTRIBUTE VALUES
         * -----
         */

        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
    }

}
