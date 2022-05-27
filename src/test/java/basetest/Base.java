package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LOGINPAGE;
import pages.SourceArea;
import pages.homepage;

import static org.testng.Assert.assertTrue;

public class Base {
private WebDriver driver;
    homepage ho;
    LOGINPAGE loginpage;

@BeforeMethod
 void setup(){
    System.setProperty("webdriver.chrome.driver","C:/Users/ABDO/Downloads/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
     ho=new homepage(driver);
     loginpage=ho.clickonlink();
}
@Test
void successtestlogin(){

    loginpage.sendusername_password("tomsmith","SuperSecretPassword!");
    SourceArea sourceArea=loginpage.clicklogin();
    assertTrue(sourceArea.checkalertk().contains("You logged into a secure area!"),"alertfaild");
}

@AfterMethod
void finish(){
       driver.quit();
}

}


