package andersinno.fi;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
/**
 * Hello world!
 *
 */
public class App 
{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		    driver = new FirefoxDriver();
			baseUrl = "http://hskk.aishop.fi/";
			driver.get(baseUrl + "/");
    }
}
