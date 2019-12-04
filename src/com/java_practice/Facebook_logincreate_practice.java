package com.java_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_logincreate_practice {

static WebDriver driver;

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Annesha\\Desktop\\SELENIUM JAR FIELS\\chromedriver.exe");
driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.name("firstname")).sendKeys("Parav");
driver.findElement(By.name("lastname")).sendKeys("Rai");
driver.findElement(By.name("reg_email__")).sendKeys("9998887710");
driver.findElement(By.name("reg_passwd__")).sendKeys("abc1212456d");
WebElement month= driver.findElement(By.xpath("//*[@id='month']"));
Select m1= new Select(month);
m1.selectByValue("3");

WebElement day= driver.findElement(By.xpath("//*[@id='day']"));
Select d1= new Select(day);
d1.selectByValue("5");
WebElement year= driver.findElement(By.xpath("//*[@id='year']"));
Select y1= new Select(year);
y1.selectByValue("1999");
//driver.findElement(By.xpath("//*[@id='u_0_a']")).click();
driver.findElement(By.xpath("//input[@value='1']")).click();






































	}

}
