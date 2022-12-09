package cod;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class countchar {
public static void main(String[] args)
{
	/*String s="my character is simpmle i j kl";
	int i=s.length()-s.replaceAll("m","").length();
	System.out.println(i);
	System.out.println(s);*/
	
	WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	 driver.get("https://www.ishipdocs.com/ishipdocs/Secure/Login.aspx");
	 driver.findElement(By.name("txtUserId")).sendKeys("g2@yopmail.com");
	 driver.findElement(By.xpath("//input[@class='span12 error ']")).sendKeys("123456");
	 driver.findElement(By.cssSelector("#btnLogin")).click();
	 Alert a=driver.switchTo().alert();
	 a.accept();
	
	
}
}
