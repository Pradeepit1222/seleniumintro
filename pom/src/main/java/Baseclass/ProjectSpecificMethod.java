package Baseclass;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;
public class ProjectSpecificMethod {
    public  ChromeDriver driver;
    public String excelfile;
    public static Properties prop1,prop;
    
    @DataProvider(name="fetchData")
    public String[][] getData() throws IOException {
        String[][] readData = ReadExcel.data(excelfile);
        return readData;
    }
    
    @BeforeMethod
    public void launchBrowser() throws IOException {
       
        ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		driver=new ChromeDriver(ch);
		driver.get("https://www.justickets.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}

