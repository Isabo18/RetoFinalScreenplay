package us.opencart.abstracta.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import us.opencart.abstracta.models.Data;
import us.opencart.abstracta.steps.AccountStep;
import us.opencart.abstracta.steps.HomeStep;
import us.opencart.abstracta.steps.MessageStep;

import java.util.List;

public class RegisterStepDefinition {

    @Steps
    HomeStep homeStep;
    @Steps
    AccountStep accountStep;
    @Steps
    MessageStep messageStep;
    @Given("^enter the page to register$")
    public void enterThePageToRegister() throws InterruptedException {
        homeStep.openBrowser();
        Thread.sleep(4000);
        homeStep.selectRegister();
        Thread.sleep(6000);
    }
    @When("^I lead the way$")
    public void iLeadTheWay(List<Data> dataList) {
        accountStep.registerUser(dataList.get(0));
    }

    @Then("^you should see the message on the screen$")
    public void youShouldSeeTheMessageOnTheScreen() throws InterruptedException{

       messageStep.verifyMessageRegister();
       accountStep.verifyMessageAccountInvalid();
        Thread.sleep(4000);

    }
}
