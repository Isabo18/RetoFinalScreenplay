package us.opencart.abstracta.steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import us.opencart.abstracta.pageobjects.HomePage;

public class HomeStep {

    HomePage homePage = new HomePage();

    @Step
    public void openBrowser(){
        homePage.open();
    }

    @Step
    public void selectRegister(){
        homePage.clickMyAccount();
        homePage.waitForCondition().until(ExpectedConditions.visibilityOfElementLocated(homePage.register));
        homePage.clickRegister();
        homePage.clickButtonInsecureContent();
        homePage.clickButtonAccessInsecureContent();
    }
}
