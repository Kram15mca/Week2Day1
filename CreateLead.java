package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setup chrome driver
				WebDriverManager.chromedriver().setup();
				
				//open the browser chrome
				ChromeDriver driver = new ChromeDriver();
				
				// load the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
								
				//maximize the browser window
				driver.manage().window().maximize();
//Identify the WebElement
			//	WebElement elseUserName = driver.findElement(By.id("UserName"));
				
				
				//Enter the UseName
				//eleUserName.sendKeys("DemosalesManager");
				
				
				driver.findElement(By.id("username")).sendKeys("DemosalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				
			
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestData");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rama");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("subramanian");
				
				WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select dd = new Select(dropdown);
				dd.selectByValue("LEAD_CONFERENCE");
				driver.findElement(By.name("submitButton")).click();
				
				
	}
	

}
