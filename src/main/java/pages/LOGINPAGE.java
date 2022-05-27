package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LOGINPAGE {
    WebDriver driver;
    By username= By.name("username");
    By password= By.name("password");
    By button=By.cssSelector("#login > button");
    WebElement user_name;
    WebElement Passwoed;
    WebElement login;
    public LOGINPAGE(WebDriver driver){
        this.driver=driver;
    }
    public void sendusername_password(String user,String pass){
        user_name=driver.findElement(username);
        Passwoed=driver.findElement(password);
        login=driver.findElement(button);
        user_name.sendKeys(user);
        Passwoed.sendKeys(pass);
    }
    public SourceArea clicklogin(){
        login.click();
        return new SourceArea(driver);
    }

}
