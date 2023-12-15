package pages;

import component.ComponentFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        ComponentFactory.initComponents(driver, this);
        this.driver = driver;
    }

    public BasePage(WebDriver driver, WebElement parent) {
        PageFactory.initElements(new DefaultElementLocatorFactory(parent),this);
        this.driver = driver;
    }
}
