import contants.APIEndpoints;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static contants.APIEndpoints.*;
import static io.restassured.RestAssured.given;
import static RestSpec.RequestSpec.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleOne {
    static Headers headers;
    List<Header> headerList = new ArrayList<>();

    @Test
    public void getCall() {
        requestInitialCall().queryParam(USERS_ENDPOINT_BY_QUERYPARAM.resource).get()
                .then().log().all();
    }

    @Test
    public void postCall() {

        Map<String, String> bodyPayload = new HashMap<>();
        bodyPayload.put("name", "john brown");
        bodyPayload.put("job", "automation tester");

        requestInitialCall().body(bodyPayload)
                .when().post(BASE_URI.resource + USERS_ENDPOINT.resource)
                .then().statusCode(HttpStatus.SC_CREATED).log().all();
    }

    @Test
    public void putCall() {
        Map<String, String> bodyPayload = new HashMap<>();
        bodyPayload.put("name", "john pink");
        bodyPayload.put("job", "automation tester");

        requestInitialCall().body(bodyPayload)
                .when().put(BASE_URI.resource + USERS_ENDPOINT.resource)
                .then().statusCode(HttpStatus.SC_OK).log().all();
    }

    @Test
    public void deleteCall() {
        Response response = requestInitialCall().when().delete(BASE_URI.resource + USERS_ENDPOINT.resource);

        int statuscode = response.statusCode();
        ResponseBody responseBody = response.getBody().prettyPeek();
        System.out.println(statuscode);
        System.out.println(responseBody);
    }
}
