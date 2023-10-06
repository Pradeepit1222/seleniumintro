package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Baseclass.ProjectSpecificMethod;

public class DateSelection extends ProjectSpecificMethod{
	public DateSelection (ChromeDriver driver)
	{
		this.driver=driver;
	}

	public DateSelection selectDate() {
		 driver.findElement(By.xpath("(//div[@class=\"date shadow-small undefined\"])[2]")).click();
		return this;
	}
	public DateSelection selectshow() {
		driver.findElement(By.xpath("(//a[@class=\"schedule available\"])[2]")).click();
		return this;
	}
	public SeatSelection selectAlert() {
		driver.findElement(By.xpath("//button[text()='Okay']")).click();
		return new SeatSelection(driver);
	}
}
