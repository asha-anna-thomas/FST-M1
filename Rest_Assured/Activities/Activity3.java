package activities;

import java.io.IOException;
import java.util.HashMap;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Activity3 {
	
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	
	@BeforeClass
	public void setUp() {
		requestSpec = new RequestSpecBuilder().
							addHeader("Content-Type", "application/json").
							setBaseUri("https://petstore.swagger.io/v2/pet").build();
		
		responseSpec = new ResponseSpecBuilder().
							expectStatusCode(200).
							expectContentType("application/json").
							expectBody("status", Matchers.equalTo("alive")).
							build();
							
	}
	
	@DataProvider(name = "petInfo")
	public Object[][] petInfoProvider() {
		// Setting parameters to pass to test case
		Object[][] testData = new Object[][] { 
			{ 77232, "Riley", "alive" }, 
			{ 77233, "Hansel", "alive" } 
		};
		return testData;
	}
	
	
	@Test(priority=1, dataProvider = "petInfo")
	// Test case using a DataProvider
	public void addPets(int petId, String petName, String petStatus) {
		HashMap<String, Object> reqBody = new HashMap<>();
		reqBody.put("id", petId);
		reqBody.put("name", petName);
		reqBody.put("status", petStatus);
		
		RestAssured.given().spec(requestSpec) 
			.body(reqBody) 
		.when().post() 
		.then().spec(responseSpec) 
		.body("name", Matchers.equalTo(petName)); 
	}
 
	// Test case using a DataProvider
	@Test( priority=2, dataProvider = "petInfo")
	public void getPets(int petId, String petName, String petStatus) {
		RestAssured.given().spec(requestSpec) 
			.pathParam("petId", petId) 
			.log().all() 
		.when()
			.get("/{petId}") 
		.then().spec(responseSpec) 
		    .body("name", Matchers.equalTo(petName)) 
		    .log().all(); 
	}
 
	// Test case using a DataProvider
	@Test(priority=3, dataProvider = "petInfo")
	public void deletePets(int petId, String petName, String petStatus) throws IOException {
		RestAssured.given().spec(requestSpec) 
			.pathParam("petId", petId) 
		.when()
			.delete("/{petId}") 
		.then()
			.body("code", Matchers.equalTo(200))
			.body("message", Matchers.equalTo(""+petId)); 
	}

}
