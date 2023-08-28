package Week3Day4Assignement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//ChromeDriver driver = new ChromeDriver(handlingSSL);
		driver.get("https://www.ajio.com");
	
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //In the search box, type as "bags" and press enter
        driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
        
        //To the left  of the screen under " Gender" click the "Men"
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
       Thread.sleep(3000);
        // Under "Category" click "Fashion Bags" 
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
        // Print the count of the items Found. 
        System.out.println("Count of the item is: " +driver.findElement(By.xpath("//div[@class='length']")).getText());
        // Get the list of brand of the products displayed in the page and print the list.
        List<WebElement> brand= driver.findElements(By.xpath("//div[@class='brand']"));
        for (int i = 0; i < brand.size(); i++) {
            String brandtext = brand.get(i).getText();
            System.out.println("Brand name present in the list :"+brandtext);
        
        //Get the list of names of the bags and print it 
            List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
            for (int j = 0; j < bagName.size(); j++) {
            	String name=bagName.get(j).getText();
            	System.out.println("Bag name present in the list :" +name);
				
			}
            
	}
	}
}
