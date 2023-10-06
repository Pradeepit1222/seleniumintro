package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Baseclass.ProjectSpecificMethod;

public class TicketDetails extends ProjectSpecificMethod {
	
	public TicketDetails (ChromeDriver driver)
	{
		this.driver=driver;
	}
	public TicketDetails seatDetails() throws InterruptedException
	{
		WebElement selectedSeat = driver.findElement(By.xpath("(//div[@class='box'])[1]"));
        Thread.sleep(500);
        return this;
}
	public CardDetails priceDetails() throws InterruptedException
	{
	 WebElement totalAmount = driver.findElement(By.xpath("(//div[@class='box'])[3]"));
     Thread.sleep(500);
     return new CardDetails(driver);
}
	
}