package com.crm.qa.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage  extends TestBase{

	
	//PageFactory - OR:
	@FindBy(name ="email")
	WebElement email;
	
	
	@FindBy(name="password")
	WebElement password;
	
    @FindBy(xpath="//div[@class='ui fluid large blue submit button']")
    WebElement loginbtn;
    
    @FindBy(xpath="//a[contains(text(),'Sign Up')]")
    WebElement sigUpBtn;
    
    //initializing the Page Objects:
    public LoginPage(){
    	PageFactory.initElements(driver, this);
    }
    
    //Actions:
    public String validateLoginPageTitle() {
    	return driver.getTitle();
    	
    }
    public HomePage login(String eml ,String pwd) {
    	email.sendKeys(eml);
    	password.sendKeys(pwd);
    	loginbtn.click();
    	
    	
    
    
    return new HomePage();
}
}
    
	
	


