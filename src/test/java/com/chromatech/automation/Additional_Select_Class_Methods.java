package com.chromatech.automation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Additional_Select_Class_Methods {

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

        // RETRIEVING FIRST SELECTED OPTION
        // WebElement firsSelectedOption = select.getFirstSelectedOption();
        // System.out.println(firsSelectedOption.getText());

        // CHECKING IF DROP-DOWN SUPPORTS MULTIPLE SELECTIONS
        // boolean isMultiSelect = select.isMultiple();
        // System.out.println(isMultiSelect);

        // RETRIEVING ALL AVAILABLE OPTIONS IN A DROP-DOWN
        List<WebElement> allOptions = select.getOptions();
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }

    }
}
