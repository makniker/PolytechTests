package TestLogic;

import Pages.LoginPage;
import Pages.MainPage;
import Utils.TextWindow;
import Utils.User;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class PostTest extends BaseTestMethods
{
    @BeforeAll
    public static void set()
    {
        WebDriverManager.firefoxdriver().setup();
    }

    @Test
    @DisplayName("Test for posting something")
    public void postText(String text)
    {
        OpenStartPage();
        WebDriver driver = driver_;
        User testUser = new Utils.User("Никита Ермаков", "+79922228316", "****");
        LoginPage loginPage = new Pages.LoginPage(driver);
        TextWindow textWindow = new TextWindow(driver);
        MainPage mainPage = loginPage.logIn(testUser)
                .addTextWindow(textWindow)
                .postSomething(text);
        textWindow.post();
        String postedText = textWindow.getText();
        Assertions.assertEquals(text, postedText);
        driver.quit();
    }
}
