import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys("iphone");
//        driver.findElement(By.id("pass")).sendKeys("abc123");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
    }
}
//driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 4jyl selected 51sy")).click();