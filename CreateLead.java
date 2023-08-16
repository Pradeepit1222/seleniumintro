package Weeks2.days2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pradeep Chakravarthy ");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pradeepit1222@gmail.com");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9999999999");
        driver.findElement(By.name("submitButton")).click();
        
        
        
        
	}

}
	