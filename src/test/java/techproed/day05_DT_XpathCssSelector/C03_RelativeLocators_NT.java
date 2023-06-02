package techproed.day05_DT_XpathCssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class C03_RelativeLocators_NT {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      /*
         Benzer özelliklere sahip web elementler icin relative locator kullanabiliriz
        SYNTAX;
        driver.findElement(with(By.tagname).below().above().to_left_of().to_right_of().near()) gibi methodlar
        ile benzer özelliklere sahip web elementleri locate'ini almadan o web elemente ulaşabiliriz.
        */

        //amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //city bike aratalım
        WebElement aramaKutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        //Relative Locator kullanarak Hybrid Bikes altındaki elemente tıklayalım
        WebElement hybridBikes= driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));
        WebElement electricBikes=driver.findElement(with(By.tagName("a")).below(hybridBikes));
        WebElement completeBikes=driver.findElement(with(By.tagName("a")).below(hybridBikes));
        completeBikes.click();
        electricBikes.click();

        // sayfayı kapatın
        driver.close();

    }

}
