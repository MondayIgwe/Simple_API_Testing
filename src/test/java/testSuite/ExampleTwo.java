package testSuite;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import static RestSpec.RequestSpec.requestInitialCall;
import static io.restassured.RestAssured.given;
import static java.lang.StringTemplate.STR;

public class ExampleTwo {

    @Test
    public void getUsersByQuery() {
        requestInitialCall()
                .pathParam("userPath", "users")
                .queryParam("page", 2)
                .when().get("https://reqres.in/api/{userPath}")
                .then().statusCode(200).log().body().log().headers().log().cookies();
    }

    @Test
    public void getGoogleCookie() {
        Response response = given().when()
                .get("https://www.google.com/");

        Headers headers = response.getHeaders();
        headers.forEach(System.out::println);

        for (Header header : headers) {
            String head = response.getHeader(header.getName());
            System.out.println(head);
        }

        Map<String, String> cookies = response.getCookies();
        System.out.println(cookies);
        Set<String> setOfCookiesKey = cookies.keySet();
        System.out.println(STR."\{setOfCookiesKey}\n");

        System.out.println(cookies.values());

        for (String k : cookies.keySet()) {
            String value_ = response.getCookie(k);

            if (Objects.equals(value_, "AEC"))
                System.out.println(STR."\{k} \{value_}");
        }

    }
}
