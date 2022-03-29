package dev.selenium.getting_started;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    String xPathToName = "//*[@class='tico ellip']";
    WebDriver driver_;
    MainPage(WebDriver driver)
    {
        driver_ = driver;
    }

    String getName()
    {
        return driver_.findElement(By.xpath(xPathToName)).getText();
    }
}
