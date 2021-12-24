package tests;

import org.junit.Test;
import pages.ChuckNorrisPage;

public class ChuckNorrisTest {
    ChuckNorrisPage chuckNorrisPage = new ChuckNorrisPage();

    @Test
    public void changingName(){
    chuckNorrisPage.jokeNameLastname("Vanya", "Ivanov");
    }
}
