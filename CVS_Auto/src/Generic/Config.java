package Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	public static String getproperty(String path,String key) {
		String value=" ";
		try {
			Properties p= new Properties();
			p.load(new FileInputStream(path));
			value=p.getProperty(key);
		}
		catch(Exception e){
		}
		return value;

}
}
