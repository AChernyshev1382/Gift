package webServices;


import io.restassured.response.Response;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;


public class Rest{
    public static void main(String[] args){

        Response rs = get("http://s-msk-t-rc-as1/rest/exchange/open/currency");
        given().body("").when().get("").then().body("name");

    }
}