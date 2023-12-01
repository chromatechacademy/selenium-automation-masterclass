package com.chromatech.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bootstrap_DropDowns {

    public static void main(String[] args) {
        /*
         * TOPIC: BOOTSTRAP DROP-DOWNS
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        // ATTEMPTING TO USE SELECT CLASS
        // WebElement dropDown = driver.findElement(By.xpath("//button[@class='btn
        // btn-sm dropdown-toggle btn-outline-dark']"));

        // Select select = new Select(dropDown);
        // select.selectByVisibleText("Option 1");

        // INITIALIZING 'bootstrapDropDown' with WebElement locator
        WebElement bootstrapDropDown = driver
                .findElement(By.xpath("//button[@class='btn btn-sm dropdown-toggle btn-outline-dark']"));

        // CLICKING ON BOOTSTRAP DROP-DOWN
        bootstrapDropDown.click();

        // BEGINNER WAY
        // WebElement option1 =
        // driver.findElement(By.xpath("(//label[@class='dropdown-item'])[1]"));
        // option1.click();

        // CHROMA TECH WAY
        List<WebElement> dropDownOptions = driver.findElements(By.xpath("/html/body/fieldset/div/div/label"));

        for (WebElement option : dropDownOptions) {
            if (option.getText().equals("Option 1")) {
                option.click();
                break;
            }
        }
    }
}
