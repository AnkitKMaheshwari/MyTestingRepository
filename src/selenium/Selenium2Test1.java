package selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.google.common.collect.ImmutableBiMap.Builder;
import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;
import com.sun.jna.platform.FileUtils;

import java.io.File;
import java.sql.Driver;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class Selenium2Test1 {

	  private static final WebDriver WebDriver = null;
	private WebDriver driver;
	  
	 

	
    
	  @BeforeSuite
	  public void meth1()
	  	{
		  //System.out.println("It is  Before suite");
		  
		    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	  	}
		  
	  
	  @BeforeTest
	  public void meth2() throws Exception
	  	{
		  //System.out.println("It is  Before test");
		 
			  
		  
	  	}
	  
	  
	  @BeforeClass
	  public void meth3()
	  	{
		  //System.out.println("It is  Before class");
		  
		 
		  
		  
	  	}
	  
	  @Parameters("browser")
	  @BeforeMethod
	  public void meth4(String browser)
	  	{
		  System.out.println("It is  Before method");
		  if(browser.equalsIgnoreCase("chrome"))
		  {
		 System.setProperty("webdriver.chrome.driver","JarfilesofIEandChrome/chromedriver.exe");
		 driver = new ChromeDriver();
		  }
		  else if
		  (browser.equalsIgnoreCase("firefox"))
			  {
			  driver = new FirefoxDriver();
			  }
		  else if(browser.equalsIgnoreCase("ie"))
		  {
			  System.setProperty("webdriver.ie.driver","JarfilesofIEandChrome/IEDriverServer.exe");
			  DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
			  cap.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
			  cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			  driver = new InternetExplorerDriver(cap);
		  }
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
	  	}
	  
	  
	  @AfterSuite
	  public void meth5()
	  {
		  System.out.println("It is  After suite");
		  //driver.quit();
	  }
	  
	  
	  @AfterTest
	  public void meth6()
	  {
		  //System.out.println("It is  After Test");
		 // driver.quit();
	  }
	  
	  
	  
	  @AfterClass
	  public void meth7()
	  {
		  //System.out.println("It is  After class");
		 
	  }
	  
	  
	  @AfterMethod
	  public void meth8()
	  {
		  System.out.println("It is  After method");
		  driver.quit();
	  }
	  
	  
	  
	  
	  
	  
	  @BeforeTest
	  public void print()
	  {
		  //System.out.println("before test");
	  }
	  
	  @Test(enabled=false)
	  public void testUntitled2() throws Exception {
		  System.out.println("test");
	   driver.get("https://www.google.co.in");
	    driver.findElement(By.id("gbqfq")).clear();
	    driver.findElement(By.id("gbqfq")).sendKeys("gspann technologies");
	    driver.findElement(By.id("gbqfb")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("em")).click();
	  
	  }
	
	  @Test(enabled=false)
	  public void macys() throws  Exception
	  {
		  System.out.println("MACYS TEST");
		  driver.get("https://www.macys.com/");
		  Thread.sleep(2000);
//		  driver.findElement(By.id("closeButton"));
		  driver.findElement(By.xpath("//area[@href='http://prefcenter.email.macys.com/Macys_ISHIP/index.asp?rdn=700&aff_src=51']")).click();
		  driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ankit");
		  driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("maheshwari");
		  driver.findElement(By.xpath("//input[@name='EmailAddr']")).sendKeys("ankit.1906@yahoo.com");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//select[@name='country']")).click();
		  driver.findElement(By.xpath("//option[@value='IN']")).click();
		  Thread.sleep(2000);
	  }
	  
	  @Test(enabled=false)
	  public void verify()
	  {
		  driver.get("https://www.google.co.in/?gfe_rd=cr&ei=eLJAVLWDGqjV8gfJu4DYCg&gws_rd=ssl");
		 // String s1= driver.findElement(By.id("gbqfba")).getText();
		 
		  // Get attribute value
		  
		  String s2= driver.findElement(By.id("gbqfba")).getAttribute("id");
		  System.out.println("Id is==================="+s2);
		 
		//  Assert.assertEquals("Google Search", s1);
		  
		 // Assert.assertEquals("gbqfba", s2);
		  // It is find the css value
		 String s3= driver.findElement(By.id("hplogo")).getCssValue("height");
		 AssertJUnit.assertEquals("95px", s3);
		  
		  
		  
		  
		  
		  
		  
		  
	  }
	  @Test(enabled=false)
	  public void loginWrong() throws Exception
	  {
		  driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1");
		  driver.findElement(By.id("Email")).clear();
		    driver.findElement(By.id("Email")).sendKeys("ankitmaheshwarirocks");
		   
		    
		    driver.findElement(By.id("Passwd")).clear();
		    driver.findElement(By.id("Passwd")).sendKeys("123456");
		    
		    
		    driver.findElement(By.id("signIn")).click();
		    Thread.sleep(2000);
		    String a1=driver.findElement(By.xpath("//span[@id='errormsg_0_Passwd']")).getText();
		    System.out.println("the text is ********************"+a1+"*************");
		  
	  }
	  
	  @Test(enabled=false)
	  public void email() throws Exception
	  {
		  driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1");
		  driver.findElement(By.id("Email")).clear();
		    driver.findElement(By.id("Email")).sendKeys("ankitmaheshwarirocks");
		   // Thread.sleep(10000);
		    
		    driver.findElement(By.id("Passwd")).clear();
		    driver.findElement(By.id("Passwd")).sendKeys("9413086046urmila");
		    //Thread.sleep(10000);
		    
		    driver.findElement(By.id("signIn")).click();
		    Thread.sleep(100000);
		    
		   driver.findElement(By.xpath("//div[@class='aDP']/div[1]/div[2]//tbody/tr[2]/td[2]/div")).click();
		   Thread.sleep(5000);
		   
		   
		 //  driver.findElement(By.xpath("//div[@data-tooltip='Delete']")).click();
		   driver.findElement(By.xpath("//div[@class='ar9 T-I-J3 J-J5-Ji']")).click();
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.id("link_undo")).click();
		   Thread.sleep(5000);
		   
		   
		   String s = driver.findElement(By.xpath("//a[contains(text(),'Inbox')]")).getText();
		   System.out.println("Its counting start");
		   System.out.println(s);
		  
		   
		   System.out.println("Matching Start**********");
		   AssertJUnit.assertEquals("Inbox (712)", s);
		   System.out.println("Complete match");
		   
		   
		   
		   
		   
		   
		    
		    
	  }
	  
	  
	  @Test(enabled=false)
	  public void searchlink() throws Exception
	  {
		  driver.get("https://www.google.co.in/?gfe_rd=cr&ei=y5tEVM6LGcfM8gff4YDYDQ&gws_rd=ssl");
		  List<WebElement> mylist1  = driver.findElements(By.xpath("//div[@id='als']/a"));
		   String s1 = mylist1.get(3).getText();
		   driver.findElement(By.id("gbqfq")).sendKeys(s1);
		   driver.findElement(By.id("gbqfb")).click();
		   //System.out.println("^^^^^^^^^^^^^^^^^^^"+s1);
		   //JavascriptExecutor js = (JavascriptExecutor)driver;
		   //js.executeScript("alert(document.getElementsByTagName('a').length)");
		   File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   org.apache.commons.io.FileUtils.copyFile(srcFile,new File("D://SS//a2.pdf"));
		   Thread.sleep(5000);
		  
	  }
	  @Test(enabled=false)
	  public void mouseOver() throws Exception
	  {
		  driver.get("http://www.kohls.com/");
		  Actions builder = new Actions(driver);
		//  builder.moveToElement(driver.findElement(By.xpath("//h2//a[@href='/sale-event/mens-clothing.jsp']"))).build().perform();
		  WebElement we= driver.findElement(By.xpath("//h2//a[@href='/sale-event/mens-clothing.jsp']"));
		  builder.moveToElement(driver.findElement(By.xpath("//h2//a[@href='/sale-event/mens-clothing.jsp']"))).build().perform();
		  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//a[@href='/catalog/mens-bottoms-jeans-clothing.jsp?CN=4294723349+4294719807+4294719454+4294719810']")).click();
	  String s1 = driver.findElement(By.xpath("")).getText();
	  
	  
	  driver.findElement(By.xpath("//a[@href='/catalog/mens-levis-jeans-bottoms-clothing.jsp?CN=4294723349+4294874940+4294719454+4294719807+4294719810']/span[@class='checkbox ir']")).click();
	  
	  
	  
	  }
	  
	  
	  @Test(enabled=false)
	  public void screenshot() throws Exception
	  {
		 // driver.get("http://www.kohls.com/");
		  driver.get("https://www.kohls.com/myaccount/kohls_login.jsp");
		 // driver.findElement(By.xpath("//a[@href='http://www.kohls.com/myaccount/kohls_login.jsp']")).click();
		  driver.findElement(By.xpath("//input[@id='txtemail_sign']")).sendKeys("ankit");
		  driver.findElement(By.xpath("//input[@id='txtpassword_sign']")).sendKeys("123");
		  driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		  Thread.sleep(2000);
		  
		  
	  }
	  
	  
	  @Test(enabled=false)
	  public void macysScreenShot()throws Exception
	  {
		  driver.get("https://www.macys.com/account/profile");
		  driver.findElement(By.id("createProfileBtn")).click();
		 Thread.sleep(2000);
		 File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   org.apache.commons.io.FileUtils.copyFile(srcFile,new File("Ss//a2.png"));
		  // driver.findElement(By);
		   driver.findElement(By.id("firstName")).sendKeys("Ankit");
		   driver.findElement(By.id("lastName")).sendKeys("maheshwari");
		   driver.findElement(By.id("addressLine1")).sendKeys("djdkldj");
		   driver.findElement(By.id("addressLine2")).sendKeys("jsjdd");
		   driver.findElement(By.id("city")).sendKeys("bundi");
		   driver.findElement(By.xpath("//option[@value='HI']")).click();
		   driver.findElement(By.id("zipcode")).sendKeys("123445");
		   driver.findElement(By.xpath("//option[@value='06']")).click();
		   driver.findElement(By.xpath("//option[@value='19']")).click();
		   driver.findElement(By.xpath("//option[@value='1992']")).click();
		   driver.findElement(By.xpath("//option[@value='M']")).click();
		   
		   
		   driver.findElement(By.id("email")).sendKeys("ankit@gmail.com");
		   driver.findElement(By.id("createConfirmEmail")).sendKeys("ankit@gmail.com");
		   driver.findElement(By.id("password")).sendKeys("Ankit1234");
		   driver.findElement(By.id("confirmPassword")).sendKeys("Ankit1234");
		   driver.findElement(By.xpath("//option[text()='What was the name of your first supervisor?']")).click();
		   driver.findElement(By.id("securityAns")).sendKeys("shubham");
		   
		   Thread.sleep(5000);
		   
		   
	  }
	  
	  
	  @Test(enabled=false)
	  public void macysNoOfProduct() throws Exception
	  {
		  driver.get("https://www.macys.com/");
		  Random rn = new Random();
			int no=0,n9=0;
			while(true)
			{
			while(true) {
				   no = rn.nextInt(driver.findElements(By.xpath("//div[@id='globalMastheadCategoryMenu']//Li")).size()+1);
				   n9=no;
				   if(no!= 0)
				    break;
				  }
			System.out.println(n9);
			String s1 = driver.findElement(By.xpath("//div[@id='globalMastheadCategoryMenu']//li["+n9+"]")).getText();
			System.out.println("Assign random number");
			Thread.sleep(5000);
			
			
			String nameofitems = driver.findElement(By.xpath("//div[@id='globalMastheadCategoryMenu']//li["+n9+"]")).getText();
			System.out.println("Names of attributes   "+nameofitems);
			
			Actions action = new Actions(driver);
			  WebElement we1 = driver.findElement(By.xpath("//div[@id='globalMastheadCategoryMenu']//li["+n9+"]"));
			  action.moveToElement(we1).build().perform();
			  
			 
			
			 List<WebElement> L11=driver.findElements(By.xpath("//div[@id='globalMastheadFlyout']/div[contains(@class,'flyout-on')]//a")); 
			  int n1=0,n8=0;
			  while(true) {
				   n1 = rn.nextInt(driver.findElements(By.xpath("//div[@id='globalMastheadFlyout']/div[contains(@class,'flyout-on')]//a")).size()+1);
				   n8=n1+1;
				   if(n8!= 0)
				    break;
				  }
			   String name1 = L11.get(n8).getText();
			   System.out.println("&&&&&&&&&&&"+name1);
			  
			String nameOfBrand= driver.findElement(By.xpath("//div[@id='globalMastheadFlyout']/div[contains(@class,'flyout-on')]//a[text()='"+name1+"']")).getText();
			   System.out.println("***********"+nameOfBrand);

			   driver.findElement(By.xpath("//div[@id='globalMastheadFlyout']/div[contains(@class,'flyout-on')]//a[text()='"+name1+"']")).click();
			   System.out.println("clicked on random no");
			   Thread.sleep(1000);
			  
						
			   
			   try
			   {
				   System.out.println("Inside the try block");
				   int n2=0;
				   int n7=0;
				   while(true) {
					   n2 = rn.nextInt(driver.findElements(By.xpath("//ul[@id='featuredBrands']/li")).size());
					   n7=n2+1;
					   System.out.println(n2);
					   if(n7!= 0)
					    break;
				   }
				   System.out.println(n2);
				   
				   if(!driver.findElement(By.id("brandFacets")).isDisplayed())
					     driver.findElement(By.id("BRAND")).click();
					    
					    if(!driver.findElement(By.id("featuredBrands")).isDisplayed())
					     driver.findElement(By.id("featuredBrandsHdr")).click();
				   
				   
				   String noOfProduct= driver.findElement(By.xpath("//ul[@id='featuredBrands']/li["+n7+"]/span[2]")).getText();
				   String nameOfProduct=driver.findElement(By.xpath("//ul[@id='featuredBrands']/li["+n7+"]")).getText(); 
				   System.out.println("****** name of product****"+nameOfProduct);
				   
				   System.out.println("^^^^^^^"+noOfProduct);
				   driver.findElement(By.xpath("//ul[@id='featuredBrands']/li["+n7+"]/span[1]")).click();
				   Thread.sleep(5000);
				   
				   String noOfProductOnPage = driver.findElement(By.xpath("//span[@id='productCount']")).getText();
				   System.out.println("%%%%%%%%%%%"+noOfProductOnPage);
				   AssertJUnit.assertEquals(noOfProduct,noOfProductOnPage);
				   break;
				   
			   }
			   catch(Exception e)
			   {
				   System.out.println("Inside catch Block");
				   System.out.println("There is  no featured brands");
			   }
			}
			   
	  }
	  
	  
	  @Test(enabled=false)
	  public void navigationCheck()throws Exception
	  {
		  driver.get("https://www.macys.com/");
		  Random rn = new Random();
			int n;
			while(true)
			{
			while(true) {
				   n = rn.nextInt(driver.findElements(By.xpath("//div[@id='globalMastheadCategoryMenu']//Li")).size()+1);
				   if(n != 0)
				    break;
				  }
			System.out.println(n);
			String s1 = driver.findElement(By.xpath("//div[@id='globalMastheadCategoryMenu']//li["+n+"]")).getText();
			System.out.println("Assign random number");
			Thread.sleep(5000);
			
			
			String nameofitems = driver.findElement(By.xpath("//div[@id='globalMastheadCategoryMenu']//li["+n+"]")).getText();
			System.out.println("Names of attributes   "+nameofitems);
			
			Actions action = new Actions(driver);
			  WebElement we1 = driver.findElement(By.xpath("//div[@id='globalMastheadCategoryMenu']//li["+n+"]"));
			  action.moveToElement(we1).build().perform();
			  
			 // driver.findElement(By.xpath("//div[@id='globalMastheadCategoryMenu']//li["+n+"]/a")).click();
			  //Thread.sleep(3000);
			
			 List<WebElement> L11=driver.findElements(By.xpath("//div[@id='globalMastheadFlyout']/div[contains(@class,'flyout-on')]//a")); 
			  int n1;
			  while(true) {
				   n1 = rn.nextInt(driver.findElements(By.xpath("//div[@id='globalMastheadFlyout']/div[contains(@class,'flyout-on')]//a")).size()+1);
				   if(n1!= 0)
				    break;
				  }
			   String name1 = L11.get(n1).getText();
			   System.out.println("&&&&&&&&&&&"+name1);
			  
			String nameOfBrand= driver.findElement(By.xpath("//div[@id='globalMastheadFlyout']/div[contains(@class,'flyout-on')]//a[text()='"+name1+"']")).getText();
			   System.out.println("***********"+nameOfBrand);

			   driver.findElement(By.xpath("//div[@id='globalMastheadFlyout']/div[contains(@class,'flyout-on')]//a[text()='"+name1+"']")).click();
			   System.out.println("clicked on random no");
			   Thread.sleep(1000);
			   
			   try
			   {
				   driver.findElement(By.xpath("//div[@id='paginateTop']//a[starts-with(@class,'arrowRight')]")).click();
				   String noOfPage = driver.findElement(By.xpath("//div[@id='paginateTop']//a[@class='currentPage paginationSpacer']")).getText();
				   System.out.println("Cureent page Afteer click on right arrow    "+noOfPage);
				   AssertJUnit.assertEquals("2",noOfPage);
				   System.out.println("Test is pass and current page no is 2");
				   driver.findElement(By.xpath("//div[@id='paginateTop']//a[text()='1']")).click();
				   String noOfPrevPage= driver.findElement(By.xpath("//div[@id='paginateTop']//a[text()='1']")).getText();
				   System.out.println("Cureent page Afteer click on previous page    "+noOfPrevPage);
				   AssertJUnit.assertEquals("1", noOfPrevPage);
				   System.out.println("Test is pass and current page no is 1");
				   break;
				   
			   }
			   
			   catch(Exception e)
			   {
				   System.out.println("There is no  navigation");
			   }
			   
			   
			}
	  }
	  
	  
	  
	  @Test(enabled=false)
	  public void elementPresent() throws Exception
	  {
		  driver.get("https://www.google.co.in/?gfe_rd=cr&ei=kNRNVN-0IenA8gfquYCgBg&gws_rd=ssl");
		 
		//Assert.assertTrue(isElementPresnt((By) driver.findElement(By.xpath("//a[text()='Selenium - Web Browser Automation']"))));
		  //Assert.assertTrue(isElementPresnt(By.linkText(linkText)));
		  //isElementPresnt(locator1=driver.findElement(By.xpath("//div[@class='rc']//a[text()='Selenium - Web Browser Automation']")));
		  
		 // builder.click()driver.findElement(By.id("gbqfq"))
		
		  Actions builder = new Actions(driver);
		  
		 // JavascriptExecutor jse = (JavascriptExecutor) driver;
			//jse.executeScript("document.getElementById('gbqfq').focus();");
		  //driver.findElement(By.id("gbqfq")).sendKeys("SELENIUM");;
		  
		  builder.clickAndHold(driver.findElement(By.id("gbqfq"))).keyDown(Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).build().perform();
		  Thread.sleep(5000);
		
	  }
	  boolean isElementPresnt(By locator1)
	  {
		  try
		 {
			 
			 driver.findElement(locator1);
			 return true;
		 }
		 catch(Exception e)
		 {
			 System.out.println("No  such as element found");
			 return false;
		 }
	  }
	  
	  
	  @Test(enabled=false)
	  public void macysLogoVerfication()
	  {
		  driver.get("https://www.macys.com");
		  System.out.println("Comparision start");
		  AssertJUnit.assertTrue(isElementPresnt(By.xpath("//div[@id='macysHomePageLogo']")));
		  System.out.println("Comparision finish");
	  }
	  
	  @Test(enabled=false)
	  public void urlInfo() throws Exception
	  {
		  driver.get("https://www.macys.com");
		  String url= driver.getCurrentUrl().toString();
		  Thread.sleep(3000);
		  if(url.contains("macys.com"))
		  {
			  System.out.println("It is found");
			  AssertJUnit.assertTrue(true);
		  }
		  else
		  {
			  System.out.println("It is not found");
			  AssertJUnit.assertTrue(false);
		  }
		  
		  
	  }
	  
	  
	  @Test(enabled=false)
	  public void relativePathOfJar() throws Exception
	  {
		  driver.get("https://www.macys.com");
		  System.out.println("Through relative path of jar files");
		  Thread.sleep(2000);
	  }
	  
	  @Parameters("browser")
	  @Test(enabled=false)
	  public void screenShotsOfCompleteBrowsers(String browser) throws Exception
	  {
		  driver.get("https://www.macys.com/account/profile");
		  
		  //driver.get("https://www.macys.com/account/profile/");
		  //driver.findElement(By.id("globalMastheadSignIn")).click();
		  //driver.findElement(By.id("createProfileContainer")).click();
		 
		  driver.findElement(By.id("createProfileBtn")).click();
		 Thread.sleep(5000);
		    File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    org.apache.commons.io.FileUtils.copyFile(srcFile,new File("Ss//"+browser+".png"));
		  //  org.apache.commons.io.FileUtils.copyFile(srcFile,new File("Ss//"+browser+".png"));
		    //org.apache.commons.io.FileUtils.copyFile(srcFile,new File("Ss//"+browser+".png"));
	  }
	  
	  
	  @Test(enabled=false)
	  public void handleAlertOnGoogle() throws Exception
	  {
		  driver.get("http://www.google.com/");
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("alert('Welcome')");
		  Thread.sleep(2000);
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
	  }
	  
	  
	  
	  @Test(enabled=false)
	  public void irctcFlightInfo() throws Exception
	  {
		  driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		  driver.findElement(By.xpath("//a[@href='http://air.irctc.co.in']")).click();
		  Thread.sleep(3000);
		  
		  String parentWindow=driver.getWindowHandle();
		  String parentWindowTitle = driver.switchTo().window(parentWindow).getTitle();
		  System.out.println("Title Of Parent window"+parentWindowTitle);
		  Set<String> allwin = driver.getWindowHandles();
		  for(String eachwin:allwin)
		  {
		  	String nameOfFirstWindow= driver.switchTo().window(eachwin).getTitle();
		  	System.out.println("Title Of First window"+nameOfFirstWindow);
		  	
		  	
		  	 String firstWindow = "IRCTC Online Passenger Reservation System";
		  	 
			  if(firstWindow.equalsIgnoreCase(nameOfFirstWindow))
			  {
				 break;
				 
			 }
		 
			  
		  }
		  
		  System.out.println("Enetr in to the flight resevation");
			 driver.findElement(By.xpath("//input[@id='origin']")).sendKeys("del");
			 driver.findElement(By.xpath("//a[text()='New Delhi, DEL']")).click();
			 driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("jaipur");
			 driver.findElement(By.xpath("//a[text()='Jaipur, JAI']")).click();
			 
			 driver.findElement(By.xpath("//input[@id='departDate']/preceding::div[1]/following::div[1]/img[@class='ui-datepicker-trigger']")).click();
			 driver.findElement(By.xpath("//td[@data-month='10']//a[text()='15']")).click();
			 driver.findElement(By.xpath("//select[@name='classType']//option[@value='B']")).click();
			 driver.findElement(By.xpath("//div[@onclick='submitSearch();']")).click();
			 System.out.println("Number of flights"+driver.findElements(By.xpath("//table[@class='flightcont']")).size());
			String nameOfCheapestFlight= driver.findElement(By.xpath("//div[@id='flightListResult']/div[1]//tr[1]//div/ancestor::td[1]")).getText();
			System.out.println("Name of cheapest flight  "+nameOfCheapestFlight);
			String price = driver.findElement(By.xpath("//div[@id='flightListResult']/div[1]//tr[1]//span[@class='onewayprice']")).getText();
			System.out.println("Price of cheapest flight  "+price);
			File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    org.apache.commons.io.FileUtils.copyFile(srcFile,new File("Ss//Flight.png"));
			
			 Thread.sleep(5000);
			 
		  }
		 
	  
	  @Test
	  public void irtctTraverse() throws Exception
	  {
		  driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		  driver.findElement(By.xpath("//a[@href='http://air.irctc.co.in']")).click();
		  //Thread.sleep(3000);
		  
		  String parentWindow=driver.getWindowHandle();
		  String parentWindowTitle = driver.switchTo().window(parentWindow).getTitle();
		  System.out.println("Title Of Parent window"+parentWindowTitle);
		  Set<String> allwin = driver.getWindowHandles();
		  for(String eachwin:allwin)
		  {
		  	String nameOfFirstWindow= driver.switchTo().window(eachwin).getTitle();
		  	System.out.println("Title Of First window"+nameOfFirstWindow);
		  	
		  	
		  	 String firstWindow = "IRCTC Online Passenger Reservation System";
		  	 
			  if(firstWindow.equalsIgnoreCase(nameOfFirstWindow))
			  {
				 driver.close();
				 break;
			 }
		  	
		  	
		  }
		  driver.switchTo().window(parentWindow);
		  
		  driver.findElement(By.xpath("//input[@id='loginbutton']")).click();
		  System.out.println("Handle the alert");
		  driver.findElement(By.xpath("//span[@class='close']")).click();
		  System.out.println("Handle the alert=====");
		// driver.findElement(By.xpath("//div[@id='banner3']/iframe")).click();
		  // driver.switchTo().frame(By.xpath("//div[@id='banner3']/iframe"))
		  driver.switchTo().frame((WebElement) driver.findElement(By.xpath("//div[@id='banner3']/iframe")));
		  driver.findElement(By.xpath("//img[@src='Banners/images/maharajas_300X250.jpg']")).click();
		  Set<String> maharajaWindow = driver.getWindowHandles();
		  for(String newtitle:maharajaWindow)
		  {
			  String MaharajTitle = driver.switchTo().window(newtitle).getTitle();
			  System.out.println("Maharaja's page title  "+MaharajTitle);
			  String nameOfMaharajaTitle="Maharajas' Express | Official Website of Luxury Train Tour India";
			  if(newtitle.equalsIgnoreCase(nameOfMaharajaTitle))
			  {
				  break;
			  }
		  
		  }
		  
		  
		Actions action = new Actions(driver);
		  WebElement we = driver.findElement(By.xpath("//div[@id='nav']//ul[1]//a[text()='Journeys']"));
		  action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[@id='nav']//a[text()='Gems of India']"))).build().perform();
		  driver.findElement(By.xpath("//div[@id='nav']//a[text()='Gems of India']/ancestor::li[1]//a[text()='Jaipur']")).click();
		  driver.findElement(By.xpath("//a[text()='Places Of Interest']")).click();
		  List<WebElement> nameOfPlaces = driver.findElements(By.xpath("//div[@id='view2']//h3"));
				  for(WebElement Name:nameOfPlaces)
				  {
					  System.out.println("Enetr into for each loop");
					  System.out.println("Name of Places with numbers====>>>>"+Name.getText());
					  
				  }
				  System.out.println("Outerr f each loop");
	  }
	  
	  
	  
	  
	  
	  @AfterTest
	  public void print1()
	  {
		  System.out.println("after test");
	  }

	
	 
	  }
	

	
	
	
	
	
