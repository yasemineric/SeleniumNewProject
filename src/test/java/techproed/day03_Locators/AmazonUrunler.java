package techproed.day03_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

import java.util.List;


public class AmazonUrunler {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.get("https://www.amazon.com");


        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);


        List<WebElement> sonucYazisiList = driver.findElements(By.className("sg-col-inner"));
        String yazi = sonucYazisiList.get(0).getText();
        System.out.println("Search Result Text: " + yazi);


        // cikan urunlerden ilk 5 tanesine tiklayip basliklarini yazdiriniz.
        List<WebElement> productTitles = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        List<String> productTitles1 = new ArrayList<>();

        int count = 0;
        for (WebElement element : productTitles) {
            String title = element.getText();
            productTitles1.add(title);

            if (++count >= 5) {
                break;
            }
        }


        productTitles1.stream().forEach(System.out::println);


        driver.quit();

    }
}