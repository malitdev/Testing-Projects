package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AddItemToCartPage;
import utils.CommonUtils;

public class AddItemToCart {
    WebDriver driver;

    private AddItemToCartPage addItemToCartPage;
    private CommonUtils commonUtils;


    @Given("I navigate to amazon website")
    public void iNavigateToAmazonWebsite() {
        driver = DriverFactory.getDriver();
        addItemToCartPage = new AddItemToCartPage(driver);
    }

    @When("I enter Acer laptop into the search field")
    public void iEnterAcerLaptopIntoTheSearchField(String searchKeys) {
        addItemToCartPage.sendSearchKeys(searchKeys);
    }

    @And("I click on the search button")
    public void iClickOnTheSearchButton() {
        addItemToCartPage.clickSearchButton();
    }

    @And("I add searched item to the cart")
    public void iAddSearchedItemToTheCart() {
        addItemToCartPage.clickAddToBasketButton();
    }

    @And("I click on basket button")
    public void iClickOnBasketButton() {
        addItemToCartPage.clickBasketLink();
    }

    @Then("I verify Acer laptop")
    public void iVerifyAcerLaptop() {
    }
}
