package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class Pruebas {
    private static final String BASE_URL = "https://reqres.in/";
    RequestSpecification request;
    private static Response response;

    @Test
    public void single_user() {
        RestAssured.baseURI = BASE_URL;
        request = RestAssured.given();
        response = request.given()
                .when()
                .get("/api/users/2")
                .then().log().all()
                .extract().response();
    }
}
