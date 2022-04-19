package TestLogic;

import Pages.LoginPage;
import Pages.MainPage;
import Utils.User;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.TestInstance.Lifecycle;


public class LogInTest extends BaseTestMethods
{
    @BeforeEach
    public void set()
    {
        WebDriverManager.firefoxdriver().setup();
        OpenStartPage();
    }

    @ParameterizedTest
    @ValueSource( strings = { "afagadg", "asgsadgsbs","*****" })
    @DisplayName("Test for LogIn")
    public void logInClassmates(String password)
    {
        WebDriver driver = driver_;
        User testUser = new Utils.User("Никита Ермаков", "+79922228316", password);
        LoginPage loginPage = new Pages.LoginPage(driver);
        MainPage mainPage = loginPage.logIn(testUser);
        Assertions.assertEquals(mainPage.getName(), testUser.getName());
        System.out.println("Test complete!");
        driver.quit();
    }
}