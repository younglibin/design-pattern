package design_02;

public class Client {

	/**  
	 * @Title: main  
	 * @Description: TODO 
	 * @param args 
	 * @return void 
	 * @author: libin  
	 * @date:Oct 24, 2012 2:50:51 PM 
	 * @throws  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExportOpertor op = 
//			new ExportDBOperator();
			new ExportTxtOperator();
		op.export("  test data  ");
	}

}
