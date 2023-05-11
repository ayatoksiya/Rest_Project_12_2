package testBase;

import configuration.Properties;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.jupiter.api.BeforeAll;


public class TestBaseApi {
    protected static Properties properties;
    public static String CITY = "q";
    public static String ID = "id";

    @BeforeAll
    public static void setup() {
        properties = configuration.Properties.getInstance();
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}
