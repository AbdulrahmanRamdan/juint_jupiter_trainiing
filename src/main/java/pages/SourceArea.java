package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SourceArea {
    WebDriver driver;
    By logout= By.cssSelector("#content > div > a");
    WebElement LogOut;

    public SourceArea(WebDriver driver){
        this.driver=driver;
        LogOut=driver.findElement(logout);
    }
    public void clicklogout(){
       LogOut.click();
    }
    public String checkalertk(){
        WebElement alert=driver.findElement(By.id("flash"));
        System.out.println(alert.getText());
        return alert.getText();

    }
    public String checkalertafterbuttonclick(){
        WebElement alert=driver.findElement(By.cssSelector("#flash"));
        return alert.getText();
    }
}
