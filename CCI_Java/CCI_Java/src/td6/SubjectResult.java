package td6;

public class SubjectResult {

	private String name;
	private double mark;
	
	public SubjectResult(String name, double mark) {
		this.name = name;
		this.mark = mark;
	}
	
	public String getName() {
		return name;
	}
	
	public double getMark() {
		return mark;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "/" + mark ;
	}
}
