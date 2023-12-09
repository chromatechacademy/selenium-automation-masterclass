package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JS_Executor {

    public static void main(String[] args) throws InterruptedException {
        /*
         * TOPIC: JavascriptExecutor
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        // SCROLLING DOWN USING ACTIONS CLASS
        // Actions actions = new Actions(driver);

        WebElement hoverButton = driver.findElement(By.xpath("//button[normalize-space()='Mouse Hover']"));
        // actions.moveToElement(hoverButton).perform();

        // SCROLLING DOWN USING JAVASCRIPTEXECUTOR
        // CAST THE WEBDRIVER INSTANCE TO JavascriptExecutor:
        Thread.sleep(2000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", hoverButton);

        // CLICKING AN ELEMENT USING JavascriptExecutor
        WebElement contactUsLink = driver.findElement(By.xpath("//a[normalize-space()='Contact info']"));
        jsExecutor.executeScript("arguments[0].click();", contactUsLink);

    }

}
