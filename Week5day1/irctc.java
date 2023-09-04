package Week5day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
        System.out.println("Title is" +driver.getTitle());
        Set<String> windowHandles = driver.getWindowHandles();
        List<String>listname=new ArrayList<String>(windowHandles);
         driver.switchTo().window(listname.get(1));
         File source = driver.getScreenshotAs(OutputType.FILE);//ctrl+2+l
         //create a folder
         File Target =new File("./snap/amazon.png");
         //Merge source and target
         FileUtils.copyFile(source, Target);
         System.out.println("Title is" +driver.getTitle());
         driver.switchTo().window(windowHandle);
        System.out.println("switched to Parent window");
        driver.close();
        System.out.println("Parent window closed");
        
        
	}

}
