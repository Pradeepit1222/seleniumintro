package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Baseclass.ProjectSpecificMethod;

public class SeatSelection extends ProjectSpecificMethod{
	public SeatSelection (ChromeDriver driver)
	{
	
		this.driver=driver;
	}

	public SeatSelection selectSeat() {
		driver.findElement(By.xpath("//div[text()='J06']")).click();
		return this;
	}
	
	public TicketDetails confirmTicket() {
		driver.findElement(By.xpath("//div[@class='box progress enabled']")).click();
		return new TicketDetails(driver);
	}
}
