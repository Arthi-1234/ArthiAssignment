package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opportunity {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();         
		ch.addArguments("--disable-notifications");         
		ChromeDriver driver = new ChromeDriver(ch);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-r5")).click();
		Thread.sleep(10000);
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Opportunities']"));
        driver.executeScript("arguments[0].click();",findElement);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Arthi");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@name='today']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//button[@data-value='--None--'])[1]")).click();
	    driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	    String msg = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	    System.out.println(msg);
	   if(msg.contains("Arthi"))
	   {
		   System.out.println("Opportunity is saved");
	   }
	   else
	   {
		   System.out.println("Opportunity is NOT saved");
	   }
		
	}

	}

