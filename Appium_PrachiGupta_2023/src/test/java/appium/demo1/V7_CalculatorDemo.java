package appium.demo1;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class V7_CalculatorDemo 
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		//Desired Capabilities
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platfromName","Android");
		dc.setCapability("platformversion","12");
		dc.setCapability("deviceName","Pixel8");
		dc.setCapability("automationName","UiAutomator2");
		//dc.setCapability("appPackage","com.google.android.calculator");
		//dc.setCapability("appActivity","com.android.calculator2.Calculator");
		
		URL url=URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver dr = new AndroidDriver(url,dc);
		
		//Thread.sleep(5000);
		System.out.println("Appium is Started Successfully");
		
		//Click 9
		WebElement num9=dr.findElement(By.id("com.google.android.calculator:id/digit_9"));
		num9.click();
		
		//Click +
		WebElement plusSign=dr.findElement(By.id("com.google.android.calculator:id/op_add"));
		plusSign.click();
		
		//Click 10
		WebElement num10=dr.findElement(By.id("com.google.android.calculator:id/digit_7"));
		num10.click();
		
		/*
		//Click =
		WebElement equalSign=dr.findElement(By.id("com.google.android.calculator:id/eq"));
	    equalSign.click();
	    */
		
	    Thread.sleep(1000);
	    //Result Capture
	    WebElement res=dr.findElement(By.id("com.google.android.calculator:id/result_preview"));
	    String result=res.getText();
	    System.out.println("Result is = "+result);
	  	
	    if(result.equals("16"))
	    	System.out.println("Test Passed");
	    else
	    	System.out.println("Test Failed");
	  	
		
		Thread.sleep(5000);
		dr.quit();
	}

}
