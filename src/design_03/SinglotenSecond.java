package design_03;

public class SinglotenSecond {
	private static class SinglotenSecondHolder{
		private static SinglotenSecond instance = new SinglotenSecond();
	}
	private SinglotenSecond(){};
	public static SinglotenSecond getInstance(){
		return SinglotenSecondHolder.instance;
	}
}
