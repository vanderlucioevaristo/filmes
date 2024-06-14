package utils;
import io.restassured.http.Header;

public class Globals {
    private String baseUri = "https://api.themoviedb.org/3";
    private String content = "application/json";
    private String authorization = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJlZTU4NTA3ZDJjZDFkZDA1NTRlZGYyYTA1ZTUzNmE2NyIsInN1YiI6IjY2NmM3OTJhYjA2NGZhZTMxY2RlMDk0YSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.z2j7mB1zwksL95lXinJeMZfCCyMPIJCkr9T23CDMGN8";

    public String getBaseUri(){
        return baseUri;
    }

    public Header getContent(){
        Header header = new Header("Content-Type", content);
        return header;
    }

    public String getAuthorization(){
        Header header = new Header("Authorization",authorization);
        return authorization;
    }

}
