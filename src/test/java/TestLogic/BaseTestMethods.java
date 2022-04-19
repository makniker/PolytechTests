package TestLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTestMethods
{
    static WebDriver driver_ = new FirefoxDriver();
    public void OpenStartPage()
    {
        driver_.get("https://ok.ru");
    }
}
