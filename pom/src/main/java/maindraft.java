import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class maindraft {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://www.justickets.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/*
		 * String Location = "Chennai";
		 * driver.findElement(By.xpath("//input[@class='search']")).sendKeys(Location);
		 * driver.findElement(By.xpath("//div[text()='" + Location + "']")).click();
		 */
        driver.findElement(By.xpath("//a[@class='action city-selector']")).click();
        System.out.println("Clicked on the city location :"+driver.getTitle());
        driver.findElement(By.xpath("(//div[@class=\"city shadow-small\"])[2]")).click();
        System.out.println("Selected city location :" +driver.getTitle());
        driver.findElement(By.xpath("(//div[@class=\"poster\"])[3]")).click();
        System.out.println("Selected flim :" + driver.getTitle());
        driver.findElement(By.xpath("(//div[@class=\"date shadow-small undefined\"])[2]")).click();
        System.out.println("Selected date for the flim :" + driver.getTitle());
        driver.findElement(By.xpath("(//a[@class=\"schedule available\"])[2]")).click();
         System.out.println("Selected showtime for the flim :" + driver.getTitle());
       driver.findElement(By.xpath("//button[text()='Okay']")).click();
         System.out.println("Selected alert :" + driver.getTitle());
         driver.findElement(By.xpath("//div[text()='J08']")).click();
         System.out.println("Selected seat :" + driver.getTitle());
         driver.findElement(By.xpath("//div[@class='box progress enabled']")).click();
         System.out.println("confirm seat :" + driver.getTitle());
         WebElement selectedSeat = driver.findElement(By.xpath("(//div[@class='box'])[1]"));
         Thread.sleep(500);
         System.out.println("selected seat is:" +selectedSeat.getText());
         WebElement totalAmount = driver.findElement(By.xpath("(//div[@class='box'])[3]"));
         Thread.sleep(500);
         System.out.println("TotalAmount is:" +totalAmount.getText());
         driver.findElement(By.xpath("//div[contains(text(), \"Pay with  Credit\")]")).click();
         System.out.println("selected credit card details :" +selectedSeat.getText());
         Thread.sleep(600);
         driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("123456789");
         System.out.println("Card no is entered " );
         driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("03/2025");
         System.out.println("Expiry date is entered " );
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
         System.out.println("CVV is entered " );
         driver.findElement(By.xpath("(//input[@class='prefilled undefined'])[1]")).sendKeys("Pradeep");
         System.out.println("Name is entered " );
         driver.findElement(By.xpath("(//input[@class='prefilled undefined'])[2]")).sendKeys("Pradeep@gmail.com");
         System.out.println("Email is entered " );
         driver.findElement(By.xpath("(//input[@class='prefilled undefined'])[3]")).sendKeys("9994456756");
         System.out.println("Mobileno is entered " );
         driver.findElement(By.xpath("//span[@class='disabled']")).click();
         
      
	}

}
