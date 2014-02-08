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
		//定义所有的组合对象
	       Compoent root = new Composite("服装");
	       Compoent c1 = new Composite("男装");
	       Compoent c2 = new Composite("女装");
	       //定义所有的叶子对象
	       Compoent leaf1 = new Leaf("衬衣");
	       Compoent leaf2 = new Leaf("夹克");
	       Compoent leaf3 = new Leaf("裙子");
	       Compoent leaf4 = new Leaf("套装");
	       //按照树的结构来组合组合对象和叶子对象
	       root.addChild(c1);
	       root.addChild(c2);
	       c1.addChild(leaf1);
	       c1.addChild(leaf2);
	       c2.addChild(leaf3);
	       c2.addChild(leaf4);
	       //调用根对象的输出功能来输出整棵树
	       root.printStruct(" ");
	}

}
