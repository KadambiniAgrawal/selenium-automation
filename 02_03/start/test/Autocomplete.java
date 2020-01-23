import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkumari\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete= driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("Bagmane Constellation Service Road");
        Thread.sleep(1000);

        WebElement autocompleteresult= driver.findElement(By.className("pac-item"));
        autocompleteresult.click();

        driver.quit();
    }
}
