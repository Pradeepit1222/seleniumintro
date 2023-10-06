package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Baseclass.ProjectSpecificMethod;

public class CitySelection  extends ProjectSpecificMethod{
	public CitySelection (ChromeDriver driver)
	{
		this.driver=driver;
	}
	public CitySelection selectCity()
	{
		 driver.findElement(By.xpath("//a[@class='action city-selector']")).click();
	        System.out.println("Clicked on the city location :"+driver.getTitle());
	        driver.findElement(By.xpath("(//div[@class=\"city shadow-small\"])[2]")).click();
	        System.out.println("Selected city location :" +driver.getTitle());
        return this;
        
	}
   public DateSelection selectFlim()
   {
	   driver.findElement(By.xpath("(//div[@class=\"poster\"])[2]")).click();
	   return new DateSelection(driver);
   }
}
