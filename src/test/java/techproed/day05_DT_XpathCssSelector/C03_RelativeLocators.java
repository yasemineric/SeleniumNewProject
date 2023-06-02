package techproed.day05_DT_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        /*
-Bir web elementi direk locate edemediğimiz durumlarda,
o web element,, etrafındaki web elementleri ile tarif etmemizi sağlar.
-Bir web sayfasında benzer özelliklere sahip webelementlerin olduğu durumlarda kulllanılabilir.

-above ==> Belirtilen elementin üstünde olan elementi seçer.
-below==> Belirtilen elementin altında olan elemneti seçer.
-toLeftOf ==> Belirtilen elementin solunda olan elemneti seçer.
-toRightOf ==> Belirtilen elementin sağında olan elemneti seçer.
-near ==> Belirtilen elementin Yanında ya da yakınında olan elemneti seçer.
 */

        //amazon sayfasına gidelim
        //city bike aratalım
        //Relative Locator kullanarak Hybrid Bikes üstündeki Road Bikes'a tıklayalım
        // sayfayı kapatın


        //amazon sayfasına gidelim
        driver.get("https://www.amazon.com ");
        //city bike aratalım
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("city bikes", Keys.ENTER);
        //Relative Locator kullanarak Cruiser üstündeki ElektroFahrräder'a tıklayalım
        WebElement cruiser=driver.findElement(By.xpath("//span[text()='Cruiser']"));
        WebElement elektrofahrräder=driver.findElement(with(By.tagName("span")).above(cruiser));

        elektrofahrräder.click();

        // sayfayı kapatın
        driver.close();













    }
}
