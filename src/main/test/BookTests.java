import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookTests {

    private WebDriver driver = new ChromeDriver();

    @Before
    public void before() {
        driver.get("https://www.bookdepository.com/");
    }

    @Test
    public void checkThatUrlIsValid() {
        Assert.assertEquals("https://www.bookdepository.com/", driver.getCurrentUrl());
    }

    @After
    public void quit() {
        driver.quit();
    }
}