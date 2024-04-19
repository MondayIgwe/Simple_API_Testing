package requsetPayload;

import org.json.simple.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class Payload {

    public static Map<String, String> createUserPayload() {
        Map<String, String> payload = new HashMap<>();
        payload.put("name", "john");
        payload.put("job", "automation tester");
        return payload;
    }

    public static Map<String, String> updateUserPayload() {
        Map<String, String> payload = new HashMap<>();
        payload.put("name", "john");
        payload.put("job", "automation tester guru");
        return payload;
    }

    public static Map<String, Object> registerUserPayload() {
        String[] courses = {"math", "english", "science"};
        Map<String, Object> payload = new HashMap<>();
        payload.put("email", "eve.holt@reqres.in");
        payload.put("password", "pistol");
        return payload;
    }

    public static String registerUserPayload(int val) {
        JSONObject jsonObjectPayload = new JSONObject();
        jsonObjectPayload.put("email", "eve.holt@reqres.in");
        jsonObjectPayload.put("password", "pistol");
        System.out.println(val);
        return jsonObjectPayload.toJSONString();
    }
}
