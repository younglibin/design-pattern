package design_04;

public class MessageClient {

	/**  
	 * @Title: main  
	 * @Description: TODO 
	 * @param args 
	 * @return void 
	 * @author: libin  
	 * @date:Oct 30, 2012 3:39:41 PM 
	 * @throws  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message message= 
//			new MessageEmail();
			new MessageSMS();
		MessageAbstrace mab = 
		new MessageCommonAbs(message);
//		 new MessageUrgencyAbs(message);
//		 new MessageSpecilaAbs(message);
		
		
		String mstr = "�뽻����:";
		String user = "���";
		mab.sendMessage(mstr, user);
	}

}
