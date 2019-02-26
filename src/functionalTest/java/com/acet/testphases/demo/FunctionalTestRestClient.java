package com.acet.testphases.demo;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import javax.servlet.http.HttpServletResponse;

public class FunctionalTestRestClient {

  private static String baseUrl = "http://127.0.0.1:8080";

  public static int getSum(String first, String second) {
    return given().
        contentType(ContentType.JSON).
        param("first", first).
        param("second", second).
        when().
        get(baseUrl + "/sum").
        then().
        statusCode(HttpServletResponse.SC_OK).
        contentType(ContentType.JSON).
        extract().
        body().
        as(Integer.class);
  }
}
