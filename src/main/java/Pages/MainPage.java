package Pages;

import Utils.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver)
    {
        super(driver);
    }

    public MainPage postSomething(String text)
    {
        String xPathToUserTopic = "//*[@class = 'pf-head_itx_a']";
        WebElement topic = webDriver_.findElement(By.xpath(xPathToUserTopic));
        topic.sendKeys(text);
        return this;

    }

    public String getName()
    {
        String xPathToName = "//*[@class='tico ellip']";
        return webDriver_.findElement(By.xpath(xPathToName)).getText();
    }
}
