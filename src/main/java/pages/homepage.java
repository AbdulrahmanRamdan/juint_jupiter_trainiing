package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
    public WebDriver driver;
    WebElement baseauth;
    public homepage(WebDriver driver){this.driver=driver;}

    public LOGINPAGE clickonlink(){
        baseauth=driver.findElement(By.linkText("Form Authentication"));
        baseauth.click();
        LOGINPAGE l= new LOGINPAGE(driver);
        return l;
    }

}
