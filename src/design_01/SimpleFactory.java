package design_01;

import java.util.Properties;


public class SimpleFactory {
	private static final String filepath="conf/factory.properties";

	public static Simple getInstance(){
		Simple instance = null; 
		try {
			Properties p = PropertyUtil.getProperty(filepath);
			instance = (Simple)Class.forName(p.getProperty("implClass")).newInstance() ;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  instance;
	}
	
}
