package design_04;

public abstract class MessageAbstrace {
//	持有一个发送消息的对象
	private Message message;
	
//	初始化 发送小心对象
	public MessageAbstrace(Message message){
		this.message = message;
	}
	
	public void sendMessage(String message,String user){
		this.message.send(message, user);
	}
}
