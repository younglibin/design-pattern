package design_03;

/**
 * 单例
  * @ClassName: Singloten  
  * @Description: TODO 
  * @author: libin 
  * @date:Oct 25, 2012 5:23:21 PM
 */
public class Singloten {
	private static Singloten instance = null;
//	屏蔽掉其他可以获得对象的方法
	private Singloten(){};
//	使用单例提供唯一的对外获得对象的接口
	public static Singloten getInstance(){
		if(null == instance){
			synchronized(Singloten.class){
				if(null == instance ){
					instance = new Singloten();
				}
			}
		}
		return instance;
	}

}
