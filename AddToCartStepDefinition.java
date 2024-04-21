package automationexercise.stepdefs;

public class AddToCartStepDefinition extends RunnerTest{

AddToCart addtoCartPage = new AddToCart(getDriver());

//Launch the Application
@Given("Launch Automation Exercise Application")
public void launchapplication() throws Exception {
addtoCartPage.launchApplication();
}

//Select Produt in PLP Page
@When("Select desired product for Product Listing Page")
public void selectProductinPLP() throws Exception {
addtoCartPage.selectCategory();
addtoCartPage.selectSubCategory();
addtoCartPage.selectProductinPlPage();
}

//Verify Product is Added to Cart
@Then("Verify Add to Cart Popup")
public void AddtoCartPopup() throws Exception {
addtoCartPage.verifyAddtoCartPopupDetails();
}

//Verify Product Details in Shopping Cart Page
@Then("Verify Product details in Shopping Cart Page")
public void ProductDetailsinShoppingCartPage() throws Exception {
addtoCartPage.verifyProductDetailsinShoppingCartPage();
}

//Remove Product from cart
@When("Remove Product in Shopping Cart Page")
public void RemoveProductinShoppingCartPage() throws Exception {
addtoCartPage.removeProductinShoppingCartPage();
}
//Verify Empty Cart 
@Then("Verify Empty Cart Page Details")
public void VerifyEmptyCart() throws Exception {
addtoCartPage.verifyEmptyCartPage();
}
