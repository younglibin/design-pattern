package design_02;

public class ExportDBOperator extends ExportOpertor {

	@Override
	public ExportFile factoryMethod() {
		// TODO Auto-generated method stub
		return new ExportDBFileImpl();
	}
}
