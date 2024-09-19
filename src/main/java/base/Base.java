package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static WebDriver driver;



        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.applitools.com/app.html");

    }

