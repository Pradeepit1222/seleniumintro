package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Baseclass.ProjectSpecificMethod;

public class CardDetails extends ProjectSpecificMethod {
	public CardDetails (ChromeDriver driver)
	{
		this.driver=driver;
	}
	public CardDetails selectCreditCard() throws InterruptedException
	{
	driver.findElement(By.xpath("//div[contains(text(), \"Pay with  Credit\")]")).click();
    Thread.sleep(600);
    return this;
	}
	public CardDetails enterCardNo(String card)
	{
    driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(card);
    return this;
	}
	public CardDetails enterExpiryDate(String expiry)
	{
    driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys(expiry);
    return this;
	}
	public CardDetails enterCvvNo(String cvv)
	{
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(cvv);
    return this;
	}
	public CardDetails enterName(String name)
	{
    driver.findElement(By.xpath("(//input[@class='prefilled undefined'])[1]")).sendKeys(name);
    return this;
	}
	public CardDetails enteremail(String mail)
	{
    driver.findElement(By.xpath("(//input[@class='prefilled undefined'])[2]")).sendKeys(mail);
    return this;
	}
	public CardDetails confirmlink()
	{
	 boolean enabled = driver.findElement(By.xpath("//span[@class='disabled']")).isSelected();
	 System.out.println("Link is :" +enabled);
    return this;
	}
}
