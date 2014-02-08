package design_03;

/**
 * ����
  * @ClassName: Singloten  
  * @Description: TODO 
  * @author: libin 
  * @date:Oct 25, 2012 5:23:21 PM
 */
public class Singloten {
	private static Singloten instance = null;
//	���ε��������Ի�ö���ķ���
	private Singloten(){};
//	ʹ�õ����ṩΨһ�Ķ����ö���Ľӿ�
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
