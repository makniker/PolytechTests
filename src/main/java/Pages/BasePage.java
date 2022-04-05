package Pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    private final WebDriver webDriver_;

    public BasePage(WebDriver webDriver)
    {
        webDriver_ = webDriver;
    }
}
