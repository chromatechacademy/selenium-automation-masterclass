package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma.mexil.it/site/login";

        driver.get(url);

        WebElement signInButtonText = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));

        
        System.out.println("TEXT OF SIGN IN BUTTON IS: " + signInButtonText.getText());

        WebElement forgotPasswordLinkText = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]"));

        System.out.println("TEXT OF FORGOT PASSWORD LINK IS: " + forgotPasswordLinkText.getText());
    }
}
