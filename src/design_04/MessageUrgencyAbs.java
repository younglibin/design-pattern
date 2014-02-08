package design_04;

public class MessageUrgencyAbs extends MessageAbstrace {

	public MessageUrgencyAbs(Message message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public void sendMessage(String message,String user){
		super.sendMessage("¼Ó¼±£º "+message, user);
	}
}
