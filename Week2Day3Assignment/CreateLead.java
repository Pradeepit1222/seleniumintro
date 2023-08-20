package Week2Day3Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demoSalesManager");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();
        driver.findElement(By.xpath(" //a[contains (text(),'CRM/SFA')]")).click();
        driver.findElement(By.xpath(" //a[contains (text(),'Leads')]")).click();
        driver.findElement(By.xpath(" //a[contains (text(),'Create Lead')]")).click();
     
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("ColmpanyManager");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("first name");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("last name");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("tl222@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryPhoneNumber\"]")).sendKeys("9995574644");
        driver.findElement(By.xpath("//input[@name=\"submitButton\"]")).click();
	}

}

