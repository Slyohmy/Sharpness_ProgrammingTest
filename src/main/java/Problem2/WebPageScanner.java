package Problem2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class WebPageScanner {

    public List<WebElement> webScan(String url) {

        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(url);
        List<WebElement> webPages = driver.findElements(By.tagName("a"));
        System.out.println(url + " has " + webPages.size() + " number of pages.");

        return webPages;

    }
}