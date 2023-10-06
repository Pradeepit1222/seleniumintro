package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Baseclass.ProjectSpecificMethod;
import pages.CitySelection;


public class CitySelectionTestcase extends ProjectSpecificMethod {
	@BeforeTest
	public void getdata()
	{
		excelfile="ticketbooking";
	}
	
	
	@Test(
		dataProvider="fetchData")
	
	public void runCitySelection(String card,String expiry,String cvv,String name,String mail) throws InterruptedException
	{
		CitySelection Cs=new CitySelection(driver);
		  Cs.selectCity()
		 .selectFlim()
		 .selectDate()
		 .selectshow()
		 .selectAlert()
		 .selectSeat()
		 .confirmTicket()
		 .seatDetails()
		 .priceDetails()
		 .selectCreditCard()
		 .enterCardNo(card)
		 .enterExpiryDate(expiry)
		 .enterCvvNo(cvv)
		 .enterName(name)
		 .enteremail(mail)
		 .confirmlink();
		 
	}
	}

