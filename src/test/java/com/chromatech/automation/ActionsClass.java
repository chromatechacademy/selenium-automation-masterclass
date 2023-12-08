package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

    public static void main(String[] args) throws InterruptedException {
         /*
         * TOPIC: ACTIONS CLASS
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        Actions actions = new Actions(driver);

        /* SCROLLING DOWN EXAMPLE USING ACTIONS CLASS */
        
        WebElement hoverButton = driver.findElement(By.xpath("//button[normalize-space()='Mouse Hover']"));
        // actions.moveToElement(hoverButton).perform();
        // actions.contextClick().perform();

        // actions.moveToElement(hoverButton).contextClick(hoverButton).perform();

        // SCROLLING TO AN ELEMENT THAT IS LOWER THAN THE HOVER BUTTON
        WebElement restAPILink = driver.findElement(By.xpath("//a[normalize-space()='REST API']"));
        actions.moveToElement(restAPILink).moveToElement(hoverButton).perform();

    }
    
}
