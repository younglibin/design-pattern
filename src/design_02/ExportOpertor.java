package design_02;

public abstract class ExportOpertor {
	public boolean export(String data){
		ExportFile api = this.factoryMethod();
		return api.export(data);
	}
	public abstract ExportFile factoryMethod();
}
