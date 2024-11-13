package td6;

public class TestPromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Promotion prom = new Promotion("Promotion des Talents");
		
		Student alice = new Student("Alice", "Dupont");
		SubjectResult res1 = new SubjectResult("Math", 15.5);
		SubjectResult res2 = new SubjectResult("Info", 18.0);
		
		Student bob = new Student("Bob", "Martin");
		SubjectResult res3 = new SubjectResult("Math", 12.0);
		SubjectResult res4 = new SubjectResult("Info", 16.5);
		SubjectResult res5 = new SubjectResult("Phys", 14.0);
		
		alice.addResult(res1);
		alice.addResult(res2);
		bob.addResult(res3);
		bob.addResult(res4);
		bob.addResult(res5);
		
		prom.addStudent(alice);
		prom.addStudent(bob);
		
		System.out.println(prom.toString());
	}

}
