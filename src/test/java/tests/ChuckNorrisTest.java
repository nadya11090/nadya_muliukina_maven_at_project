package tests;

import org.junit.Test;
import pages.ChuckNorrisPage;
import static org.hamcrest.Matchers.*;

public class ChuckNorrisTest {
    ChuckNorrisPage chuckNorrisPage = new ChuckNorrisPage();

    @Test
    public void changingName(){
    chuckNorrisPage.jokeNameLastname("Vanya", "Ivanov").body("type", equalTo("success"));
    }

    @Test
    public void changingNameContentTypeTest() {
        chuckNorrisPage.jokeNameLastname("Vanya", "Ivanov").assertThat().header("Content-Type", "application/json");
    }

    @Test
    public void changingNameContainsNameTest(){
        chuckNorrisPage.jokeNameLastname("Vanya", "Ivanov").body("value.joke", containsString("Vanya"));
    }

    @Test
    public void randomJokeTest() {
        chuckNorrisPage.randomJoke().body("value.joke", containsString("Chuck"));
    }

    @Test
    public void randomJokeContentTest() {
        chuckNorrisPage.randomJoke().assertThat().header("Content-Type", "application/json");
    }
}
