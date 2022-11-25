package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("BNYM");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Arthi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sankar");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Baby");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Automation testing");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("arthi.san@gamil.com");
		
		WebElement StateDD = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dd = new Select(StateDD);
		dd.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		Thread.sleep(10000);
		System.out.println("Page title is : " + driver.getTitle());
		Thread.sleep(5000);
		//driver.close();
		
	// My Lead Xpath	
			
		//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a
		//td [@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a
		
		//myntra flying machine checkbox
	//	(//input[@value="Flying Machine"])[1]
		//label[text()='Flying Machine']/input
		
		//salesforce.com
		//span[text()='Subject']/parent::label/following-sibling::input
		
	

	}

}
