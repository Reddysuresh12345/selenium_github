package GanricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import Practice.IAutoconstants;

public class PropertyUtility implements IAutoconstants
{
	FileInputStream fis=null;
	Properties ppt;
public String readingDataFromPropertyFile(String key) throws IOException
{
	
	try {
	fis=new FileInputStream(PROPERTYFILE_PATH);
	ppt=new Properties();
	ppt.load(fis);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
		catch(IOException e1) {
			e1.printStackTrace();
		}

	
	return ppt.getProperty(key);
	
}




}
