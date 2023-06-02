package techproed.day05_DT_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {
        // https://www.amazon.com sayfasına gidiniz
        // arama kutusuna "city bike"  yazıp aratın
        // Hybrid Bikes bölümüne tıklayın
        // sonuc sayısını yazdırın
        // ilk ürününe tıklayın
        //Sayfayı kapatınız

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // arama kutusuna "city bike"  yazıp aratın
        WebElement aramaKutusu=driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])"));
        aramaKutusu.sendKeys("city bikes", Keys.ENTER);

        // Hybrid Bikes bölümüne tıklayın.
        // Hybrid Bikes bölümüne tıklayın.
        //WebElement hybridBikes = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));
        //cift slash--bastaki attribute span--köseli parantez--burda text kullandigimiz icin @ yok--text yazilir--
        //parantez ac kapa--tirnak icinde kopyaladigimiz, kullanacagimiz kelime--köseli parantezi kapadik
        //hybridBikes.click();
        WebElement rennRader=driver.findElement(By.xpath("//span[text()='Rennräder']"));
        rennRader.click();

        // sonuc sayısını yazdırın
        WebElement sonucYazisi=driver.findElement(By.xpath("//span[text()='5 Ergebnisse für']"));
        System.out.println(sonucYazisi.getText());
        String sonucSayisi[]=sonucYazisi.getText().split(" ");
        System.out.println("sonucSayisi[0] = " + sonucSayisi[0]);

        // ilk ürününe tıklayın
        WebElement ilkUrun=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
        ilkUrun.click();
        //Sayfayı kapatınız
        driver.close();








    }
}
