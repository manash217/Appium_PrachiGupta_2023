package appium.demo1;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
 
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class V6_ApkInstall 
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		//Gather Desired Capabilities
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("automationName","uiautomator2");
		//dc.setCapability("deviceName","Pixel3a");
		dc.setCapability("deviceName","asus ASUS_X00TD");
		dc.setCapability("app","C:\\Users\\Manasszz\\Desktop\\Fx.apk");
		dc.setCapability("platformversion","10");
		
		
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver dr = new AndroidDriver(url,dc);
		
		//Thread.sleep(5000);
		System.out.println("Appium started Successfully");
		
		dr.quit();
		
		
		
	}

}
