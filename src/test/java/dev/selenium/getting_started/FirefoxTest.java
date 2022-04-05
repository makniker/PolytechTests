package dev.selenium.getting_started;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class FirefoxTest {
    @Test
    public void firefoxSession() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://ok.ru");
        User testUser = new User("Никита Ермаков", "+79922228316", "Nikita123");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logIn(testUser);
        MainPage mainPage = new MainPage(driver);
        assertEquals(mainPage.getName(), testUser.getName());
        driver.quit();
    }
}