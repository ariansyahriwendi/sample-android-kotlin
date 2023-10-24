package baseClass

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    glue = ["testStep"],
    features = ["src/test/kotlin/BDD"],
    plugin = ["pretty", "html:target/cucumber.json"],
    tags = "@Register"
)

class TestRunner
