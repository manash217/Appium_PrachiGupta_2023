package appium.demo1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Asus_Fx_Automate 
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		//Opening the Appium Server
		AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Manasszz\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
	 	.withIPAddress("127.0.0.1").usingPort(4723).withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
        .withLogFile(new File("Appiumlog.txt")).withTimeout(Duration.ofSeconds(300)).build();

		service.start();
		System.out.println("Starting the Appium Server");
		
		//Gathering the desired Capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("automationName","UiAutomator2");
		dc.setCapability("deviceName","asus ASUS_X00TD");
		dc.setCapability("appPackage", "nextapp.fx");
		dc.setCapability("appActivity","nextapp.fx.ui.ExplorerActivity");
		
		AppiumDriver dr = new AndroidDriver(new URL("http://127.0.0.1:4723/"),dc);
		
		Thread.sleep(50000);
		dr.quit();
		service.stop();
	}

}
