package selenium_java.bai5_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoXPathAbsolute {//xpath tuyệt đối
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[1]/input")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/input")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/aside/ul/li[3]/a/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/a[1]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
