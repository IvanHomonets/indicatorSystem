

public class Metadata {
	private int idMetadata;
	
	private char[] key=new char[45];
	private char[] value=new char[45];
	private char[] type=new char[45];
	
	private int model_ref;
	private int indicator_ref;
	
	public boolean setValue(String value) {
		return true;
	}
	public String getValue() {
		return null;
	}
	
	
	
	public boolean setType(String type) {
		return true;
	}
	public String getType() {
		return null;
	}
}
