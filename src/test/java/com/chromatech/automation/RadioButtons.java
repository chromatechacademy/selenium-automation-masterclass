package com.chromatech.automation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        /**
         * ----- HANDLING RADIO BUTTONS WITH UNIQUE ATTRIBUTE AND ATTRIBUTE VALUES -----
         */

        // driver.findElement(By.xpath("//input[@value='radio1']")).click();
        // driver.findElement(By.xpath("//input[@value='radio2']")).click();
        // driver.findElement(By.xpath("//input[@value='radio3']")).click();

        /**
         * ----- HANDLING RADIO BUTTONS WITH NON-UNIQUE ATTRIBUTE AND ATTRIBUTE VALUES
         * -----
         */

        // driver.findElement(By.xpath("(//input[@name='radioButton'])[1]")).click();
        // driver.findElement(By.xpath("(//input[@name='radioButton'])[2]")).click();
        // driver.findElement(By.xpath("(//input[@name='radioButton'])[3]")).click();

        /**
         * RETRIEVING RADIO BUTTONS AS A LIST OF WebElements AND CLICKING ON RADIO BUTTON BY SPECIFYING TEXT
         */

        List<WebElement> radioButtonsText = driver.findElements(By.xpath("//input[@name='radioButton']/parent::label"));
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='radioButton']"));
        for (WebElement radioButtonText : radioButtonsText) {
            if (radioButtonText.getText().equals("Radio3")) {
                radioButtons.get(2).click();
            }
        }

    }
}
