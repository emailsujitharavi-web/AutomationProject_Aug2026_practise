package org.saucedemo.automation.utility;

import java.io.FileReader;
import java.util.Properties;

public class ConfigProp {
	public static String read_Config_file(String key) throws Exception
	{
		
		FileReader fr = new FileReader("./testdata/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
	
	public static String read_element_file(String key) throws Exception
	{
		
		FileReader fr = new FileReader("./testdata/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
	
}


