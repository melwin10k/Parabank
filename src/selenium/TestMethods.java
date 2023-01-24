package selenium; 

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import project1.GoogleSearchPage;
import project1.ParabankPage; 

public class TestMethods {
	   
	WebDriver driver;   
	GoogleSearchPage project1repo;    

	@BeforeTest()
    public void beforetest() {
        //Launching the Browser
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Google homepage
        driver.get("https://www.google.co.in");
        driver.manage().window().maximize();
    }    

	@Test(priority= 0)
    //Search parabank
    public void SearchOperation() {
        GoogleSearchPage page = new GoogleSearchPage(driver);
        page.Searchgoogle("parabank");
    }    

	@Test(priority=1)
    //open parabank site
    public void Verifyparabank () {
        project1repo = new GoogleSearchPage(driver);
        project1repo.ParabankPage();
     }    

	@Test(priority=2)
    //To register in parabank
    public void registerUserparabank() {
        ParabankPage page = new ParabankPage(driver);
        page.registerUser();
    }    

	@Test(priority=3)
    //Details to be filled
    public void registerUserDetails() {
        ParabankPage page= new ParabankPage(driver);
        page.EnterFirstName();
        page.EnterLastName();
        page.EnterAddress();
        page.EnterCity();
        page.EnterState();
        page.EnterZip();
        page.EnterPhone();
        page.EnterSSN();
        page.EnterUsername();
        page.EnterPassword();
        page.EnterConfirm();
    }        

	@Test(priority=4)
        //registered in parabank 
        public void ClickRegisterIcon() {
        ParabankPage page= new ParabankPage(driver);
        page.ClickRegister();  
        }        

	@Test(priority=5)
        //Apply for loan
        public void requestloan() {
        ParabankPage page= new ParabankPage(driver);
        page.loanrequest();
        page.amount();
        page.Down();
        page.from();
        page.apply();
        }        

	@Test(priority=6)
        //check accountbalance
        public void AccountBalance() {
        ParabankPage page= new ParabankPage(driver);
        page.balance();
        }        

	@Test(priority=7)
        //logout from parabank
        public void Logout() {
        ParabankPage page= new ParabankPage(driver);
        page.Logout();
        }    

	@AfterTest
    public void aftertest() {
        driver.quit();
    } 
}