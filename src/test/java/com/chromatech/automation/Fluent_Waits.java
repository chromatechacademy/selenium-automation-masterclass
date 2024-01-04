package com.chromatech.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent_Waits {

    public static void main(String[] args) {
        /*
         * TOPIC: FLUENT WAITS
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        // DECLARING AN IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        WebElement bootstrapDropDown = driver
                .findElement(By.xpath("//button[@class='btn btn-sm dropdown-toggle btn-outline-dark']"));

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30)) // SET THE MAX TIMEOUT DURATION
                .pollingEvery(Duration.ofSeconds(2)) // SET THE POLLING INTERVAL
                .ignoring(NoSuchElementException.class); // IGNORE THE EXCEPTION

        wait.until(ExpectedConditions.elementToBeClickable(bootstrapDropDown));
        bootstrapDropDown.click();

    }

}
