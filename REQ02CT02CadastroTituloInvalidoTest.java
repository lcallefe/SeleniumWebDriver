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
public class REQ02CT02CadastroTituloInvalidoTest {
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
  public void rEQ02CT02CadastroTituloInvalido() {
    driver.get("https://ts-scel.herokuapp.com/");
    driver.manage().window().setSize(new Dimension(1074, 680));
    driver.findElement(By.linkText("Livros")).click();
    driver.findElement(By.id("isbn")).click();
    driver.findElement(By.id("isbn")).sendKeys("2341");
    driver.findElement(By.id("autor")).click();
    driver.findElement(By.id("autor")).sendKeys("Agatha Christie");
    driver.findElement(By.id("titulo")).click();
    driver.findElement(By.id("titulo")).sendKeys("ExemploDeNomeCujoTituloUltrapassa50caracteresTem51l");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger:nth-child(3)")).getText(), is("Titulo deve ter entre 1 e 50 caracteres"));
  }
}
