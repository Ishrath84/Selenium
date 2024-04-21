package automationexercise.pages
  
public class AddToCartPage extends BaseClass{
  
  public AddToCartPage(WebDriver driver)
  {
    PageFactory.initElements(new WebDriverDecorator(driver,Duration.ofSeconds(30)), page:this);
  }
  
String driverName = getDriver().toString();
  
@FindBy(xpath = '//h4[@class="panel-title"]/a[@href="#Women"]')
  public WebElement selectWomenCategory;
  
@FindBy(xpath = "//h4[@class="panel-title"]//following::a[@href="/category_products/1"]")
  public WebElement selectSubCategory;  
  
@FindBy(xpath = "//div[@class="features_items"]/h2[@class=contains(text(),'Women - Dress Products')]"
  public WebElement verifyPLPageHeader;  

@FindBy(xpath = "//div[@class="single-products"]/following::i[@class="fa fa-shopping-cart"][1]")
  public WebElement selectProductinPLP;
  
@FindBy(xpath = "/h4[contains(text(),'Added!')]")
  public WebElement verifyAddtoCart; 

@FindBy(xpath = "//h4[contains(text(),'Added!')]/following::a[@href="/view_cart"]")
  public WebElement viewCartLink;

  @FindBy(xpath = "//section[@id="cart_items"]//following::li[contains(text(),'Shopping Cart')]")
  public WebElement verifyShoppingCartBreadCrumbs;

  @FindBy(xpath = "//table[@id="cart_info_table"]//td[@class="cart_description"]")
  public WebElement verifyProductinShoppingCart;

  @FindBy(xpath = "//td[@class="cart_quantity_delete"]")
  public WebElement removeProductfromCart;

  @FindBy(xpath = "//span[@id="empty_cart"]//following::b[contains(text(),'Cart is empty!')]")
  public WebElement verifyEmptyCart;

  //Select Category
  public void selectCategory() throws Exception {
if (selectWomenCategory.isDisplayed()){
  if (selectWomenCategory.isEnabled())
  {
  selectWomenCategory.click();
     System.out.println("User is able to click the category"); 
  }
  else{
   System.out.println("selectWomenCategory is not Enabled"); 
  }
}
  else{
     System.out.println("selectWomenCategory is not displayed");   
  }
    return false;
  }
  
  //Select Sub Category
    public void selectSubCategory() throws Exception {
if (selectSubCategory.isDisplayed()){
  if (selectSubCategory.isEnabled())
  {
  selectSubCategory.click();
     System.out.println("User is able to click the Sub category"); 

  }
  else{
   System.out.println("selectSubCategory is not Enabled"); 
  }
}
  else{
     System.out.println("selectSubCategory is not displayed");   
  }
    return false;
  }
  // selectSProductinPLPPage
    public void selectSProductinPlPage() throws Exception {
      //Verify PLP Page Header
      String ActualText = verifyPLPageHeader.getText();
      String ExpectedText = 'Women - Dress Products';
      Assert.assertEquals(ActualText,ExpectedText);

      //Select the product in PLP    
if (selectProductinPLP.isDisplayed()){
  if (selectProductinPLP.isEnabled())
  {
  selectProductinPLP.click();
     System.out.println("User is able to select the product in PLP"); 
  }
  else{
   System.out.println("selectProductinPLP is not Enabled"); 
  }
}
  else{
     System.out.println("selectProductinPLP is not displayed");   
  }
    return false;
  }
  
// Add Product to Cart
public void verifyAddtoCartPopupDetails() throws Exception {
      //Verify Add to Cart Popup
      String ActualText = verifyAddtoCart.getText();
      String ExpectedText = 'Added!';
      Assert.assertEquals(ActualText,ExpectedText);
//Navigate to View Cart  
  if (viewCartLink.isDisplayed()){
  if (viewCartLink.isEnabled())
  {
  viewCartLink.click();
     System.out.println("User is able to navigate to view cart"); 
  }
  else{
   System.out.println("viewCartLink is not Enabled"); 
  }
}
  else{
     System.out.println("viewCartLink is not displayed");   
  }
    return false;
  }

// Verify Product in Shopping Cart
public void verifyProductDetailsinShoppingCartPage() throws Exception {
      //Verify ShoppingCart BreadCrumbs
      String ActualText = verifyShoppingCartBreadCrumbs.getText();
      String ExpectedText = 'Shopping Cart';
      Assert.assertEquals(ActualText,ExpectedText);

  // verify product details in Shopping Cart
  if (verifyProductinShoppingCart.isElementPresent())
  {
     System.out.println("User is able to see the product details in Shopping Cart Page"); 
  }
  else{
   System.out.println("User is not able to see the product details in Shopping Cart Page"); 
  }
  }
  // Remove Product from Cart
  public void removeProductinShoppingCartPage() throws Exception {
  if (removeProductfromCart.isDisplayed()){
  if (removeProductfromCart.isEnabled())
  {
  removeProductfromCart.click();
     System.out.println("User is able to remove product from cart"); 
  }
  else{
   System.out.println("User is not able to remove product from cart"); 
  }
}
  else{
     System.out.println("removeProductfromCart is not displayed");   
  }
    return false;
  }

// Verify Empty Cart
  public void verifyEmptyCartPage() throws Exception {
      //Verify Empty Cart Page
  if (verifyEmptyCart.isElementPresent())
     String ActualText = verifyEmptyCart.getText();
      String ExpectedText = 'Cart is empty!';
      Assert.assertEquals(ActualText,ExpectedText);
  {
     System.out.println("User is able to see the product details removed from Cart Page"); 
  }
  else{
   System.out.println("User is not able to remove product from Cart Page); 
  }
  }

