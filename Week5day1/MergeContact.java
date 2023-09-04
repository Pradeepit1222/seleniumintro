package Week5day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Enter UserName and Password Using Id Locator
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demoSalesManager");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();
        driver.findElement(By.xpath("//a[contains (text(),'CRM/SFA')]")).click();
        //Click on contacts Button 
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();	
        //Click on Merge Contacts using Xpath Locator
        driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
        //Click on Widget of From Contact
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::a")).click();
        Set<String> windowHandles = driver.getWindowHandles();  
        List <String>fromContact=new ArrayList<String>(windowHandles);
        driver.switchTo().window(fromContact.get(1));
        System.out.println("Window Title is:" +driver.getTitle());
        Thread.sleep(7000);
        //Click on First Resulting Contact 
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
        System.out.println("First Resulting Contact is selected");
        //Click on Widget of To Contact
        driver.switchTo().window(fromContact.get(0));
      //Click on Second Resulting Contact
        driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[2]")).click();
        Set<String> windowHandles2 = driver.getWindowHandles();
        List<String>toContact=new ArrayList<String>(windowHandles2);
        driver.switchTo().window(toContact.get(1));
        Thread.sleep(7000);
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[3]")).click();
        System.out.println("Second Resulting Contact is selected");
        driver.switchTo().window(toContact.get(0));
        //Click on Merge button using Xpath Locator
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        //Accept the Alert
        Alert alt=driver.switchTo().alert();
        alt.accept();
        System.out.println("Title is :" +driver.getTitle());
        
	}

}
