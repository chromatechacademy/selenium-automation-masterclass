package com.chromatech.automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) {
        /*
         * TOPIC: CLOSING WINDOWS
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        // GETTING HANDLE OF MAIN WINDOW
        String mainWindowHandle = driver.getWindowHandle();
        // System.out.println(windowHandle);

        WebElement openWindowButton = driver.findElement(By.id("openwindow"));

        openWindowButton.click();

        Set<String> allWindows = driver.getWindowHandles();
        for (String nextWindow : allWindows) {
            driver.switchTo().window(nextWindow);
        }

        // CLICKING ON COURSES LINK
        WebElement coursesLink = driver.findElement(By.linkText("Courses"));
        coursesLink.click();

        // SWITCHING TO THE MAIN WINDOW USING THE MAIN WINDOW HANDLE
        driver.switchTo().window(mainWindowHandle);

        WebElement bootstrapDropDown = driver.findElement(By.xpath("//button[@class='btn btn-sm dropdown-toggle btn-outline-dark']"));
        bootstrapDropDown.click();

    }
}
