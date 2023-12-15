package pages;

import component.InitComponent;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class HomePage extends BasePage {
    @InitComponent(css = "#header")
    private MenuComponent menu;

    @InitComponent(css= ".js-product-miniature")
    private List<ProductMiniatureComponent> miniatures;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void printContactTest(){
        System.out.println(menu.getContactLinkText());
    }
    public void printProductNames(){
        for (ProductMiniatureComponent miniature: miniatures){
            System.out.println(miniature.getName());
        }
    }

}
