package com.shahrukh.testing.webdriverdemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class navigationdemo {
	
	WebDriver driver;
	
	@BeforeEach
	void setup() {
		driver= new ChromeDriver();
	}
	
	@Test
	public void navigate() {
		sleepNsec(2);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		sleepNsec(3);
		driver.navigate().to("https://www.flipkart.com/?gclid=Cj0KCQjwjcfzBRCHARIsAO-1_OrIKZCtq_u6vO_w32fKJDuG2BDSWKHBkUGxaxTeokQED9PLZ8oFUAwaAiHYEALw_wcB&ef_id=Cj0KCQjwjcfzBRCHARIsAO-1_OrIKZCtq_u6vO_w32fKJDuG2BDSWKHBkUGxaxTeokQED9PLZ8oFUAwaAiHYEALw_wcB:G:s&s_kwcid=AL!739!3!326505318642!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
		sleepNsec(2);
		
	}
	
	
	private void sleepNsec(int i) {
		try {
			Thread.sleep(i*1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@AfterEach
	void tearDown() throws InterruptedException {
		driver.quit();
	}

}
