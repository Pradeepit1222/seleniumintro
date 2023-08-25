package marathonweek1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abhibus {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //select bus tab
        driver.findElement(By.xpath("//a[@id='pills-home-tab']")).click();
        //type chennai
        driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
        //click on chennai dropdown
        driver.findElement(By.xpath("//li[text()='Chennai']")).click(); 
      //type banglore
        driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
        //click on banglore dropdown
        driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
        //click date of journey
      
        driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
        //select date
        driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
      //Select search
        driver.findElement(By.xpath("//div[@class='col-md-auto'][2]")).click();
      //Print the name of the first resulting bus
       String s= driver.findElement(By.xpath("//div[@class='search-column1'][1]")).getText();
       System.out.println("first resulting bus :"+s);
        //Choose SLEEPER in the left menu from Bus Type
       driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();
       //Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
       
       String seat=driver.findElement(By.xpath("//p[@class='noseats AvailSts ng-binding'][1]")).getText(); 
       System.out.println("Available is" +seat);
       //click seat
       driver.findElement(By.xpath("//span[@class='book'][1]")).click();
       //select seat
       driver.findElement(By.xpath("//a[@class='tooltip tooltipstered']")).click();
       //Print Seats Selected ,Total Fare
       String seatselected= driver.findElement(By.xpath("//span[@id='seatnos']")).getText();
       System.out.println("Selected seat :"+seatselected);
       String totalfare= driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
       System.out.println("Total fare :"+totalfare);
     //Select Boarding Point  and Dropping Point
       WebElement boardingPoint = driver.findElement(By.xpath("//select[@id='boardingpoint_id']"));
       Select source=new Select(boardingPoint);
       source.selectByIndex(1);
       WebElement droppinPoint = driver.findElement(By.xpath("//select[@id='droppingpoint_id']"));
       Select source1=new Select(droppinPoint);
       source1.selectByIndex(1);
       //Gettitle
       System.out.println("Title is"+ driver.getTitle());
       driver.close();
       
     
       
        
       
	}

}
