// Generated by Selenium IDE
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTests {
  private WebDriver driver;
  JavascriptExecutor js;
  
  @Before
  public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium Driver\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  
  @Test
  public void TestLoginRafael() {
    driver.get("http://localhost:8080/App/Telalogin.html");
    driver.manage().window().setSize(new Dimension(1024, 608));
    driver.findElement(By.name("login")).click();
    driver.findElement(By.name("login")).sendKeys("rafaelb");
    driver.findElement(By.name("senha")).sendKeys("abc");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector("h1")).click();
    driver.findElement(By.cssSelector("h1")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Seja bem vindo, Rafael"));
  }
  
  @Test
  public void TestLoginGabriel() {
    driver.get("http://localhost:8080/App/Telalogin.html");
    driver.manage().window().setSize(new Dimension(1024, 608));
    driver.findElement(By.name("login")).click();
    driver.findElement(By.name("login")).sendKeys("gabrielb");
    driver.findElement(By.name("senha")).sendKeys("abc");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector("h1")).click();
    driver.findElement(By.cssSelector("h1")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Seja bem vindo, Gabriel"));
  }
  
  @Test
  public void TestLoginManoel() {
    driver.get("http://localhost:8080/App/Telalogin.html");
    driver.manage().window().setSize(new Dimension(1024, 608));
    driver.findElement(By.name("login")).click();
    driver.findElement(By.name("login")).sendKeys("manoelb");
    driver.findElement(By.name("senha")).sendKeys("abc");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector("h1")).click();
    driver.findElement(By.cssSelector("h1")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Seja bem vindo, Manoel"));
  }
  
  @Test
  public void TestAcessoTopicoComRafael() {
    driver.get("http://localhost:8080/App/Telalogin.html");
    driver.manage().window().setSize(new Dimension(1024, 608));
    driver.findElement(By.name("login")).click();
    driver.findElement(By.name("login")).sendKeys("rafaelb");
    driver.findElement(By.name("senha")).click();
    driver.findElement(By.name("senha")).sendKeys("abc");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.linkText("Ler Topico")).click();
    driver.findElement(By.cssSelector("h1")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Criador: rafaelb"));
    driver.findElement(By.cssSelector("h2")).click();
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Titulo: Titulo do Rafael"));
    driver.findElement(By.cssSelector("h3")).click();
    assertThat(driver.findElement(By.cssSelector("h3")).getText(), is("Texto: Testando o usuario rafael."));
  }
  
  @Test
  public void TestAcessoTopicoComGabriel() {
    driver.get("http://localhost:8080/App/Telalogin.html");
    driver.manage().window().setSize(new Dimension(1024, 608));
    driver.findElement(By.name("login")).click();
    driver.findElement(By.name("login")).sendKeys("gabrielb");
    driver.findElement(By.name("senha")).click();
    driver.findElement(By.name("senha")).sendKeys("abc");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.linkText("Ler Topico")).click();
    driver.findElement(By.cssSelector("h1")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Criador: rafaelb"));
    driver.findElement(By.cssSelector("h2")).click();
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Titulo: Titulo do Rafael"));
    driver.findElement(By.cssSelector("h3")).click();
    assertThat(driver.findElement(By.cssSelector("h3")).getText(), is("Texto: Testando o usuario rafael."));
  }
  
  @Test
  public void TestAcessoTopicoComManoel() {
    driver.get("http://localhost:8080/App/Telalogin.html");
    driver.manage().window().setSize(new Dimension(1024, 608));
    driver.findElement(By.name("login")).click();
    driver.findElement(By.name("login")).sendKeys("manoelb");
    driver.findElement(By.name("senha")).click();
    driver.findElement(By.name("senha")).sendKeys("abc");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.linkText("Ler Topico")).click();
    driver.findElement(By.cssSelector("h1")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Criador: rafaelb"));
    driver.findElement(By.cssSelector("h2")).click();
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Titulo: Titulo do Rafael"));
    driver.findElement(By.cssSelector("h3")).click();
    assertThat(driver.findElement(By.cssSelector("h3")).getText(), is("Texto: Testando o usuario rafael."));
  }
  
  @Test
  public void TestInserirTopico() {
    driver.get("http://localhost:8080/App/Telalogin.html");
    driver.manage().window().setSize(new Dimension(1024, 608));
    driver.findElement(By.name("login")).click();
    driver.findElement(By.name("login")).sendKeys("rafaelb");
    driver.findElement(By.name("senha")).click();
    driver.findElement(By.name("senha")).sendKeys("abc");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector(".insere .btn")).click();
    driver.findElement(By.cssSelector("h1")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Rafael, o que está pensando?"));
  }
  
  @Test
  public void inserirTopicoComRafael() {
    driver.get("http://localhost:8080/App/Telalogin.html");
    driver.manage().window().setSize(new Dimension(1024, 608));
    driver.findElement(By.name("login")).click();
    driver.findElement(By.name("login")).sendKeys("rafaelb");
    driver.findElement(By.name("senha")).click();
    driver.findElement(By.name("senha")).sendKeys("abc");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector(".insere .btn")).click();
    driver.findElement(By.name("titulo")).click();
    driver.findElement(By.name("titulo")).sendKeys("testeselenium");
    driver.findElement(By.name("corpo")).click();
    driver.findElement(By.name("corpo")).click();
    driver.findElement(By.name("corpo")).click();
    driver.findElement(By.name("corpo")).sendKeys("testeselenium");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector("tr:nth-child(7) a")).click();
    driver.findElement(By.cssSelector("h1")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Criador: rafaelb"));
    driver.findElement(By.cssSelector("h2")).click();
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Titulo: testeselenium"));
    driver.findElement(By.cssSelector("h3")).click();
    assertThat(driver.findElement(By.cssSelector("h3")).getText(), is("Texto: testeselenium"));
  }
  
}
