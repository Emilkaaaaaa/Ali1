package lecture7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;

public class SeleniumTask1 {

    @Test
    public void aliTest(){
        String driverPath = "C:\\Users\\Owner\\IdeaProjects\\SelHW\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.aliexpress.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath(("//img[@class=\"_24EHh\"]"))).click();
        driver.findElement(By.xpath(("//img[@class=\"btn-close\"]"))).click();

        driver.findElement(By.id( "search-key")).sendKeys("tattoo");
        driver.findElement(By.xpath(("//input[@class=\"search-button\"]"))).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(("//input[@placeholder=\"min\"]"))).sendKeys("10");
        driver.findElement(By.xpath(("//input[@placeholder=\"max\"]"))).sendKeys("20");
        driver.findElement(By.xpath(("//a[@class=\"ui-button narrow-go\"]"))).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }

        driver.quit();
    }
}
