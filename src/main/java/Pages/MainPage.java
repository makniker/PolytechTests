package Pages;

import Utils.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver_;
    public MainPage(WebDriver driver)
    {
        driver_ = driver;
    }

    public String getName()
    {
        String xPathToName = "//*[@class='tico ellip']";
        return driver_.findElement(By.xpath(xPathToName)).getText();
    }
}
