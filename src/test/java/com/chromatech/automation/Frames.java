package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

    public static void main(String[] args) {
        /*
         * TOPIC: HANDLING FRAMES
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        // USING ACTIONS CLASS TO SCROLL DOWN TO AN ELEMENT ON THE BOTTOM OF THE PAGE
        Actions actions = new Actions(driver);
        WebElement restAPILink = driver.findElement(By.xpath("//a[normalize-space()='REST API']"));
        actions.moveToElement(restAPILink).perform();

        // LOCATING FRAME WITH XPATH
        WebElement frame = driver.findElement(By.id("courses-iframe"));

        // SWITCHING TO FRAME USING WEB ELEMENT
        // driver.switchTo().frame(frame);

        // SWITHING TO FRAME BY INDEX
        // driver.switchTo().frame(0);

        // SWITCHING TO FRAME BY NAME OR ID
        //driver.switchTo().frame("courses-iframe");

        WebElement frameMenuButon = driver.findElement(By.xpath("(//button[@aria-label='mobile-menu'])[1]"));
        frameMenuButon.click();
    }

}
