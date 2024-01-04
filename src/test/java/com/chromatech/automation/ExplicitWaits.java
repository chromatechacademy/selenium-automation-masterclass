package com.chromatech.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {

    public static void main(String[] args) {
        /*
         * TOPIC: EXPLICIT WAIT
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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35));
        // WAITING FOR VISIBILITY OF ELEMENT
        wait.until(ExpectedConditions.visibilityOf(bootstrapDropDown));
        bootstrapDropDown.click();

        // WAITING FOR CLICKABILITY OF ELEMENT
        wait.until(ExpectedConditions.elementToBeClickable(bootstrapDropDown));
        bootstrapDropDown.click();

        // ADDITIONAL METHODS

        driver.quit();
    }

}
