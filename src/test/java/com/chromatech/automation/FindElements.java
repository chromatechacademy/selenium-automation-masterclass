package com.chromatech.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

    public static void main(String[] args) throws InterruptedException {
        /*
         * TOPIC: findElements()
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        List<WebElement> links = driver.findElements(By.tagName("aaaa"));
        // RETRIEVING NUMBER OF LINKS ON A WEB PAGE
        System.out.println(links.size());

        // PRINTING TEXT OF ALL LINKS
        // for (WebElement link : links) {
        //     String linkText = link.getText();
        //     System.out.println(linkText);
        // }

        Thread.sleep(2000);
        driver.quit();
    }

}
