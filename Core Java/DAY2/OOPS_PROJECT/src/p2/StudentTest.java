package p2;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student vj=new Student(5891,"Vijay Krishna",100);
		
		Student nvya=new Student(5892,"Navya SR",0);
		
		vj.showGrade();
		nvya.showGrade();
		
		System.out.println("--------------------------------------");
		
		System.out.println( Student.getSubject() );
	}

}
