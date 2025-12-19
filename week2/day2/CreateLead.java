package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

public static void main(String[] args) throws InterruptedException {
		
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
		
	//Click on the "Leads" tab.
	driver.findElement(By.xpath("(//div[@class='frameSectionHeader'])[2]")).click();
	System.out.println("Clicked on leads tab");
		
	//Click on the Create Lead link from shortcuts
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
	//Enter a CompanyName
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
	
	//Enter a FirstName.
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("David");
	
	//Enter a LastName.
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
	
	//Enter a Title
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Leadcreation");
	
	///Click on the Create Lead button
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	
	//Print the title of the current web page
	String title =driver.getTitle();
	System.out.println("Title of the current page is: "+title);
	
	//Close the browser window.
	driver.close();

	}

}
