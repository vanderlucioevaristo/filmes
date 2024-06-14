package filmes;

import org.junit.Test;
import utils.Globals;

import static io.restassured.RestAssured.given;

public class FilmeApi {
    Globals globals = new Globals();
    @Test
    public void login(){

        given()
                .baseUri(globals.getBaseUri())
                .basePath("/authentication")
                .header("Content-Type", "application/json")
                .header("Authentication", globals.getAuthorization())
                .when().get()
                .then()
                .statusCode(200);

    }

}
