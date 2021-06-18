package us.opencart.abstracta.steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import us.opencart.abstracta.pageobjects.MessagePage;
import org.junit.jupiter.api.Assertions;


public class MessageStep {
    MessagePage messagePage = new MessagePage();

    @Step
    public void verifyMessageRegister(){

        messagePage.waitForCondition().until(ExpectedConditions.invisibilityOfElementLocated(messagePage.getMessageRegister()));
    }


}

