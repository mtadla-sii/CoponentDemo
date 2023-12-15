package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductMiniatureComponent extends BasePage{
    public ProductMiniatureComponent(WebDriver driver, WebElement parent) {
        super(driver, parent);
    }
    @FindBy(css = ".product-title")
    private WebElement name;
    public String getName(){
        return name.getText();
    }
}
