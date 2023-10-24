package testStep.hooks

import baseClass.BaseSetUp
import io.cucumber.java.After
import io.cucumber.java.Before

class Hooks {

    @Before
    fun setUp() {
        BaseSetUp.setup()
    }

//    @After
//    fun tearDown() {
//        BaseSetUp.teardown()
//    }


}