package Pages;
import Utils.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver_;
    public LoginPage(WebDriver driver)
    {
        driver_ = driver;
    }

    public void logIn(User user)
    {
        String xPathToPassword = "//*[@id = 'field_password']";
        String xPathToButton = "//*[@class = 'button-pro __wide']";
        String xPathToLogin = "//*[@id = 'field_email']";
        WebElement loginField = driver_.findElement(By.xpath(xPathToLogin));
        loginField.sendKeys(user.getLogin());
        WebElement passwordField = driver_.findElement(By.xpath(xPathToPassword));
        passwordField.sendKeys(user.getPassword());
        driver_.findElement(By.xpath(xPathToButton)).click();
    }
}
