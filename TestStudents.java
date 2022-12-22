package student;


public class TestStudents {
	public static void main(String[] args) {
		
		Student roster[] = new Student[3];
		
		roster[0] = new GraduateStudent();
		roster[0].setName("Grad 1");
		roster[1] = new GraduateStudent();
		roster[1].setName("Grad 2");
		roster[2] = new UndergraduateStudent("Undergrad 1");
		
		for (int i=0; i<roster.length; i++) {
			for (int j=1; j<=3; j ++) {
				int randomScore = (int) (30 + Math.random() * 71);
				roster[i].setTestScore(j, randomScore);
			}
			
		}
		
		for (int i = 0; i < roster.length; i++) {
			roster[i].computeCourseGrade();
		}
		
		for (int i = 0; i < roster.length; i++) {
			System.out.println("Student " + roster[i].getName() + " has a course grade of " + roster[i].getCourseGrade());
		}
	}

}
