package com.java_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffmail_login_create {
	static WebDriver driver;
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Annesha\\Desktop\\SELENIUM JAR FIELS\\chromedriver.exe");
driver= new ChromeDriver();
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Seema Roy");
driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("seema.99885");
driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("abc55889");
driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("abc55889");
driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
WebElement q1= driver.findElement(By.xpath("//*[@id='div_hintQS']/table/tbody/tr[2]/td[3]/select"));
Select sq1= new Select(q1);
sq1.selectByVisibleText("What is your favourite pass-time?");
driver.findElement(By.xpath("//*[@id='div_hintQS']/table/tbody/tr[4]/td[3]/input")).sendKeys("tabletennis");
driver.findElement(By.xpath("//*[@id='div_hintQS']/table/tbody/tr[6]/td[3]/input")).sendKeys("mom");

//countrycode
driver.findElement(By.xpath("//*[@id='mobno']")).sendKeys("9998887770");

WebElement day= driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
Select s1= new Select(day);
s1.selectByVisibleText("05");

WebElement month= driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
Select s2= new Select(month);
s2.selectByValue("07");

WebElement year= driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
Select s3= new Select(year);
s3.selectByVisibleText("1999");
driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[2]")).click();

WebElement co1= driver.findElement(By.xpath("//*[@id='country']"));
Select co= new Select(co1);
co.selectByValue("99");

WebElement ct1= driver.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select"));
Select cc= new Select(ct1);
cc.selectByVisibleText("Coimbatore");













	}

}












