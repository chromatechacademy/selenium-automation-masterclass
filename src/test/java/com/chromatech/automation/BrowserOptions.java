package com.chromatech.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOptions {
    
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Maximizing browser by using maximize() method
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma.mexil.it/site/login";

        driver.get(url);
    }
}
