package demose.demose;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.testng.Assert;  
import org.testng.annotations.Test; 
import org.testng.annotations.BeforeTest; 
import org.testng.annotations.AfterTest;

/**
 * Hello world!
 *
 */
public class App 
{
	private WebDriver driver;  
    @Test    
    public void testEasy() { 
     driver.get("http://www.guru99.com/selenium-tutorial.html");
     driver.manage().window().maximize();
     String title = driver.getTitle();     
     Assert.assertTrue(title.contains("Free Selenium Tutorials"));   
    } 
    @BeforeTest
    public void beforeTest() { 
        driver = new FirefoxDriver();  
    }  
    /*@AfterTest
    public void afterTest() {
     driver.quit();   
    }  */
}
