package project1; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert; 

public class ParabankPage {
	   
	WebDriver driver;    

	public ParabankPage(WebDriver driver) {
        this.driver = driver;
    }   

	By register = By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a");     // click on the register
	   

	public void registerUser() {
        driver.findElement(register).click();
    }    

	By FirstName = By.id("customer.firstName");   
	By LastName = By.id("customer.lastName");   
	By Address = By.id("customer.address.street");   
	By City = By.id("customer.address.city");   
	By State = By.id("customer.address.state");   
	By Zip = By.id("customer.address.zipCode");   
	By Phone = By.id("customer.phoneNumber");   
	By SSN = By.id("customer.ssn");   
	By Username = By.id("customer.username");   
	By Password = By.id("customer.password");   
	By Confirm = By.id("repeatedPassword");     // Details should be entered     public void EnterFirstName() {
	       driver.findElement(FirstName).sendKeys("Neymar");   
	}    

	public void EnterLastName() {
        driver.findElement(LastName).sendKeys("jr");
    }    

	public void EnterAddress() {
        driver.findElement(Address).sendKeys("Mogi das Cruzes,sao paulo,Brazil");
    }    

	public void EnterCity() {
        driver.findElement(City).sendKeys("Mogi das Cruzes");
    }    

	public void EnterState() {
        driver.findElement(State).sendKeys("sao paulo");
    }    

	public void EnterZip() {
        driver.findElement(Zip).sendKeys("112233");
    }    

	public void EnterPhone() {
        driver.findElement(Phone).sendKeys("123456789");
    }    

	public void EnterSSN() {
        driver.findElement(SSN).sendKeys("435627");
    }    

	public void EnterUsername() {
        driver.findElement(Username).sendKeys("Neymar@11227234");
    }    

	public void EnterPassword() {
        driver.findElement(Password).sendKeys("Neymar@111");
    }    

	public void EnterConfirm() {
        driver.findElement(Confirm).sendKeys("Neymar@111");
    }    

	By registerbtn = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input");   
	By welcomemsg = By.xpath("/html/body/div[1]/div[3]/div[2]/h1");     // click register button
	   

	public void ClickRegister() {
        driver.findElement(registerbtn).click();
        driver.findElement(welcomemsg).isDisplayed();
    }    

	By loan = By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[7]/a");   
	By LoanAmount = By.id("amount");   
	By DownPayment = By.id("downPayment");   
	By Fromaccount = By.id("fromAccountId");   
	By Applynowbtn = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/table/tbody/tr[4]/td[2]/input");   
	By loanapproved = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/h1");     // apply for loan
	   

	public void loanrequest() {
        driver.findElement(loan).click();
    }    

	public void amount() {
        driver.findElement(LoanAmount).sendKeys("1000");
    }    

	public void Down() {
        driver.findElement(DownPayment).sendKeys("200");
    }    

	public void from() {
        driver.findElement(Fromaccount).click();
    }    

	public void apply() {
        driver.findElement(Applynowbtn).click();
        driver.findElement(loanapproved).isDisplayed();
    }    

	By Accountbalance = By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");     // check balance
	   

	public void balance() {
        driver.findElement(Accountbalance).click();
    }    

	By logout = By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a");     // click logout
	   

	public void Logout() {
        driver.findElement(logout).click();
    } 
}