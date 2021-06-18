package us.opencart.abstracta.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AccountPage extends PageObject {

    By userName= By.name("firstname");
    By lastName = By.name("lastname");
    By email = By.name("email");
    By telephone = By.name("telephone");
    By password = By.name("password");
    By confirmPassword = By.name("confirm");
    By checkIAgree = By.name("agree");
    By continueButton = By.xpath("//input[@type = 'submit']");

    public By messageAccountInvalid = By.id("//*[@id=\"account-register\"]/div[1]");


    public void setUserName(String user) {
        getDriver().findElement(userName).sendKeys(user);
    }
    public void setLastName (String lastNameUser) {
        getDriver().findElement(lastName).sendKeys(lastNameUser);
    }
    public void  setEmail(String emailUser){
        getDriver().findElement(email).sendKeys(emailUser);
    }
    public void setTelephone (String telephoneUser) {
        getDriver().findElement(telephone).sendKeys(telephoneUser);
    }
    public void setPassword(String passwordUser){
        getDriver().findElement(password).sendKeys(passwordUser);
    }
    public void setConfirmPassword(String confirmPasswordUser){
        getDriver().findElement(confirmPassword).sendKeys(confirmPasswordUser);
    }
    public void clickCheckIAgree(){
        getDriver().findElement(checkIAgree).click();
    }
    public void clickContinueButton(){
        getDriver().findElement(continueButton).click();
    }

    public By getMessageAccountInvalid(){
        return messageAccountInvalid;
    }


}
