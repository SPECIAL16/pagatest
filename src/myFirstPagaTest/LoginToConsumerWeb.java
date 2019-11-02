package myFirstPagaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToConsumerWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	   	 //setting the property of yor test
	   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Drivers\\driver\\chromedriver.exe");
	   	 
	   	 //Creating an instance of driver, to launch browser
	   	 WebDriver browser = new ChromeDriver();
	   	 
	   	 //to open the mypaga login page
	   	 browser.get("https://www.mypaga.com/");
	    
	   	 //to maximize the browser
	   	 browser.manage().window().maximize();
	   	 
	   	 //to check the actual url is displayed
	   	 System.out.println(browser.getTitle());
	   	 
	   	 //to write email into email field
	   	 browser.findElement(By.name("credential")).sendKeys("tawakalthassan@gmail.com");
	   	 
	   	 //to click the login button
	   	 browser.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/form/a[1]")).click();
	   	 
	   
	}

}
