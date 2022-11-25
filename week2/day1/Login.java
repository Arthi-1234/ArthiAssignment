package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		//Setup the Browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Maximize the window
		driver.manage().window().maximize();
		
		//find element and provide username and password
		
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
				
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BNYM");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arthi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sankar");
		//Click DD and select the value 
		WebElement eleTool = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(eleTool);
		dd.selectByValue("LEAD_CONFERENCE");
		//dd.selectByIndex(1);
       // dd.selectByVisibleText("Direct Mail");
		
		//to get value selected
		WebElement DDValue = dd.getFirstSelectedOption();
		DDValue.getText();
		
        driver.findElement(By.name("submitButton")).click();
		Thread.sleep(10000);
		driver.close();
		
		
	}

}
