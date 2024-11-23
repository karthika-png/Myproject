package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Readconfig;

public class Loginpage {
	
	Readconfig rc = new Readconfig();
	
	WebDriver ldriver;
	
	public  Loginpage(WebDriver rdriver)
{
ldriver=rdriver;	
PageFactory.initElements(rdriver, this);
	}


	//login
	
		@FindBy(name="login")
		WebElement txtUserName;
		
		
		@FindBy(name="password")
		WebElement txtPassword;

		
		 @FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
		WebElement btnLogin;
		 
		 @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary btn-block']")
			WebElement btnLogin2;
			 
		 @FindBy(how = How.XPATH, using = "//a[@class='o_menu_toggle hasImage']")
	WebElement back;
		 
		 @FindBy(how = How.XPATH, using ="//a[@data-menu-xmlid='sale.sale_menu_root']")
		 WebElement sales;
		 
		 @FindBy(how = How.XPATH, using = "//i[@class='oi oi-close']")
		 WebElement close;
		 
		 //new button
	@FindBy(how = How.XPATH, using = "//div[@class='d-xl-none o_control_panel_collapsed_create']")
		 WebElement newbutton;
		 
			 
		 @FindBy(how = How.XPATH, using = "(//input[@class='o-autocomplete--input o_input'])[1]")
		 WebElement cname;
		 
		 @FindBy(how = How.XPATH, using = "(//a[@class='dropdown-item ui-menu-item-wrapper text-truncate'])[3]")
		 WebElement nclick;
		 
		 @FindBy(how = How.XPATH, using ="(//a[@role='button'])[1]")
		 WebElement product;
		 
		 @FindBy(how = How.XPATH, using ="(//input[@class='o-autocomplete--input o_input'])[5]")
		 WebElement cproduct;
		 
		 @FindBy(how = How.XPATH, using ="(//a[@class='dropdown-item ui-menu-item-wrapper text-truncate'])[3]")
		 WebElement sproduct;
		 
		 //save button
		 @FindBy(how = How.XPATH, using ="//i[@class='fa fa-cloud-upload fa-fw']")
		 WebElement save;
		 
		 //delivery button
		 @FindBy(how = How.XPATH, using ="//span[@class='o_stat_text']")
		 WebElement delivery;
		
		 //3rd item
		 @FindBy(how = How.XPATH, using ="//*[@data-tooltip='WH/Stock']")
		 WebElement third;
		
		
		 
		 @FindBy(name="action_confirm")
			WebElement confirmo;
		 
		 
		 @FindBy(id="create_invoice_percentage")
			WebElement createinvoice;
		 
		 @FindBy(id="amount_0")
			WebElement enteramount;
		 
		 @FindBy(name="create_invoices")
			WebElement draftinvoice;
			
		 @FindBy(name="action_post")
			WebElement confirm;
		 
		 @FindBy(how = How.XPATH, using ="//img[@class='o_avatar o_user_avatar rounded']")
		 WebElement clogout;
		 
		 @FindBy(how = How.XPATH, using ="(//a[@role='menuitem'])[3]")
		 WebElement logout;
		 
		 
		 
		 
		 //action methods for 3 elements
		 public void setUserName(String uname)
		 {
		 	txtUserName.sendKeys("admin");
		 	
		 	
		 }
		 public void setPassword(String pwd)
		 {
			 txtPassword.sendKeys("admin");
		 }

		 public void submit()
		 {
		btnLogin.click();
		 }
		 
		public void back() {
		back.click();
			 }

		 public void sales() {
				 sales.click();
				  }
		 public void close() {
			 close.click();
		 }
		 
 
		 public void newbutton() {
			 
			 newbutton.sendKeys(Keys.ENTER);
		 }
		
		  public void cname() {
			  cname.click();
		  }
		  
		  public void nclick() {
			  nclick.click();
		  }
		  
		  public void product() {
			  product.click();
		  }
		  
		  public void cproduct() {
			  cproduct.click();
		  }
		  
		  public void sproduct() {
			sproduct.click();
		  }
//save
		  public void save()
		  {
			save.click();  
		  }
		  
		  
		  
		  //confirm
		  public void confirmo() {
				confirmo.click();
			  }
//delivery
		  
		  public void delivery()
		  {
			delivery.click();  
		  }
		  
		  //3rd item
		  public void third()
		  {
			  third.click();
		  }
		  
		  
		  public void createinvoice() {
				createinvoice.click();
			  }

		  public void enteramount()
			 {
				 enteramount.sendKeys("100");
			 } 
		  
		  public void draftinvoice() {
				draftinvoice.click();
			  }

		  public void confirm() {
				confirm.click();
			  }
		  

		  public void clogout() {
				clogout.click();
			  }
		  
		  public void logout() {
				logout.click();
			  }
		  
		  
		  

}
