package Day18;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"pretty", "summary"},
            glue = {"Day18"},
            features = {"src/test/resources/features/mylovely.feature"},
            strict = true,
            tags = {"@QA"}
    )
public class CucRunner {
}


