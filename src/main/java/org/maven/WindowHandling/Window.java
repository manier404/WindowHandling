package org.maven.WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Selenium\\maven\\Day_10\\WindowHandling\\Driver\\chromedriver.exe");
	WebDriver launch  = new ChromeDriver();
	launch.get("https://www.flipkart.com/");
	launch.manage().window().maximize();
	
	WebElement Close = launch.findElement(By.xpath("// button [@ class = '_2AkmmA _29YdH8']"));
	Close.click();
	
	Thread.sleep(3000);
	WebElement Elect = launch.findElement(By.xpath("(//span [@ class = '_1QZ6fC _3Lgyp8'])[1]"));
	Actions act = new Actions(launch);
	act.moveToElement(Elect).perform();
	
	Thread.sleep(3000);
	WebElement Apple = launch.findElement(By.xpath("//a [text() = 'Apple']"));
	Actions act1 = new Actions(launch);
	act1.moveToElement(Apple).perform();
	Apple.click();
	
	Thread.sleep(3000);
	WebElement I7 = launch.findElement(By.xpath("(//img[@class='_2VeolH _3I5S6S'])[5]"));
	I7.click();
	
	Thread.sleep(3000);
	WebElement Plus = launch.findElement(By.xpath("//div[text () = 'Apple iPhone 7 Plus (Gold, 128 GB)']"));
	Plus.click();
	
	Thread.sleep(8000);
	WebElement add = launch.findElement(By.xpath("//button[@class ='_2AkmmA _2Npkh4 _2MWPVK']"));
	add.click();
	
	String Parent=launch.getWindowHandle();
	Set<String> All = launch.getWindowHandles();
	
	System.out.println(All);
	
	for (String X : All) {
		if (!X.equals(Parent)) {
			launch.switchTo().window(X);
		}
		
	}
}
}
