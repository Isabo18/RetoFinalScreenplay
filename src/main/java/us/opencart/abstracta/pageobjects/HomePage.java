package us.opencart.abstracta.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://opencart.abstracta.us/")
public class HomePage extends PageObject {

    By myAccount = By.xpath("//span[contains(text(), 'My Account')]");
    public By register = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a");
    By buttonInsecureContent = By.xpath("//button[@id='details-button']");
    By buttonAccessInsecureContent = By.xpath("//a[@id='proceed-link']");

    public void clickMyAccount() {

        getDriver().findElement(myAccount).click();
    }
    public void clickRegister() {
        getDriver().findElement(register).click();
    }
    public void clickButtonInsecureContent(){
        getDriver().findElement(buttonInsecureContent).click();
    }
    public void clickButtonAccessInsecureContent() {
        getDriver().findElement(buttonAccessInsecureContent).click();
    }
}
