package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuComponent extends BasePage{
    public MenuComponent(WebDriver driver, WebElement parent) {
        super(driver, parent);
    }
    @FindBy(css = "#contact-link")
    private WebElement contactLink;

    public String getContactLinkText(){
        return contactLink.getText();
    }
}
