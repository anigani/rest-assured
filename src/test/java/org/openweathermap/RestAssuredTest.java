package org.openweathermap;

import org.junit.Test;
import static io.restassured.RestAssured.*;

public class RestAssuredTest {

	@Test
	 public void makeSureThatGoogleIsUp() {
		given().when().get("http://www.google.com").then().statusCode(200);
    }
	
	@Test
	 public void openweathermapTest() {
		given().get("http://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().statusCode(200);
   }


}
