package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GoogleSearchPage {
	    
	WebDriver driver;    

	public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);    
    }    

	@FindBy(name = "q")
	public WebElement searchbox;   
	@FindBy(name = "btnK")
	public WebElement search_btn;   
	@FindBy(xpath="//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/a/h3") public WebElement parabank_link;    

	public void Searchgoogle(String Searchinput) {
        //search parabank in the searchbox
        try {
            searchbox.sendKeys(Searchinput);
            search_btn.click();         } catch (Exception e) {
            System.out.println("Exceptions Caught"+e.getMessage());         }
    }    

	public void ParabankPage() {
       // clickonthelink(parabank)
      try {
            parabank_link.click();
        } catch (Exception e) {
          System.out.println("Exceptions Caught"+e.getMessage());         }
    }   
}