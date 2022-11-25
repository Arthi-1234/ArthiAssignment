package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		try {
			driver.findElement(By.linkText("Create Lead")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BNYM");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arthi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sankar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Baby");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arthi.san@gamil.com");
		
		WebElement StateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(StateDD);
		dd.selectByVisibleText("New York");
		try {
			driver.findElement(By.name("submitButton")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Edit")).click();
		WebElement Desc = driver.findElement(By.id("updateLeadForm_description"));
		Desc.clear();
		Desc.sendKeys("Automation Selenium");
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Updated Description");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Page Title is : " + driver.getTitle());
		Thread.sleep(10000);

	}

}
