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
public class REQ06CT03EmprestimoLivroInexistenteTest {
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
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void rEQ06CT03EmprestimoLivroInexistente() {
    driver.get("https://ts-scel.herokuapp.com/");
    driver.manage().window().setSize(new Dimension(1074, 680));
    driver.findElement(By.linkText("Alunos")).click();
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("2323");
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("Luciana Callefe Donadio");
    driver.findElement(By.id("email")).sendKeys("lucianacallefe95@gmail.com");
    driver.findElement(By.id("cep")).sendKeys("01526-000");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.findElement(By.id("cep")).click();
    driver.findElement(By.id("cep")).sendKeys("01526000");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.findElement(By.linkText("Voltar")).click();
    driver.findElement(By.linkText("Livros")).click();
    driver.findElement(By.id("isbn")).click();
    driver.findElement(By.linkText("Lista de Livros")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) .btn-primary")).click();
    driver.findElement(By.linkText("Voltar")).click();
    driver.findElement(By.linkText("Empréstimo")).click();
    driver.findElement(By.id("isbn")).click();
    driver.findElement(By.id("isbn")).sendKeys("1236");
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("2323");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger")).getText(), is("Livro/Aluno não localizado ou existe emprestimo em aberto"));
    driver.findElement(By.linkText("Voltar")).click();
    driver.findElement(By.linkText("Alunos")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
    vars.put("win9376", waitForWindow(2000));
    driver.switchTo().window(vars.get("win9376").toString());
    driver.findElement(By.cssSelector("tr:nth-child(2) .delete")).click();
  }
}