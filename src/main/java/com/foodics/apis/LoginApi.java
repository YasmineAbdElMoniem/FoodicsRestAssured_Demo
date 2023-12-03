package com.foodics.apis;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class LoginApi extends BaseApi {
    @Step("Login")
    public Response loginApi(String email, int password, String token) {

        setUpRequestSpecification();
        setUpResponseSpecification();

        // Replace placeholders in the JSON body with actual values
        String requestBody = getJsonFilePath("Login.json")
                .replace("{{password}}", String.valueOf(password))
                .replace("{{email}}", email)
                .replace("{{token}}", token);


        return RestAssured.given()
                .spec(requestSpec).log().all()
                .when()
                .body(requestBody)
                .post(BaseApi.apiPath.LOGIN.getValue())
                .then().spec(responseSpec).log().all()
                .extract().response();
    }

    @Step("Get The Access Token")
    public String getAccessToken(Response response) {
        JsonPath jsonPath = response.jsonPath();
        return jsonPath.getString("token");
    }

    @Step("Make Sure The Token Not Empty")
    public Boolean checkTokenNotEmpty(Response response) {
        JsonPath jsonPath = response.jsonPath();
        return !jsonPath.getString("token").isEmpty();
    }
}
