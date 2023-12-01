package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselecting_Values_From_DropDowns {

    public static void main(String[] args) {
        /*
         * TOPIC: HANDLING DROP-DOWNS - DESELECTING VALUES
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://mdbootstrap.com/docs/standard/extended/multiselect/";
        driver.get(url);

        // INITIALIZING 'dropDown' WITH WebElement
        WebElement dropDown = driver.findElement(By.xpath("(//select)[1]"));

        // CREATING OBJECT OF SELECT CLASS AND PASSING 'dropDown' AS AN ARGUMENT TO Select() CONSTRUCTOR
        Select select = new Select(dropDown);

        // DESELECTING ALL OPTIONS 
        select.deselectAll();

        // SELECTING OPTION BY VISIBLE TEXT
        select.selectByVisibleText("Three");
        select.selectByVisibleText("Two");
        select.selectByVisibleText("Four");

        // DESELECTING OPTION BY VISIBLE TEXT
        // select.deselectByVisibleText("One");



    }

}
