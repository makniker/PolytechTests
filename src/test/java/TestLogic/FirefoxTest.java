package TestLogic;

import Pages.LoginPage;
import Pages.MainPage;
import Utils.User;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
    @Test
    public void logInClassmates() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://ok.ru");
        User testUser = new Utils.User("Никита Ермаков", "+79922228316", "Nikita123");
        LoginPage loginPage = new Pages.LoginPage(driver);
        loginPage.logIn(testUser);
        MainPage mainPage = new Pages.MainPage(driver);
        Assertions.assertEquals(mainPage.getName(), testUser.getName());
        driver.quit();
    }

    @Test
    public void postNext()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://ok.ru");
        User testUser = new Utils.User("Никита Ермаков", "+79922228316", "Nikita123");
        LoginPage loginPage = new Pages.LoginPage(driver);
        loginPage.logIn(testUser);
        MainPage mainPage = new Pages.MainPage(driver);
        mainPage.postSomething("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
}