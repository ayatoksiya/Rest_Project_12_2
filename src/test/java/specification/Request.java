package specification;

import enums.Cities;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import testBase.TestBaseApi;


public class Request extends TestBaseApi {
    public static RequestSpecification getRequestSpecificationByCityName(Cities cities) {
        return new RequestSpecBuilder()
                .setBaseUri(System.getProperty("app_url"))
                .setBasePath(System.getProperty("weather"))
                .addParam("appId", System.getProperty("appId"))
                .addParam(CITY, cities.getCityName())
                .setContentType(ContentType.JSON)
                .build();
    }

    public static RequestSpecification getRequestSpecificationByCityId(Cities cities) {
        return new RequestSpecBuilder()
                .setBaseUri(System.getProperty("app_url"))
                .setBasePath(System.getProperty("weather"))
                .addParam("appId", System.getProperty("appId"))
                .addParam(ID, cities.getId())
                .setContentType(ContentType.JSON)
                .build();
    }
}
