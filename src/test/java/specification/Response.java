package specification;

import enums.Cities;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import testBase.TestBaseApi;

import static org.hamcrest.Matchers.hasValue;
import static org.hamcrest.Matchers.is;

public class Response extends TestBaseApi {
    public static ResponseSpecification getResponseSpecification(Cities cities) {
        return new ResponseSpecBuilder()
                .expectBody("name", is(cities.getCityName()))
                .expectBody("sys", hasValue(cities.getCountry()))
                .expectBody("id", is(cities.getId()))
                .expectStatusCode(200)
                .build();
    }
}
