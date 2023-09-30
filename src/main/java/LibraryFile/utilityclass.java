package LibraryFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import org.openqa.selenium.TakesScreenshot;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utilityclass {
	
	@Test
	//name:sandhya
	
	// Date:13/9/2023
	//day:WEd
	//to featch the data from pf
	
	public static String getdatafrompf(String key) throws IOException
	{
		// to reach to the Properti file
		
		FileInputStream file=new FileInputStream("E:\\javax\\TestNG\\Properttfile.properties");
		
		//Create Object of Propertiesclass
		
		Properties pro=new Properties();
		
		// to open file Properties
		
		pro.load(file);
		
		//to featch the data from Properties file
		
		String value=pro.getProperty(key);
		
		return value;
		
	}
	@Test

	//name:sandhya
	
		// Date:14/9/2023
		//day:THU
		//to featch the data from EXcelSheet
	public static String getdataFromExcelSheet(int RowIndex,int CellIndex)throws IOException {
		// to reach to theExcelSheet
		
				FileInputStream file=new FileInputStream("E:\\javax\\MavenProject_hospitility\\TestData\\ddf1.xlsx");
				String value1=WorkbookFactory.create(file).getSheet("Sheet1").getRow(RowIndex).getCell(CellIndex).getStringCellValue();
				
				
		
		return value1;
	}
	
	//name:sandhya
	
			// Date:15/9/2023
			//day:Fri
			//To Capture the ScreenShoot
	@Test
	
		public static void CaptureSchreenShot(WebDriver driver,String TestCaseId) throws IOException
	{

		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		System.out.println(Source);

		  File Destination=new File("E:\\javax\\MavenProject_hospitility\\ScreenShot"+TestCaseId+".jpg");
		  
		  FileHandler.copy(Source,Destination);

	}
	
}
