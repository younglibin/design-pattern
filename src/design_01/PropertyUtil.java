package design_01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
	public static  Properties getProperty(String filepath){
		Properties p = new Properties();
		try {
			InputStream in = PropertyUtil.class.getResourceAsStream(filepath);
			p.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
}
