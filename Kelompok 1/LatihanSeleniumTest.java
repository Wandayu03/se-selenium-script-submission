// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LatihanSeleniumTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void latihanSelenium() {
    driver.get("https://seleniumbase.io/demo_page");
    driver.manage().window().setSize(new Dimension(1296, 688));
    driver.findElement(By.id("myTextInput")).click();
    driver.findElement(By.id("readOnlyText")).click();
    driver.findElement(By.id("readOnlyText")).click();
    driver.findElement(By.id("readOnlyText")).click();
    driver.findElement(By.id("readOnlyText")).click();
    
    // Mengubah bagian button menjadi "Purple" dari yang tadinya "Hijau"
    driver.findElement(By.id("myButton")).click();
    driver.findElement(By.id("myButton")).click();
    driver.findElement(By.id("myButton")).click();
    driver.findElement(By.id("myTextarea")).click();
    driver.findElement(By.id("mySelect")).click();
    {
      // Mengubah dropdown dari 25% menjadi 50%
      WebElement dropdown = driver.findElement(By.id("mySelect"));
      dropdown.findElement(By.xpath("//option[. = 'Set to 50%']")).click();
    }
    
    // Mengubah text area menjadi ada isi "Hello World"
    driver.findElement(By.id("myTextarea")).click();
    driver.findElement(By.id("myTextarea")).click();
    driver.findElement(By.id("myTextarea")).sendKeys("Hello World");
  }
}
