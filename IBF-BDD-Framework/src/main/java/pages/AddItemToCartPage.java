package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class AddItemToCartPage {
    WebDriver driver;
    private ElementUtils elementUtils;

    public AddItemToCartPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
        elementUtils =  new ElementUtils(driver);
    }

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    private WebElement searchText;

    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id='add-to-cart-button']")
    private WebElement addToBasketButton;

    @FindBy(xpath = " //*[@id='nav-cart-count']")
    private WebElement basketLink;

    @FindBy(xpath = "//*[@id='activeCartViewForm']")
    private WebElement activeFormBasket;

    public void sendSearchKeys(String txtKeys){
        searchText.sendKeys(txtKeys);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public void clickAddToBasketButton(){
        addToBasketButton.click();
    }

    public void clickBasketLink(){
        basketLink.click();
    }



}
