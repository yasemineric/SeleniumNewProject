package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");

        //getTitle() sayfa basligini verir.
        System.out.println("Amazon Sayfa Basligi : "+ driver.getTitle());
        System.out.println( "Aamzon Actual URL: "+ driver.getCurrentUrl());
        String amazonWindowHandle= driver.getWindowHandle();
        System.out.println("Amazon Window handle degeri : "+amazonWindowHandle);

        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Sayfa Basligi : "+ driver.getTitle());

        //getCurrentUrl() Gidilen sayfanini Url'ini verir
        System.out.println( "Techproeducation Actual URL: "+ driver.getCurrentUrl()); //İçinde bulunduğu sayfanın URLsini verir.

        ////İçinde olunan sayfanın kaynak kodlarını String olarak verir.
        //System.out.println(driver.getPageSource());-bilerek yoruma ladik, uzunkodlar her calistirdigimizda consolda gözükecegi icin

        //getWindowHandle() Gidilen sayfanin handle degrini (hashKod) verir. Bu handle degerini sayfalar arasi gecis icin kullaniriz.
        System.out.println("Techpro Window handle degeri : "+driver.getWindowHandle());
     //Git deneme

    }




}
