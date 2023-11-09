package com.chromatech.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

    public static void main(String[] args) {
        // Using chrome browser
        //WebDriver chromeDriver = new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
        //chromeDriver.get("https://chroma.mexil.it/site/login");
       // chromeDriver.navigate().to("https://chroma.mexil.it/site/login");

        // Using firefox browser
        // WebDriver firefoxDriver = new FirefoxDriver();
        // firefoxDriver.get("https://chroma.mexil.it/site/login");

        // WebDriver edgeDriver = new EdgeDriver();
        // edgeDriver.get("https://chroma.mexil.it/site/login");
    }
}
