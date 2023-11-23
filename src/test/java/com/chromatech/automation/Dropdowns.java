package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdowns {

    public static void main(String[] args) {
        /*
         * TOPIC: HANDLING DROP-DOWNS
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        // INITIALIZING 'dropDown' WITH WebElement
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

        // CREATING OBJECT OF SELECT CLASS AND PASSING 'dropDown' AS AN ARGUMENT TO Select() CONSTRUCTOR
        Select select = new Select(dropDown);

        // SELECTING OPTION BY VISIBLE TEXT
        // select.selectByVisibleText("Option1");

        // SELECTING OPTION BY INDEX
        // select.selectByIndex(2);

        // SELECTING OPTION BY VALUE
       // select.selectByValue("option3");
    }
}