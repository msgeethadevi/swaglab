package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {

    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\geeth\\IdeaProjects\\SeleniumForGitAndJenkins\\src\\driver\\newchromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.saucedemo.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }


}
