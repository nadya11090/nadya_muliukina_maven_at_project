package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ChuckNorrisTest;

public class ChuckNorrisRunner {
    @RunWith(Suite.class)
    @Suite.SuiteClasses({ChuckNorrisTest.class})
    public class Runner {
    }
}
