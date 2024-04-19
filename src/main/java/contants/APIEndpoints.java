package contants;

public enum APIEndpoints {
    BASE_URI("https://reqres.in/api/"),
    USERS_ENDPOINT_BY_QUERYPARAM("users?page=2"),
    CREATE_USERS_ENDPOINT("users"),
    UPDATE_USERS_ENDPOINT("users/2"),
    DELETE_ENDPOINT("users/2"),
    REGISTER_ENDPOINT("register"),
    CREATE_USER_ENDPOINT("users");
    public final String resource;

    APIEndpoints(String resource){
        this.resource = resource;
    }
}
