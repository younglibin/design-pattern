package design_01;

public class Client {

	/**  
	 * @Title: main  
	 * @Description: TODO 
	 * @param args 
	 * @return void 
	 * @author: libin  
	 * @date:Oct 24, 2012 11:05:10 AM 
	 * @throws  
	 */
	public static void main(String[] args) {
		SimpleFactory factory = new SimpleFactory();
		// TODO Auto-generated method stub
		Simple simple = factory.getInstance();
		simple.test();
		simple.method();
	}

}
