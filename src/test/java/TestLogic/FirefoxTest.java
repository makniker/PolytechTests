package TestLogic;

import Pages.LoginPage;
import Pages.MainPage;
import Utils.TextWindow;
import Utils.User;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxTest
{
    public WebDriver createDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://ok.ru");
        return driver;
    }

    @Test
    public void logInClassmates() {
        WebDriver driver = createDriver();
        try
        {
            User testUser = new Utils.User("Никита Ермаков", "+79922228316", "*******");
            LoginPage loginPage = new Pages.LoginPage(driver);
            MainPage mainPage = loginPage.logIn(testUser);
            Assertions.assertEquals(mainPage.getName(), testUser.getName());
            System.out.println("Test complete!");
        }
        catch(Exception e)
        {
            System.out.println("Test failed!");
        }
        driver.quit();
    }

    @Test
    public void postText()
    {
        WebDriver driver = createDriver();
        try
        {
            User testUser = new Utils.User("Никита Ермаков", "+79922228316", "*****");
            LoginPage loginPage = new Pages.LoginPage(driver);
            MainPage mainPage = loginPage.logIn(testUser)
                    .addTextWindow(new TextWindow(driver))
                    .postSomething("Hello world");
            if (mainPage.textWindow_.isTextAdded("Hello world"))
            {
                System.out.println("Test complete!");
            }
            else
            {
                System.out.println("Test failed!");
            }
        }
        catch(Exception e)
        {
            System.out.println("Test failed!");
        }
        driver.quit();
    }
}