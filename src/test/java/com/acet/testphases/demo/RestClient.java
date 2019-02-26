package com.acet.testphases.demo;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

import io.restassured.http.ContentType;
import javax.servlet.http.HttpServletResponse;

public class RestClient {

  private static String baseUrl = "";

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
