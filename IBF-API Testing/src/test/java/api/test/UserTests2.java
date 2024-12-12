package api.test;

import api.endpoints.UserEndPoints2;
import api.payloads.User;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserTests2 {

    Faker faker;
    User userPayload;
    public Logger logger;//for logs

    @BeforeClass
    public void setup()
    {

        faker = new Faker();
        userPayload =  new User();

        userPayload.setId(faker.idNumber().hashCode());
        userPayload.setUsername(faker.name().username());
        userPayload.setFirstName(faker.name().firstName());
        userPayload.setLastName(faker.name().lastName());
        userPayload.setEmail(faker.internet().safeEmailAddress());
        userPayload.setPassword(faker.internet().password());
        userPayload.setPhone(faker.phoneNumber().cellPhone());

        //Logs
        logger = LogManager.getLogger(this.getClass());
    }

    @Test(priority = 1)
    public void testPostUser()
    {
       logger.info("************* Creating user *************");
       Response response = UserEndPoints2.createUser(userPayload);
       response.then().log().all();
//       Assert.assertEquals(response.getStatusCode(),200);
       logger.info("************* User is created *************");
    }

    @Test(priority = 2)
    public void testGetUserByName()
    {
       logger.info("************* Reading user Info *************");
       Response response = UserEndPoints2.readUser(this.userPayload.getUsername());
       response.then().log().all();
//       Assert.assertEquals(response.getStatusCode(), StatusCodes.successCode);
        logger.info("************* User Info is Displayed *************");
    }

    @Test(priority = 3)
    public void testUpdateUserByName()
    {
        logger.info("************* Updating User *************");
        //Update data using payload
        Response response = UserEndPoints2.updateUser(this.userPayload.getUsername(),userPayload);
        response.then().log().body();

//        Assert.assertEquals(response.getStatusCode(), StatusCodes.successCode);

        Response responseAfterUpdate = UserEndPoints2.readUser(this.userPayload.getUsername());
        responseAfterUpdate.then().log().all();
//        Assert.assertEquals(responseAfterUpdate.getStatusCode(), StatusCodes.successCode);
        logger.info("************* User is updated *************");

    }

    @Test(priority = 4)
    public void testDeleteUserByName()
    {
        logger.info("************* Deleting User *************");
        Response response = UserEndPoints2.deleteUser(this.userPayload.getUsername());
//        Assert.assertEquals(response.getStatusCode(),StatusCodes.successCode);\
        logger.info("************* User Deleted *************");

    }



}
