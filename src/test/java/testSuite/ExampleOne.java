package testSuite;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import static contants.APIEndpoints.*;
import static RestSpec.RequestSpec.*;
import static requsetPayload.Payload.createUserPayload;
import static requsetPayload.Payload.updateUserPayload;

public class ExampleOne {

    @Test
    public void getCall() {
        requestInitialCall().queryParam(USERS_ENDPOINT_BY_QUERYPARAM.resource).get()
                .then().log().all();
    }

    @Test
    public void postCall() {
        requestInitialCall().body(createUserPayload())
                .when().post(CREATE_USERS_ENDPOINT.resource)
                .then().statusCode(HttpStatus.SC_CREATED).log().all();
    }

    @Test
    public void putCall() {
        requestInitialCall().body(updateUserPayload())
                .when().put(UPDATE_USERS_ENDPOINT.resource)
                .then().statusCode(HttpStatus.SC_OK).log().all();
    }

    @Test
    public void deleteCall() {
        Response response = requestInitialCall()
                .delete(DELETE_ENDPOINT.resource);

        int statuscode = response.statusCode();
        ResponseBody responseBody = response.getBody().prettyPeek();
        System.out.println(statuscode);
        System.out.println(responseBody);
    }
}
