package design_04;

public class MessageSpecilaAbs extends MessageAbstrace {

	public MessageSpecilaAbs(Message message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public void sendMessage(String message,String user){
		super.sendMessage("�Ӽ��� "+message, user);
	}
}
