package Week2Day3Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demoSalesManager");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();
        driver.findElement(By.xpath("//a[contains (text(),'CRM/SFA')]")).click();
        driver.findElement(By.xpath("//a[contains (text(),'Accounts')]")).click();
        driver.findElement(By.xpath("//a[contains (text(),'Create Account')]")).click();
        driver.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("Debit Limited Account");
        driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.xpath("//input[@name=\"groupNameLocal\"]")).sendKeys("LocalName");
        driver.findElement(By.xpath("//input[@name=\"officeSiteName\"]")).sendKeys("SiteName");
        driver.findElement(By.xpath("//input[@name=\"annualRevenue\"]")).sendKeys("50000");
        WebElement industry = driver.findElement(By.xpath("//select[@name=\"industryEnumId\"]"));
        Select source1=new Select (industry);
        source1.selectByIndex(2);
        WebElement Ownership = driver.findElement(By.xpath("//select[@name=\"ownershipEnumId\"]"));
        Select source2=new Select (Ownership);
        source2.selectByVisibleText("S-Corporation");
        WebElement source = driver.findElement(By.xpath("//select[@name=\"dataSourceId\"]"));
        Select source3=new Select (source);
        source3.selectByValue("LEAD_EMPLOYEE");
        WebElement Marketing = driver.findElement(By.xpath("//select[@name=\"marketingCampaignId\"]"));
        Select source4=new Select (Marketing);
        source4.selectByIndex(5);
        WebElement State = driver.findElement(By.xpath("//select[@name=\"generalStateProvinceGeoId\"]"));
        Select source5=new Select (State);
        source5.selectByValue("TX");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
      
        
      //select[@name="generalStateProvinceGeoId"]
        
        
        
	}

}	
