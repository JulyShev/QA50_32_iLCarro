package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        setDriver(driver);
        driver.get("https://ilcarro.web.app/login?url=%2Fsearch");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),this);
    }
    @FindBy(xpath = "//input[@id='email']")
    WebElement fieldEmail;

    public void inputEmail(){
        fieldEmail.sendKeys("dornb12@mail.com");
    }
    @FindBy(xpath = "//input[@id='password']")
    WebElement fieldPassword;

    public void inputPassword(){
        fieldPassword.sendKeys("Qwert123#1");
    }

    @FindBy(xpath = "//button[text()='Y’alla!']")
    WebElement btnYalla;

    public void clickBtnYalla(){
        btnYalla.click();
    }

    @FindBy(xpath = "//button[text()='Ok']")
    WebElement btnOk;

    public void clickBtnOk(){
        btnOk.click();
    }
}
