package testStep

import baseClass.BaseSetUp
import baseClass.BaseStep.register
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class RegisterStep {

    @Given("Account is not registered")
    fun accountIsNotRegistered() {
        BaseSetUp.reset()
    }

    @Given("Login page opened")
    fun loginPageOpened() {
    }

    @When("I click no account yet create one")
    fun iClickNoAccountYetCreateOne() {
        register.notAccountYetCreateOne()
    }

    @And("I input name {string}")
    fun iInputName(x: String) {
        register.name(x)
    }

    @And("I input email {string}")
    fun iInputEmail(x: String) {
        register.email(x)
    }

    @And("I input password {string}")
    fun iInputPassword(x: String) {
        register.password(x)
    }

    @And("I input confirm password {string}")
    fun iInputConfirmPassword(x: String) {
        register.confirmPassword(x)
    }

    @And("I click register")
    fun iClickRegister() {
        register.register()
    }

    @Then("Success to register")
    fun successToRegister() {
    }

    @Then("Show alert registration successful")
    fun showAlertRegistrationSuccessful() {
    }











}