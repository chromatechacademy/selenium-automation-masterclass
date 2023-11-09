package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma.mexil.it/site/login";
        driver.get(url);

        // Locating using id() locator/method
        WebElement userNameTextBox = driver.findElement(By.id("form-username"));
        userNameTextBox.sendKeys("general@teacher.com");

        // Locating using name() locator/method
        // WebElement passwordTextBox = driver.findElement(By.name("password"));
        // passwordTextBox.sendKeys("123456");

        // Locating using className() locator/method
        // WebElement passwordTextBox = driver.findElement(By.className("form-password
        // form-control"));
        // passwordTextBox.sendKeys("123456");

        // Locating using tagName locator/method
        // driver.findElement(By.tagName("input")).sendKeys("123456");

        // Locating using linkText() locator/method
        // driver.findElement(By.linkText("Forgot Password?")).click();

        // Locating using partialLinkText() locator/method
        // driver.findElement(By.partialLinkText("Forgot Passwo")).click();

        // Locating using cssSelector() locator/method #attributeValueOfID
        // driver.findElement(By.cssSelector("#form-password")).sendKeys("123456");

        // Locating using cssSelector() locator/method [attribute='attributeValue']
        // driver.findElement(By.cssSelector("[class='form-password form-control']")).sendKeys("123456");

        // Locating using full/absolute xpath
        // driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("123456");

        // Locating using relative xpath
        driver.findElement(By.xpath("//input[@class='form-password form-control']")).sendKeys("123456");

        // Locating using relative contains text xpath
        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
        
    }

}
