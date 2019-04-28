
public class Function {

	final int rock = 1;
	final int paper = 2;
	final int scissor = 3;
	String name ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	int computerValue() {
		
		int value = (int) (Math.random() * 3 + 1);  
		
		return value;
	}
	
}
