package design_04;

public abstract class MessageAbstrace {
//	����һ��������Ϣ�Ķ���
	private Message message;
	
//	��ʼ�� ����С�Ķ���
	public MessageAbstrace(Message message){
		this.message = message;
	}
	
	public void sendMessage(String message,String user){
		this.message.send(message, user);
	}
}
