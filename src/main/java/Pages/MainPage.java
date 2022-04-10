package Pages;

import Utils.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MainPage extends BasePage{
    private class TextWindow
    {
        private String xPathToWindow = "//*[@data-module = 'postingForm/mediaText']";
        private String xPathToButton = "posting_submit button-pro";
        private WebDriver driver_;
        public TextWindow(WebDriver driver)
        {
            driver_ = driver;
        }
        public TextWindow insertText(String text)
        {
            WebElement loginField = driver_.findElement(By.xpath(xPathToWindow));
            loginField.sendKeys(text);
            return this;
        }

        public TextWindow post()
        {
            driver_.findElement(By.xpath(xPathToButton)).click();
            return this;
        }
     }
    public MainPage(WebDriver driver)
    {
        super(driver);
    }

    public MainPage postSomething(String text)
    {
        String xPathToUserTopic = "//*[@class = 'pf-head_itx_a']";
        WebElement topic = webDriver_.findElement(By.xpath(xPathToUserTopic));
        topic.click();
        TextWindow textWindow = new TextWindow(webDriver_).insertText(text);
        textWindow.post();
        return this;
    }

    public String getName()
    {
        String xPathToName = "//*[@class='tico ellip']";
        return webDriver_.findElement(By.xpath(xPathToName)).getText();
    }
}
