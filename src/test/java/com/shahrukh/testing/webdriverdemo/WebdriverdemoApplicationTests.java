package com.shahrukh.testing.webdriverdemo;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebdriverdemoApplicationTests {
	
	WebDriver driver;
	
	@BeforeEach
	void setup() {
		//if you are using the pom dependency of chromedriver ,then there is no need setting the property
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahrukk\\STS_WorkSpace\\webdriverdemo\\src\\main\\java\\browserexe\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void getCommand() throws Exception {
		try {
			sleepNsec(3);
			driver.manage().window().maximize();
			sleepNsec(3);
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/?ext_vrnc=hi&tag=abkexpt1-21&ascsubtag=_k_Cj0KCQjwjcfzBRCHARIsAO-1_OojhW_VhcaU_dTg-xAf1OXZ8R4JECe66GgvG4laT3Ja5JpzlTOFQh0aAgi9EALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQjwjcfzBRCHARIsAO-1_OojhW_VhcaU_dTg-xAf1OXZ8R4JECe66GgvG4laT3Ja5JpzlTOFQh0aAgi9EALw_wcB");
			sleepNsec(3);
			
			String titleofThePage=driver.getTitle();
			String currentUrl=driver.getCurrentUrl();
			String pageSourceCode=driver.getPageSource();
			System.out.println("The sourcecode of the page :" +pageSourceCode);
			System.out.println("The current url : " +currentUrl);
			System.out.println("The title of the page :" +titleofThePage);
			driver.findElement(By.linkText("Today's Deals")).click();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	
	private void sleepNsec(int i) {
		try {
			Thread.sleep(i*1000);
		}catch (Exception e) {
			e.getStackTrace();
		}
		
	}


	@AfterEach
	void tearDown() throws InterruptedException {
		driver.quit();
	}
}

