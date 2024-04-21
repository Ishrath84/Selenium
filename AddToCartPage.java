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
  public WebElement verifyAddtoCart;

  @FindBy(xpath = "//section[@id="cart_items"]//following::li[contains(text(),'Shopping Cart')]")
  public WebElement verifyShoppingCartBreadCrumbs;

  @FindBy(xpath = "//table[@id="cart_info_table"]//td[@class="cart_description"]")
  public WebElement verifyProductinShoppingCart;

  @FindBy(xpath = "//td[@class="cart_quantity_delete"]")
  public WebElement removeProductfromCart;

  @FindBy(xpath = "//span[@id="empty_cart"]//following::b[contains(text(),'Cart is empty!')]")
  public WebElement verifyEmptyCart;

  public void selectCategory() throws Exception {

    
  }
