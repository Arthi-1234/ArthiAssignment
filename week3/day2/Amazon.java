package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();         
		option.addArguments("--disable-notifications");         
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones",Keys.ENTER);
		Thread.sleep(5000);
		List<WebElement> allmobprice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> pricelist = new ArrayList<Integer>();
		
		for (WebElement eachmobprice : allmobprice) {
			System.out.println(eachmobprice.getText());
			String text = eachmobprice.getText();
			if(!text.isBlank()) {		
			String replace = text.replace(",","").replace("", "");
			int price = Integer.parseInt(text);
			pricelist.add(price);
		}
			
			Collections.sort(pricelist);
			System.out.println("Least Price: " + pricelist.get(0));
		}

	}

}