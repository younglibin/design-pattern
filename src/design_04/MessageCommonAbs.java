package design_04;

public class MessageCommonAbs extends MessageAbstrace {

	public MessageCommonAbs(Message message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	public void sendMessage(String message,String user){
		super.sendMessage("ÆÕÍ¨ £º "+message, user);
	}
}
