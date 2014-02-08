package design_02;

public class ExportTxtOperator extends ExportOpertor {

	@Override
	public ExportFile factoryMethod() {
		// TODO Auto-generated method stub
		return new ExportTxtFileImpl();
	}

}
