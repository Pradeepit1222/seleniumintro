package Week2Day3Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DeleteLead {

	

	public static void main(String[] args  ) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demoSalesManager");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();
        driver.findElement(By.xpath(" //a[contains (text(),'CRM/SFA')]")).click();
        driver.findElement(By.xpath(" //a[contains (text(),'Leads')]")).click();
       // driver.findElement(By.xpath(" //a[contains (text(),'Create Lead')]")).click();
        driver.findElement(By.xpath(" //a[contains (text(),'Find Leads')]")).click();
        driver.findElement(By.xpath(" //span[contains (text(),'Phone')]")).click();
        driver.findElement(By.xpath(" //input[@name=\"phoneNumber\"]")).sendKeys("69557464411");
        driver.findElement(By.xpath("//button[contains (text(),'Find Leads')]")).click();
        Thread.sleep(3000);
        String firstLeadResult = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a[@class='linktext']")).getText();
    	System.out.println("FirstLeadID: " +firstLeadResult);
    	 driver = new ChromeDriver();
    	driver.get("http://leaftaps.com/opentaps/control/main");
    	driver.manage().window().maximize();
    	 driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demoSalesManager");
         driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
         driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();
         driver.findElement(By.xpath(" //a[contains (text(),'CRM/SFA')]")).click();
         driver.findElement(By.xpath(" //a[contains (text(),'Find Leads')]")).click();
         driver.findElement(By.xpath(" //span[contains (text(),'Phone')]")).click();
         driver.findElement(By.xpath(" //input[@name=\"phoneNumber\"]")).sendKeys("69557464411");
         driver.findElement(By.xpath("//button[contains (text(),'Find Leads')]")).click();
    	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
    	driver.findElement(By.xpath("//a[text()='Delete']")).click();
    	driver.findElement(By.xpath("//a[contains (text(),'Find Leads')]")).click();
    	driver.findElement(By.xpath("//input[@name=\"id\"]")).sendKeys(firstLeadResult);
    	driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
    	String expectedResult="No records to display";
    	String actualResult=driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
    	if(expectedResult==actualResult) {
    		System.out.println("Passed. No records to display");
    	}
    	driver.quit();
    	}
	
       /*
        
        driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();	
       
         
         */
        
        
        /*WebElement FirstResultinglead =driver.findElement(By.xpath("//div[@id=\"ext-gen934\"]"));
        firstLead = new Select(FirstResultinglead);
        System.out.println("First Lead ID" + FirstResultinglead)*/;
	}

	
/*http://leaftaps.com/opentaps/control/main

Delete Lead:
1	Launch the browser
2	Enter the username
3	Enter the password
4	Click Login
5	Click crm/sfa link
6	Click Leads link
7	Click Find leads
8	Click on Phone
9	Enter phone number
10	Click find leads button
11	Capture lead ID of First Resulting lead
12	Click First Resulting lead
13	Click Delete
14	Click Find leads
15	Enter captured lead ID
16	Click find leads button
17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
18	Close the browser (Do not log out)
*/