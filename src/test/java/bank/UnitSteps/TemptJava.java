package bank.UnitSteps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TemptJava
{
	ChromeDriver driver=null;
	//launch browser
	public void BrowserLaunch(String bname,String exelocation)
	{
		System.setProperty(bname,exelocation);		//Browser Launch	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//open application
		driver.navigate().to("http://primusbank.qedgetech.com/");
	}
	public void Uname(String UserName)
	{
		driver.findElementByXPath("//input[@placeholder='User Name']");	//enter username
	}	
	public void Pwd(String Password)
	{
		driver.findElementByXPath("//input[@name=\"txtPword\"]");	//enter password
	}
	public void login()
	{
		driver.findElementByXPath("//input[@name='login']").click(); //click on login
	}
	public void branch()
	{
		driver.findElementByXPath("//img[@src=\"images/Branches_but.jpg\"]").click(); //click Branches
	}
	//select country
	public void country(String country1)
	{
	Select country=new Select(driver.findElementByXPath("//*[@name='lst_countryS']"));
	}
	public void state2(String state1)
	{
	//select state
	Select state=new Select(driver.findElementByXPath("//*[@name='lst_stateS']"));
	}
	public void city2(String city1)
	{
	//select city
	Select city=new Select(driver.findElementByXPath("//*[@name='lst_cityS']"));	
	}
	public void search()
	{
	//click on search
	driver.findElementByXPath("//*[@name=\"btn_search\"]");
	}
			
	public static void main(String[] args) 
	{
		TemptJava obj=new TemptJava();
		obj.BrowserLaunch("webdriver.chrome.driver","C:\\Users\\Nithya Lakshmi\\Downloads\\Automation folder\\chromedriver_win32\\chromedriver.exe");
		obj.Uname("Admin");	
		obj.Pwd("Admin");
		obj.login();
		obj.branch();	
		obj.country("INDIA");
		obj.state2("Andhra Pradesh");
		obj.city2("Hyderabad");
		
	}
}
