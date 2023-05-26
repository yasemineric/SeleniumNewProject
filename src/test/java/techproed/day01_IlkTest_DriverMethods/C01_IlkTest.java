package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarinda sistem özelliklerini ayarlamak icin setProperty methodu kullaniriz.#
        //setProperty methodu ile class'ımıza driver'ın fiziki yolunu belirtiriz.

        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" degerini girerek "value".ya ulasabilirim.

        WebDriver driver=new ChromeDriver();
        //ChromeDriver turunde yeni bir obje olusturduk.
        //Bu obje ile artik methodlari kullanabiliriz.
        driver.get("https://techproeducation.com");
        //get() methodu ile String olarak girilen URL.ye gideriz.



    }

}
