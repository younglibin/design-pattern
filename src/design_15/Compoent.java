package design_15;

public abstract class Compoent {
	private static final String UNSUPORT_STR="对象不支持这个功能";
	/**
	 * 输出组建自身
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
	 * 添加一个子节点
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
	 * 移除一个子节点
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
	 * 返回一个子节点
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
