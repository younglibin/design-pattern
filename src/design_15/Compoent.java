package design_15;

public abstract class Compoent {
	private static final String UNSUPORT_STR="����֧���������";
	/**
	 * ����齨����
	  * @Title: printStruct  
	  * @Description: TODO 
	  * @param preStr 
	  * @return void 
	  * @author: libin  
	  * @date:Oct 31, 2012 2:05:08 PM 
	  * @throws
	 */
	public abstract void printStruct(String preStr);
	
	/**
	 * ���һ���ӽڵ�
	  * @Title: addChild  
	  * @Description: TODO 
	  * @param child 
	  * @return void 
	  * @author: libin  
	  * @date:Oct 31, 2012 2:07:40 PM 
	  * @throws
	 */
	public void addChild(Compoent child){
		throw new UnsupportedOperationException(UNSUPORT_STR);
	}
	/**
	 * �Ƴ�һ���ӽڵ�
	  * @Title: removeChild  
	  * @Description: TODO 
	  * @param child 
	  * @return void 
	  * @author: libin  
	  * @date:Oct 31, 2012 2:08:02 PM 
	  * @throws
	 */
	public void removeChild(Compoent child){
		throw new UnsupportedOperationException(UNSUPORT_STR);
	}
	/**
	 * ����һ���ӽڵ�
	  * @Title: getChild  
	  * @Description: TODO 
	  * @param child 
	  * @return void 
	  * @author: libin  
	  * @date:Oct 31, 2012 2:08:23 PM 
	  * @throws
	 */
	public void getChild(Compoent child){
		throw new UnsupportedOperationException(UNSUPORT_STR);
	}
}
