package api.endpoints;

import api.payloads.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;


//UserEndPoints.java
//Created To perform CRUD operations
public class UserEndPoints2 {

    //Gets url from properties
    static ResourceBundle getURL ()
    {
         ResourceBundle routes = ResourceBundle.getBundle("routes"); //load properties file
         return routes;
    }

    public static Response createUser(User payload)
    {
        //Get url into a variable from the properties file
        String post_url= getURL().getString("post_url");
        Response response=given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(Routes.post_url);

        return response;


    }

    public static Response readUser(String userName){
        String get_url= getURL().getString("get_url");

        Response response=given()
                .pathParam("username",userName)
                .when()
                .get(Routes.post_url);

        return response;


    }

    public static Response updateUser(String userName, User payload){

        String update_url= getURL().getString("update_url");

        Response response=given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("username", userName)
                .body(payload)
                .when()
                    .put(Routes.update_url);

        return response;


    }


    public static Response deleteUser(String userName){

        String delete_url= getURL().getString("delete_url");
        Response response=given()
                .pathParam("username", userName)
                .when()
                    .delete(Routes.delete_url);

        return response;


    }

}
