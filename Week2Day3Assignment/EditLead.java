package Week2Day3Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demoSalesManager");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();
        driver.findElement(By.xpath("//a[contains (text(),'CRM/SFA')]")).click();
        driver.findElement(By.xpath("//a[contains (text(),'Leads')]")).click();
        driver.findElement(By.xpath("//a[contains (text(),'Find Leads')]")).click();
        driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("first name");
        driver.findElement(By.xpath("//button[contains (text(),'Find Leads')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
        driver.getTitle();
        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Updated company name");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.quit();
        
       
	}

}


/*http://leaftaps.com/opentaps/control/main

* 1	Launch the browser
* 2	Enter the username
* 3	Enter the password
* 4	Click Login
* 5	Click crm/sfa link
* 6	Click Leads link
* 7	Click Find leads
* 8	Enter first name
* 9	Click Find leads button
* 10 Click on first resulting lead
* 11 Verify title of the page
* 12 Click Edit
* 13 Change the company name
* 14 Click Update
* 15 Confirm the changed name appears
* 16 Close the browser (Do not log out)
*/