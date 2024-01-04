package com.chromatech.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingHardAsserts {

    public static void main(String[] args) {
        /*
         * TOPIC: HANDLING HARD ASSERTS
         */
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Chroma Tech School";

        String actualPageURL = driver.getCurrentUrl();
        String expectedPageURL = "https://chroma-tech-academy.mexil.it/static_page/something";

        WebElement actualInstructorJohnText = driver.findElement(By.xpath("(//*[contains(text(),'John')])[1]"));
        String expectedInstructorJohnText = "John";

        try {
            Assert.assertEquals(actualPageTitle, expectedPageTitle);
        } catch (AssertionError e) {
            e.printStackTrace();
        }

        try {
            Assert.assertEquals(actualPageURL, expectedPageURL);
        } catch (AssertionError e) {
            e.printStackTrace();
        }

        Assert.assertEquals(actualInstructorJohnText.getText(), expectedInstructorJohnText);

        driver.quit();

    }

}
