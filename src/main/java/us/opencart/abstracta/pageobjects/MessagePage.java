package us.opencart.abstracta.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class MessagePage extends PageObject {

        By messageRegister = By.id("//*[@id='account-register']/div[1]");


        public By getMessageRegister(){
            return messageRegister;
        }
}
