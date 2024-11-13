package td5.ex01;

public class Holiday {
	Date start;
	Date end;
	
	public Holiday(Date start, Date end) {
		this.start = start;
		this.end = end;
	}
	
	public Holiday() {
		this.start = new Date();
		this.end = new Date();
	}

}
