package org.sam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		 search.sendKeys("iphone", Keys.ENTER);
		 List<WebElement> iphone = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		 List<String> l = new ArrayList<String>();
		 
		for (int i = 1; i < iphone.size(); i++) {
			WebElement e = iphone.get(i);
			String text = e.getText().replace(",", "");
			l.add(text);
		}
		System.out.println("iphone prices");
		for (String price : l) {
			System.out.println(price);
		}
		//convert text to integer and sort in ascending
		 
//		 List<Integer> l = new ArrayList<Integer>();
//		 
//			for (int i = 1; i < iphone.size(); i++) {
//				WebElement e = iphone.get(i);
//				String text = e.getText().replace(",", "");
//				int p = Integer.parseInt(text);
//				l.add(p);
//				l.sort(null);
//			}
//			
//			for (Integer price : l) {
//				System.out.println(price);
//			}


		
	}
}
