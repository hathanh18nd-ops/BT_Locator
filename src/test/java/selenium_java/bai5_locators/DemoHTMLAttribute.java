package selenium_java.bai5_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoHTMLAttribute {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Locator HTML Attribute");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sau 10s thì báo lỗi
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        //driver.findElement(By.id("password")).sendKeys("123456");
        WebElement inputPass = driver.findElement(By.id("password"));
        inputPass.sendKeys("123456");
        driver.findElement(By.tagName("button")).click();
        //driver.findElement(By.linkText("Forgot Password?")).click();
        //driver.findElement(By.partialLinkText("Password?")).click();//một phần của chuỗi
        //driver.findElement(By.className("btn-primary")).click();
        Thread.sleep(2000);//khoảng thời gian nghỉ
        driver.quit();
    }
}
