package API;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
	public class APITestMethods {
	    String baseUri = "https://reqres.in";
	    @Test
	    public void testGetRequest() {
	        RestAssured.baseURI = baseUri;
	        given()
	            .when()
	            .get("/api/users/2")
	            .then()
	            .statusCode(200)
	            .body("data.first_name", equalTo("Janet"));
	    }
	    @Test
	    public void testPostRequest() {
	        JSONObject requestBody = new JSONObject();
//	        requestBody.put("x-api-key", "reqres-free-v1");
	        requestBody.put("name", "John");
	        requestBody.put("job", "developer");
	        given()
	            .baseUri(baseUri)
	            .header("x-api-key","reqres-free-v1")
	            .header("Content-Type", "application/json")
	            .body(requestBody.toString())
	        .when()
	            .post("/api/users")
	        .then()
	            .statusCode(201)
	            .body("name", equalTo("John"));
	    }

}
