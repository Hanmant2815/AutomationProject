package nikitaAutomationproject.automation;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated meth
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.safaridriver().setup();
		WebDriver dr = new ChromeDriver();
		String url="https://www.selenium.dev/";
		dr.get(url);
		//dr.navigate().to(url);
		dr.manage().window().maximize();
		System.out.println(dr.getCurrentUrl());
		System.out.println(dr.getTitle());
		System.out.println(dr.getPageSource());
		System.out.println(dr.findElement(By.tagName("a")));
		//Thread.sleep(2000);
	    WebElement e= 	dr.findElement(By.xpath("//a[@href='/downloads']"));
		File src = e.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshot\\file.png");
		FileUtils.copyFile(src, trg);
		Set<Cookie> s = dr.manage().getCookies();
		for (Cookie cookie : s) {
			System.out.println("cookie values "+cookie);
		}
		JavascriptExecutor js= ((JavascriptExecutor)dr);
		
	}

}
