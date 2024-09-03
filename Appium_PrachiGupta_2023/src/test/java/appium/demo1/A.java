package appium.demo1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class A 
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		
		//Starting the Appium Server Programatically
		AppiumDriverLocalService service = AppiumDriverLocalService.buildService(
		new AppiumServiceBuilder().usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
		.withAppiumJS(new File("C:\\Users\\Manasszz\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		.withLogFile(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Logs\\log23.txt")));
		
		service.start();
		System.out.println("---------------------------------------Appium-Server Started---------------------------------------");
		
		
		//Gather Desired Capabilities
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("automationName","uiautomator2");
		//dc.setCapability("deviceName","Pixel8");
		dc.setCapability("deviceName","asus ASUS_X00TD");
		//dc.setCapability("app","C:\\Users\\Manasszz\\Documents\\eBook\\QA Testing\\Youtube_SDET\\2-Automation Testing\\03-Appium\\Apks\\Cal.apk");
		dc.setCapability("appPackage","com.asus.calculator");
		dc.setCapability("appActivity","com.asus.calculator.Calculator");
		dc.setCapability("platformversion","10");
		
		
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver dr = new AndroidDriver(url,dc);
		
		//
		System.out.println("---------------------------------------Calculator App-opens---------------------------------------");
		Thread.sleep(5000);
		dr.quit();
		System.out.println("---------------------------------------Calculator App-Closes---------------------------------------");
		
		service.stop();
		System.out.println("---------------------------------------Appium-Server Stopped---------------------------------------");
		
		
		
	}

}
