package techproed.day05_DT_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_cssSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        //Add Element butonuna basin
        //Delete butonu'nun gorunur oldugunu test edin
        //Delete butonuna basin
        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        //Sayfayı kapatın

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();

        //Delete butonu'nun gorunur oldugunu test edin
        WebElement delete=driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        Thread.sleep(2000);

     if (delete.isDisplayed()){
         System.out.println("Delete buttonu görünür");
     }else{
         System.out.println("Delete buttonu görünür degil");
     }
        Thread.sleep(2000);

        //Delete butonuna basin.
        delete.click();
        Thread.sleep(2000);

        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemove=driver.findElement(By.cssSelector("h3"));// cssSelector de text kullanilamayacagi icin sadece tag.i alacagiz.
        if (addRemove.isDisplayed()){
            System.out.println("Add Remove görünür");
        }else{
            System.out.println("Add/Remove görünür degil");
        }
        Thread.sleep(2000);

        //Sayfayı kapatın
        driver.close();

        /*
        xPath ve cssSelector arasindaki farklar
                -Xpath text ile calisir.
                -cssSelector text ile calismaz.
                -Xpath index'e gore arama yapabilir. Daha fazla kombinasyona sahiptir.
                -cssSelector index'e gore arama yapamaz. Daha hizli calisir
                */


    }
}
