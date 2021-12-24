package pages;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ChuckNorrisPage {
    private static final String URL = "https://api.icndb.com";
    private static final String FIRST_LAST_NAME = "jokes/random?firstName=%s&lastName=%s";
    private static final String RANDOM_JOKE = "jokes/random";
    private static final String MULTIPLE_RANDOM_JOKE = "jokes/random/%d";
    private static final String SPECIFIC_JOKE = "jokes/%d";
    private static final String NUMBER_OF_JOKES = "jokes/count";

    private RequestSpecification chuckSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(URL)
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }

    private ValidatableResponse extractableResponse(String url) {
        return RestAssured
                .given()
                .spec(chuckSpec())
                .when()
                .get(url)
                .then()
                .statusCode(200);
    }

    private String urlSetter(String firstName, String lastName) {
        return String.format(FIRST_LAST_NAME, firstName, lastName);
    }

    private String urlSetter(String url) {
        return url;
    }

    public ValidatableResponse jokeNameLastname(String fistName, String lastName) {
        return extractableResponse(urlSetter(fistName, lastName));
    }

    public ValidatableResponse randomJoke() {
        return extractableResponse(urlSetter(RANDOM_JOKE));
    }

    public ValidatableResponse multipleRandomJoke(int number) {
        return extractableResponse(urlSetter(String.format(MULTIPLE_RANDOM_JOKE, number)));
    }

    public ValidatableResponse getSpecificJoke(int id) {
        return extractableResponse(urlSetter(String.format(SPECIFIC_JOKE, id)));
    }

    public ValidatableResponse getNumberOfJokes() {
        return extractableResponse(urlSetter(NUMBER_OF_JOKES));
    }

}
