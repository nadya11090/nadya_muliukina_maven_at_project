package Day19.suites.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"Day19"},
        features = {"src/test/resources/features/fake/FakeTwo.feature"}

)
public class FakeRunner2 {
}

