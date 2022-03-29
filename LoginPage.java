package dev.selenium.getting_started;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
    WebDriver driver_;
    LoginPage(WebDriver driver)
    {
        driver_ = driver;
    }
    String xPathToLogin = "//*[@id = 'field_email']";
    String xPathToPassword = "//*[@id = 'field_password']";
    String xPathToButton = "//*[@class = 'button-pro __wide']";
    public void logIn(User user)
    {
        WebElement loginField = driver_.findElement(By.xpath(xPathToLogin));
        loginField.sendKeys(user.getLogin());
        WebElement passwordField = driver_.findElement(By.xpath(xPathToPassword));
        passwordField.sendKeys(user.getPassword());
        driver_.findElement(By.xpath(xPathToButton)).click();
    }
}
