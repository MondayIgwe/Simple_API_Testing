package RestSpec;

import contants.APIEndpoints;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.specification.RequestSpecification;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.given;

public class RequestSpec {

    static Headers headers;

    public static RequestSpecification requestInitialCall() {
        List<Header> headerList = new ArrayList<>();
        headerList.add(new Header("content-type", "application/json"));

        headers = new Headers(headerList);

        return given().baseUri(APIEndpoints.BASE_URI.resource)
                .accept(ContentType.JSON).headers(headers);

    }
}