package com.chromatech.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Soft_Assertions {

    public static void main(String[] args) {
        /*
         * TOPIC: SOFT ASSERTS
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

        // STEP 1: CREATE AN OBJECT/INSTANCE OF THE SOFT ASSERT CLASS
        SoftAssert softAssert = new SoftAssert();

        // STEP 2: PERFORM ASSERTIONS

        // VERIFYING PAGE TITLE
        softAssert.assertEquals(actualPageTitle, expectedPageTitle);

        // VERIFYING PAGE URL
        softAssert.assertEquals(actualPageURL, expectedPageURL);

        // VERIFYING INSTRUCTOR JOHN TEXT
        softAssert.assertEquals(actualInstructorJohnText.getText(), expectedInstructorJohnText);

        softAssert.assertTrue(actualInstructorJohnText.getText().contains("something"), "-- VERIFYING JOHN TEXT USING SOFT ASSERT TRUE --");

        softAssert.assertAll();


        driver.quit();


    }

}
