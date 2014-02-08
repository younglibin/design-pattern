package design_15;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Compoent {
	
	private String name;
	
	private List<Compoent> childsCompoent;
	
	public Composite(String name){
		this.name = name;
	}
	
	@Override
	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(preStr+"+"+this.name);
		if(null != childsCompoent ){
			for(Compoent c : childsCompoent){
				c.printStruct("");
			}
		}
	}
	
	@Override
	public void addChild(Compoent child){
		if(null == childsCompoent){
			childsCompoent = new ArrayList<Compoent>();
		}
		childsCompoent.add(child);
	}
}
