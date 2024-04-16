package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookStoreTest {
    public static void main(String[] args)throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver obj = new ChromeDriver();
        obj.get("https://qabookstorepage.ccbp.tech/");
        WebElement readmeWing = obj.findElement(By.xpath("//*[@id = 'sectionBookStoreHome']/div/div[1]/div/button"));
        readmeWing.click();
        Thread.sleep(3000);
        WebElement detailWing = obj.findElement(By.xpath("//div[@id ='sectionWingsOfFireBookDetails']/div//button[contains(text(),'Back')]"));
        detailWing.click();
        Thread.sleep(3000);
        WebElement recommendedFirstBook = obj.findElement(By.xpath("//div[@id = 'sectionBookStoreHome']/div/div[2]/div/button"));
        recommendedFirstBook.click();
        Thread.sleep(3000);
        WebElement backofFirstBook = obj.findElement(By.xpath("//div[@id = 'sectionTheThreeMistakesOfMyLifeBookDetails']/div//button[contains(text(),'Back')]"));
        backofFirstBook.click();
        Thread.sleep(3000);
        WebElement recommendedSecondBook = obj.findElement(By.xpath("//div[@id = 'sectionBookStoreHome']/div/div[3]/div/button"));
        recommendedSecondBook.click();
        Thread.sleep(3000);
        WebElement backofSecondBook = obj.findElement(By.xpath("//div[@id = 'sectionHarryPotterBookDetails']/div//button[contains(text(),'Back')]"));
        backofSecondBook.click();
        Thread.sleep(3000);
        obj.quit();


    }
}
