package StepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AdditionSteps {
    private Calculator calculator;
    private int result;

    public AdditionSteps() {
        this.calculator = new Calculator();
    }

    @Before
    public void setUp() {
        this.result = -999;
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        this.result = this.calculator.addTwoNumbers(arg0, arg1);
    }

    @When("I add {int}, {int}, and {int}")
    public void iAddOneTwoAndThree(int arg0, int arg1, int arg2) {
        this.result = this.calculator.addThreeNumbers(arg0, arg1, arg2);
    }

    @When("I add {int}, {int}, {int}, and {int}")
    public void i_add_and(int arg0, int arg1, int arg2, int arg3) {
        this.result = this.calculator.addFourNumbers(arg0, arg1, arg2, arg3);
    }

    @Then("the calculator returns {int}")
    public void theCalculatorReturns(int arg0) {
        Assert.assertEquals(this.result, arg0);
    }


}
