package design_15;

public class Cilent {

	/**  
	 * @Title: main  
	 * @Description: TODO 
	 * @param args 
	 * @return void 
	 * @author: libin  
	 * @date:Oct 31, 2012 2:20:20 PM 
	 * @throws  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������е���϶���
	       Compoent root = new Composite("��װ");
	       Compoent c1 = new Composite("��װ");
	       Compoent c2 = new Composite("Ůװ");
	       //�������е�Ҷ�Ӷ���
	       Compoent leaf1 = new Leaf("����");
	       Compoent leaf2 = new Leaf("�п�");
	       Compoent leaf3 = new Leaf("ȹ��");
	       Compoent leaf4 = new Leaf("��װ");
	       //�������Ľṹ�������϶����Ҷ�Ӷ���
	       root.addChild(c1);
	       root.addChild(c2);
	       c1.addChild(leaf1);
	       c1.addChild(leaf2);
	       c2.addChild(leaf3);
	       c2.addChild(leaf4);
	       //���ø������������������������
	       root.printStruct(" ");
	}

}
