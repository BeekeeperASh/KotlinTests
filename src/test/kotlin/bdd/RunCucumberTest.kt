package bdd

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["src/test/kotlin/bdd/features"],
    glue = ["bdd.step_definitions"]
)
class RunCucumberTest
