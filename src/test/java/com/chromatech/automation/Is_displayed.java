package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_displayed {

    public static void main(String[] args) throws InterruptedException {
        /*
         * TOPIC: isDisplayed() method
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        WebElement elementDisplayedExampleText = driver
                .findElement(By.xpath("//legend[normalize-space()='Element Displayed Example']"));

        // SCROLLING DOWN USING JAVASCRIPTEXECUTOR
        // CAST THE WEBDRIVER INSTANCE TO JavascriptExecutor:
        Thread.sleep(2000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elementDisplayedExampleText);

        WebElement hideShowExampleTextbox = driver.findElement(By.xpath("//input[@placeholder='Hide/Show Example']"));

        // VERIFYING IF TEXT BOX IS DISPLAYED
        boolean isTextBoxDisplayed = hideShowExampleTextbox.isDisplayed();
        System.out.println(isTextBoxDisplayed);

        // CLICKING ON HIDE BUTTON
        WebElement hideButton = driver.findElement(By.xpath("//input[@value='Hide']"));
        hideButton.click();

        // VERIFYING AGAIN IF TEXT BOX IS DISPLAYED
        System.out.println(hideShowExampleTextbox.isDisplayed());

        Thread.sleep(2000);
        driver.quit();
    }
}