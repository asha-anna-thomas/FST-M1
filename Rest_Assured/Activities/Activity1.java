package activities;

import java.util.HashMap;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Activity1 {
	
	@Test (priority = 1)
	public void addNewPet() {
		HashMap<String, Object> mapReq = new HashMap<>();
		mapReq.put("id", 77232);
		mapReq.put("name", "Riley");
		mapReq.put("status", "alive");
		
		Response response = RestAssured.given().
									baseUri("https://petstore.swagger.io/v2/pet").
									header("Content-Type", "application/json").
									body(mapReq).
							when().post();
		
		//Assertions
		response.then().body("id", Matchers.equalTo(77232));
		response.then().body("name", Matchers.equalTo("Riley"));
		response.then().body("status", Matchers.equalTo("alive"));
	}
	
	@Test (priority = 2)
	public void getPetInfo() {
		Response response = RestAssured.given().
								baseUri("https://petstore.swagger.io/v2/pet").
								header("Content-Type", "application/json").
							when().pathParam("petId", 77232).
								get("/{petId}");
		
		//Assertions
		response.then().body("id", Matchers.equalTo(77232));
		response.then().body("name", Matchers.equalTo("Riley"));
		response.then().body("status", Matchers.equalTo("alive"));
	}
	
	@Test (priority = 3)
	public void deletePet() {
		Response response = RestAssured.given().
								baseUri("https://petstore.swagger.io/v2/pet").
								header("Content-Type", "application/json").
								when().pathParam("petId", 77232).delete("/{petId}");
		
		response.then().body("code", Matchers.equalTo(200));
		response.then().body("message", Matchers.equalTo("77232"));
	}

}
