package generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShot_element {
	@Test
	public void get_photo_element(WebElement ele, String txt)
	{
		File tmp=ele.getScreenshotAs(OutputType.FILE);
		File pmt=new File("./element_photo/"+txt+".jpg");
		
		try
		{
			FileHandler.copy(tmp, pmt);
		}
		catch (IOException e)
		{
			System.out.println("File Not Found");
			e.printStackTrace();
		}
	}

}
