package LibraryFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class base_class {
	
	public WebDriver driver;
	
	public void initilizebrowser()
	
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-Origins=*","iqnore-certificate-errors");
		
		driver=new ChromeDriver(op);
		
		driver.get("http://adactinhotelapp.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	

}
