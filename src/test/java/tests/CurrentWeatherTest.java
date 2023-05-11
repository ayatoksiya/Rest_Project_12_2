package tests;

import enums.Cities;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import specification.Request;
import specification.Response;
import testBase.TestBaseApi;

import static io.restassured.RestAssured.given;

public class CurrentWeatherTest extends TestBaseApi {

    @ParameterizedTest
    @EnumSource(value = Cities.class)
    @Tag("weather")
    public void shouldGetWeatherNyCityName(Cities cities) {
        given().
                spec(Request.getRequestSpecificationByCityName(cities))
                .when()
                .get()
                .then()
                .spec(Response.getResponseSpecification(cities));
    }
}
