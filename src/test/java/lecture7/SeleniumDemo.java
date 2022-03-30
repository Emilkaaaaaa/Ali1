package lecture7;

//import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

  //  @Test
    public void firstSeleniumDemoTest(){
     String driverPath = "C:\\Users\\Owner\\IdeaProjects\\SelHW\\src\\test\\resources\\chromedriver.exe";
     System.setProperty("webdriver.chrome.driver", driverPath);
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://www.1a.lv/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
