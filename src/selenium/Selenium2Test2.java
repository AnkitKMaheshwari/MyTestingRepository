package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;
import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;

public class Selenium2Test2 {
	private WebDriver driver;
	@BeforeMethod

	public void beforExcel()
	{
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@Test(enabled=false)
	public void firstXLTest() throws Exception
	{
		Excel  ex=new Excel();

		ex.setExcel("D:/Assignment/data.xls","Sheet1");
		driver.get("https://login.microsoftonline.com/login.srf?wa=wsignin1.0&rpsnv=4&ct=1414567166&rver=6.1.6206.0&wp=MBI_SSL&wreply=https:%2F%2Fpod51055.outlook.com%2Fowa%2F%3FauthRedirect%3Dtrue%26realm%3Dgspann.com&id=260563&whr=gspann.com&CBCXT=out#path=/mail");

		for(int i=1;i<=3;i++)
		{

			String Username = ex.getCellValue(i,1);
			String password = ex.getCellValue(i,2);
			driver.findElement(By.xpath("//input[@id='cred_userid_inputtext']")).sendKeys(Username);
			driver.findElement(By.xpath("//input[@id='cred_password_inputtext']")).sendKeys(password);
			driver.findElement(By.xpath("//span[@id='cred_sign_in_button']")).click();
			String errorMessage = driver.findElement(By.xpath("//div[@class='client_error_msg 30064']")).getText();
			System.out.println(errorMessage);
			driver.findElement(By.xpath("//input[@id='cred_userid_inputtext']")).clear();
			driver.findElement(By.xpath("//input[@id='cred_password_inputtext']")).clear();
			Thread.sleep(2000);
		}	
	}

	@Test
	public void irctcFligt() throws Exception{	

		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.xpath("//a[@href='http://air.irctc.co.in']")).click();
		//Thread.sleep(3000);

		String parentWindow=driver.getWindowHandle();
		String parentWindowTitle = driver.switchTo().window(parentWindow).getTitle();
		System.out.println("Title Of Parent window"+parentWindowTitle);
		Set<String> allwin = driver.getWindowHandles();
		for(String eachwin:allwin){		  
			String nameOfFirstWindow= driver.switchTo().window(eachwin).getTitle();
			System.out.println("Title Of First window"+nameOfFirstWindow);		  	
			String firstWindow = "IRCTC Online Passenger Reservation System";


		}
		Excel  ex=new Excel();
		ex.setExcel("D:/Assignment/profiledata.xls","irctcflight");
		//Row row = null;
		//int noOfRows = row.getLastCellNum();
		//System.out.println("No Of Rows"+noOfRows);
		for(int i=2;i<=3;i++){
			/*if(i==1){
				System.out.println("Enter into the continue if loope");
				boolean emptyRow = false;
				for(int j=1;j<=5;j++){
				 emptyRow= ex.getCellValue(1,j).isEmpty();


				 System.out.println(emptyRow);
				if(emptyRow==true)
				{
					System.out.println("Enter into blank row");
					break;
				}

				}
			}
			 */
			int col=0;
			String destination = ex.getCellValue(i,++col);
			System.out.println("Destination is  "+destination);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='destination']")).click();
			driver.findElement(By.xpath("//input[@id='destination']")).sendKeys(destination);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'"+destination+"')]")).click();
			String origin = ex.getCellValue(i,++col);
			System.out.println("Origin is  "+origin);
			driver.findElement(By.xpath("//input[@id='origin']")).sendKeys(origin);
			System.out.println("Select the cities");
			driver.findElement(By.xpath("//a[contains(text(),'"+origin+"')]")).click();
			//String date= ex.getCellValue(i,++col);

			System.out.println("Fetching date from xl  sheet");
			//String[] splitDate= date.split("/");
			System.out.println("Date is splited");
			String month = ex.getCellValue(i, 3).split("/")[1];
			System.out.println("Splited month number   "+month);
			System.out.println("click on the calender");
			driver.findElement(By.xpath("//input[@id='departDate']/preceding::div[1]/following::div[1]/img[@class='ui-datepicker-trigger']")).click();
			System.out.println("Clicked on calender");
			Thread.sleep(3000);
			String flightMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
			//String flightYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
			//String  year =  ex.getCellValue(i, 3).split("/")[2];
			System.out.println(" month Name   "+flightMonth);
			/*int x = Integer.parseInt(month);
			String mnth = null;
			switch(x)
			{
			case 1: if(x==1){
				 mnth="January";
			}
			case 2: if(x==2){
				 mnth="Febuary";
			}

			case 3: if(x==3){
				 mnth="March";
			}
			case 4: if(x==4){
				 mnth="April";
			}
			case 5: if(x==5){
				 mnth="May";
			}
			case 6: if(x==6){
				 mnth="June";
			}
			case 7: if(x==7){
				 mnth="July";
			}
			case 8: if(x==8){
				 mnth="August";
			}
			case 9: if(x==9){
				 mnth="September";
			}
			case 10: if(x==10){
				 mnth="October";
			}
			case 11: if(x==11){
				 mnth="November";
			}
			case 12: if(x==12){
				 mnth="December";
			}
			default:{
				System.out.println("Wrong choise");
			}

			}
			if(x==Integer.parseInt(month))
			{
				System.out.println("Enter in to date event");
				do {
				if(year.equalsIgnoreCase(flightYear)){
				driver.findElement(By.xpath("//td[@data-month='10']//a[text()='18']")).click();
				System.out.println("Date selected");
				break;
				}
				else
				{
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
					driver.findElement(By.xpath("//td[@data-month='11']//a[text()='25']")).click();
				}
				} while (year.equalsIgnoreCase(flightYear));
			}


			 */




			while(true){
				String year = ex.getCellValue(i, ++col).split("/")[2].length()==4
						?ex.getCellValue(i, col).split("/")[2]
								:"20"+ex.getCellValue(i, col).split("/")[2];
						if(driver.findElement(By.xpath("//span[text()='"+new DateFormatSymbols().getMonths()[Integer.parseInt(ex.getCellValue(i, col).split("/")[1]) - 1]+"']/following::span[text()='"+year+"']")).isDisplayed()){
							break;
						}
						driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			driver.findElement(By.xpath("//span[text()='"+new DateFormatSymbols().getMonths()[Integer.parseInt(ex.getCellValue(i, col).split("/")[1]) - 1]+"']/following::table[1]//a[text()='"+ex.getCellValue(i, col).split("/")[0]+"']")).click();













			String classOfFlight = ex.getCellValue(i,4);
			System.out.println("Class of flight  "+classOfFlight);

			driver.findElement(By.xpath("//select[@name='classType']")).click();
			if(classOfFlight.equalsIgnoreCase("B"))
			{
				System.out.println("Enetr into business class");
				//Actions builder = new Actions(driver);
				//builder.click(driver.findElement(By.xpath("//select[@name='classType']//option[@value='B']"))).keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
				driver.findElement(By.xpath("//select[@name='classType']//option[@value='B']")).click();
				System.out.println("Business class selected");
				Thread.sleep(3000);
			}
			else
			{
				driver.findElement(By.xpath("//select[@name='classType']//option[@value='E']")).click();
				System.out.println("Economy class selected");
			}
			 if((ex.getCellValue(i,5).charAt(0)+"").toUpperCase().equals("Y"))
			 {
			File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    org.apache.commons.io.FileUtils.copyFile(srcFile,new File("Ss//Flightwithtwodates"+i+".png"));
			 }
			driver.findElement(By.xpath("//input[@id='origin']")).clear();
			driver.findElement(By.xpath("//input[@id='destination']")).clear();
			

		}
	}





	//New test case

	@Test(enabled=false)
	public void macysExcel() throws Exception{
		driver.get("https://www.macys.com/account/profile");
		Excel  ex=new Excel();
		ex.setExcel("D:/Assignment/FinalSheet.xls","Sheet1");
		int noOfRow = ex.gettotalRows();
		System.out.println(noOfRow);

		System.out.println("-------------"+ex.getCellValue(1, 3));
		while(true){
			for(int i=1;i<=noOfRow;i++){
				int col=0;
				int noOfColumn = ex.getTotalColumns(i);
				System.out.println("Number of column"+noOfColumn);
				for(int j=1;j<=noOfColumn;j++)
				{
					if(!ex.getCellValue(i,j).isEmpty()){
						System.out.println("Enter into if condition");
						String name = ex.getCellValue(i,j);
						driver.findElement(By.id("firstName")).sendKeys(name);

					}
					
					
					
					String s1= ex.getCellValue(i,++j);
					System.out.println("-----------------------------------------"+s1);
					if(!ex.getCellValue(i,++j).isEmpty()){
						String lastName = ex.getCellValue(i,++j);
						System.out.println("Enter into if condition");
						driver.findElement(By.id("lastName")).sendKeys(lastName);
						
					}
					
					if(!ex.getCellValue(i,++j).isEmpty()){
						String thirdvalue= ex.getCellValue(i, ++j);
						System.out.println("It is third value"+thirdvalue);
						String address1 = ex.getCellValue(i,++j);
						System.out.println("Enter into if condition");
						 driver.findElement(By.id("addressLine1")).sendKeys(address1);
						
					}
					
					
					if(!ex.getCellValue(i,++j).isEmpty()){
						String fourthvalue= ex.getCellValue(i, ++j);
						System.out.println("It is fourth value"+fourthvalue);
						String address2 = ex.getCellValue(i,++j);
						System.out.println("Enter into if condition");
						 driver.findElement(By.id("addressLine2")).sendKeys(address2);
						
					}
					
					if(!ex.getCellValue(i,++j).isEmpty()){
						String fifthvalue= ex.getCellValue(i, ++j);
						System.out.println("It is fifth value"+fifthvalue);
						String city = ex.getCellValue(i,++j);
						System.out.println("Enter into if condition");
						 driver.findElement(By.id("city")).sendKeys(city);
						
					}
					//String sixvalue= ex.getCellValue(i, ++j);
					//System.out.println("It is six value"+sixvalue);
					if(!ex.getCellValue(i,++j).isEmpty()){
						int state = Integer.parseInt(ex.getCellValue(i,++j));
						System.out.println("Enter into 6th if condition");
						String printState = driver.findElement(By.xpath("//select[@id='state']//option[state]")).getText();
						System.out.println(printState);
						driver.findElement(By.xpath("//select[@id='state']//option[state]")).click();
						Thread.sleep(5000);
					}
				
					
				}
				break;
			}
			break;
		}


	}



























	@AfterMethod
	public void afterExcel()
	{
			driver.quit();
	}

}
