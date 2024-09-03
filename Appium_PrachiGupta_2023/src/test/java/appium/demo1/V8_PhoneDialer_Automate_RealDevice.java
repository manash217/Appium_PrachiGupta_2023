package appium.demo1;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class V8_PhoneDialer_Automate_RealDevice 
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		//Grab Capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("platformversion","10");
		dc.setCapability("deviceName","asus ASUS_X00TD");
		dc.setCapability("automationName","UiAutomator2");
		dc.setCapability("appPackage","com.google.android.dialer");
		dc.setCapability("appActivity","com.google.android.dialer.extensions.GoogleDialtactsActivity");
		
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver dr = new AndroidDriver(url,dc);
		
		//Dialing Number 
		
		WebElement dialer=dr.findElement(By.id("com.google.android.dialer:id/dialpad_fab"));
		dialer.click();
		
		WebElement num1=dr.findElement(By.id("com.google.android.dialer:id/one"));
		num1.click();
		
		WebElement num9=dr.findElement(By.id("com.google.android.dialer:id/nine"));
		num9.click();
		
		WebElement num8=dr.findElement(By.id("com.google.android.dialer:id/eight"));
		num8.click();
		
		WebElement call_connect=dr.findElement(By.id("com.google.android.dialer:id/dialpad_voice_call_button"));
		call_connect.click();
		
		WebElement sim=dr.findElement(By.xpath("//android.widget.ListView[@resource-id=\"com.google.android.dialer:id/select_dialog_listview\"]/android.widget.LinearLayout[1]"));
		sim.click();
		
		WebElement loud_speaker=dr.findElement(By.xpath("//android.widget.Button[@content-desc=\"Speaker\"]"));
		loud_speaker.click();
		
		Thread.sleep(15000);
		
		WebElement call_dis=dr.findElement(By.id("com.google.android.dialer:id/incall_end_call"));
		call_dis.click();
		
		Thread.sleep(2000);
		dr.quit();
		
		

	}

}
