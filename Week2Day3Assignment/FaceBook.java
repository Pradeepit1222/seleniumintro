package Week2Day3Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();  
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pradeep");
		driver.findElement(By.xpath("//input[@name=('reg_email__')]")).sendKeys("99999444");
		driver.findElement(By.xpath("//input[@name=('reg_passwd__')]")).sendKeys("!1pradeep");
		WebElement day= driver.findElement(By.xpath("//select[@id=('day')]"));
		Select daySelection= new Select(day);
		daySelection.selectByIndex(5);
	
	
		
		WebElement month= driver.findElement(By.xpath("//select[@id=('month')]"));
		Select monthSelection= new Select(month);
		monthSelection.selectByIndex(5);
		
		
		WebElement year= driver.findElement(By.xpath("//select[@id=('year')]"));
		Select yearSelection = new Select(year);
		yearSelection.selectByIndex(20);
		
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		
		
		
	}

}
