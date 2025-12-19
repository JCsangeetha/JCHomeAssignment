package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	
	public static void main(String[]args)
	{
	
	//Initialize the WebDriver (ChromeDriver)
	ChromeDriver driver = new ChromeDriver();
			
	//Maximize the browser window
	driver.manage().window().maximize();
					
	//apply implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
	//Load the URL http://leaftaps.com/opentaps/
	driver.get("http://leaftaps.com/opentaps/");
			
	//Enter the username as ‘demosalesmanager’
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			
	//Enter the password as 'crmsfa'
	driver.findElement(By.id("password")).sendKeys("crmsfa");
			
	//Click on the Login button
	driver.findElement(By.className("decorativeSubmit")).click();
			
	//Click on the CRM/SFA link
	driver.findElement(By.xpath("//div[@id='button']")).click();
	
	//Click on the "Accounts" tab.
	driver.findElement(By.xpath("(//div[@class='x-panel-header'])[4]")).click();
	
	//Click on the "Create Account" button
	driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	
	//Enter an account name
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Joseph");
	
	//Enter a description as "Selenium Automation Tester."
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
	
	//Enter a Number Of Employees.
	driver.findElement(By.id("numberEmployees")).sendKeys("25");
	
	//Enter a Site Name as “LeafTaps”
	driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	
	//Click the "Create Account" button
	driver.findElement(By.className("smallSubmit")).click();
	
	//Print theTitle name
	String pageTitle=driver.getTitle();
	System.out.println(pageTitle);
	
	//Close the browser window.
	driver.close();
}}
