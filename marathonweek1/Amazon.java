package marathonweek1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Type "Bags" in the Search box
        driver.findElement(By.xpath(" //input[@id='twotabsearchtextbox']")).sendKeys("Bags ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='for boys']")).click();
       
     //Choose the     item in the result (bags for boys)
     String bagtexttotal= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
        System.out.println("Displayed text is " +bagtexttotal);
        //Select the first 2 brands in the left menu
        driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[1]")).click();
        driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[2]")).click();
        System.out.println("first 2 brands in the left menu is selected");
        //Choose New Arrivals (Sort)
        driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]")).click();
      driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
        //Print the first resulting bag info (name, discounted price)
        String nameOfBag=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText();
        System.out.println("Bag name is :" +nameOfBag);
        
        String priceofBag=driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')]/following::span[@class='a-price-whole'])[1]")).getText();
        System.out.println("Price of bag is :"+ priceofBag);
        
      //Get the page title and close the browser(driver.close())
        System.out.println("Title is"+ driver.getTitle());
        driver.close();
	}

}
