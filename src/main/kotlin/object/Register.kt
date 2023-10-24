package `object`

import baseClass.BaseSetUp.click
import baseClass.BaseSetUp.input
import org.openqa.selenium.By

class Register {

    private val notAccountYetCreateOne = By.ById("textViewLinkRegister")
    fun notAccountYetCreateOne() {
        click(notAccountYetCreateOne)
    }

    private val name = By.id("textInputEditTextName")
    fun name(x: String) {
        input(name, x)
    }

    private val email = By.id("textInputEditTextEmail")
    fun email(x: String) {
        input(email, x)
    }
    private val password = By.id("textInputEditTextPassword")
    fun password(x: String) {
        input(password, x)
    }

    private val confirmPassword = By.id("textInputEditTextConfirmPassword")
    fun confirmPassword(x: String) {
        input(confirmPassword, x)
    }

    private val register = By.ById("appCompatButtonRegister")
    fun register() {
        click(register)
    }


}