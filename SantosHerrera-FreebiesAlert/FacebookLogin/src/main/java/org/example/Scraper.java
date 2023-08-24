package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import javax.imageio.ImageIO;

import java.util.List;
public class Scraper {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/santos/LocalPros/Passion Project/PassionProjs9dot1/SantosHerrera-FreebiesAlert/chromedriver-mac-arm64/chromedriver");
        //System.setProperty("webdriver.chrome.driver","/Users/santos/LocalPros/Passion Project/chromedriver-mac-arm64/chromedriver");

        ChromeOptions options = new ChromeOptions();
        String userAget = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36";
        options.addArguments(String.format("user-agent=%s", userAget));
        options.addArguments("\"excludeSwitches\", [\"enable-automation\"]");
        options.addArguments("--disable-extensions");
        options.addArguments("--profile-directory=Default");
        options.addArguments("--disable-plugins-discovery");
        options.addArguments("--start-maximized");
        WebDriver driver= new ChromeDriver(options);

        //Login to facebook
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("3025259704");
        driver.findElement(By.name("pass")).sendKeys("BobLee30??");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.className("_97w4")).click();
        driver.findElement(By.className("_aklt")).click();
        driver.findElement(By.name("pass")).sendKeys("BobLee30??");
        driver.findElement(By.name("login")).click();
        driver.get("https://www.facebook.com/marketplace");
        //Scrape items from page
        List<WebElement> WebElement  =  driver.findElements(By.className("xjp7ctv"));
        for (WebElement element : WebElement) {
            System.out.println(element.getText());
            System.out.println(element.getAttribute("outerHTML"));
            System.out.println("---------------------");
        }
    }
}