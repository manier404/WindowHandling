package org.maven.WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LvbBank {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Selenium\\maven\\Day_10\\WindowHandling\\Driver\\chromedriver.exe");
	WebDriver launch  = new ChromeDriver();
	launch.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
	launch.manage().window().maximize();
	
	WebElement Active = launch.findElement(By.xpath("//a [text() ='New User Activation']"));
	Active.click();
	
	String Parent=launch.getWindowHandle();
	Set<String> All = launch.getWindowHandles();
	
	System.out.println(All);
	
	for (String X : All) {
		if (!X.equals(Parent)) {
			launch.switchTo().window(X);
		}
			}
	launch.findElement(By.id("fldUId")).sendKeys("t.manier404");
	
	WebElement submit = launch.findElement(By.xpath("//a [@ onclick = 'return userSubmit();']"));
	submit.click();
	
}
}
