package marathonweek1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVR {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//01) Launch the Url  https://www.pvrcinemas.com/
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Select the City -->chennai
		//driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		//02) Click  on Movie Library //a[@class='ng-star-inserted']
		driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		//Select the City -->chennai
		Select city= new Select( driver.findElement(By.name("city")));
		city.selectByVisibleText("Chennai");
		Thread.sleep(3000);
	
	   // 04) Select the Genre-->Animation
		Select genre= new Select( driver.findElement(By.name("genre")));
		genre.selectByVisibleText("ANIMATION");
		//05) Select the Language-->english
		Select language= new Select( driver.findElement(By.name("lang")));
		language.selectByVisibleText("ENGLISH");
		
		//06) Click on Apply (
		driver.findElement(By.xpath("//button[@class='btn btn-submit btn-primary']")).click();
		Thread.sleep(5000);
		 //07) Click on first resulting animation movie (//div[@class='movie-wrapper ng-star-inserted'])[1]
		driver.findElement(By.xpath("(//div[@class='movie-wrapper ng-star-inserted']//div)[1]")).click();
		System.out.println("Clicked first resulting animation movie");
		//08) Click proceed to book //button[text()='Proceed To Book']
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		System.out.println("Clicked proceed to book");
       //09) Enter  all  the fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
		WebElement cinema=driver.findElement(By.id("cinemaName"));
		Select cini=new Select(cinema);
		cini.selectByValue("PVR Theyagaraja Thiruvanmiyur Chennai");
		System.out.println("Screen selected :" + cini);
		//Prioir notice
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();
		//timing
		WebElement timing=driver.findElement(By.id("cinemaName"));
		Select time=new Select(timing);
		time.selectByValue("09:00 AM - 12:00 PM");
        //No.of tickets
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("5 ");	
		driver.findElement(By.name("name")).sendKeys("pradeep");
		driver.findElement(By.name("email")).sendKeys("pradeep@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("9789481345");
		//F&B requirement
		WebElement foodDropdown = driver.findElement(By.xpath("//select[@name='food']"));
		Select food = new Select(foodDropdown);
		food.selectByValue("Yes");
		 driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("Please allocate more snacks");
		//10) Click on copy to self 
		  driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		//11) Click on  Send Request
		  driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();

			//12) Click cancel 
		  driver.findElement(By.xpath("(//button[contains(text(),'CANCEL')])[2]")).click();
			//13) Close the OTP dialog
		  driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();
		  String title = driver.getTitle();
		  System.out.println("Title of the page : " + title);
	}

}
