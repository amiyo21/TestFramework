package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Generic_FetchProperties 
{
	@Test
	public void fetchProperties(String path,String key) throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream(path));
		String val = p.getProperty(key);
		
		System.out.println(val);
	}

}
