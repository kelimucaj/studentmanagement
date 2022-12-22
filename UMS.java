
public class UMS {
	
	public static void main(String[] args) {
		
		Person  person       = new Person("John Smith", 20);
		
		Staff   staffOne     = new Staff("Alice Red", 35, 8, 1700);
		Staff   staffTwo     = new Staff("Bob Green", 26, 3, 1300);
		Staff   staffThree    = new Staff("Mike Yellow", 45, 18, 3400);

		Staff[] listOfStaff = {staffOne, staffTwo, staffThree};
		for (Staff staff : listOfStaff)
			System.out.println(staff);
		
		double averageSalary = 0.0;
		for (Staff staff: listOfStaff)
			averageSalary += staff.getSalary();
		averageSalary /= listOfStaff.length;
		
		System.out.println("Average Salary = " + averageSalary);
		
		int largerThan1000Count = 0;
		for (Staff staff: listOfStaff)
			if (staff.getYearsOfExperience() > 10)
				largerThan1000Count++;
		System.out.println("There are " + largerThan1000Count + " "
				+ "staff with more than 10 years of experience");
		
		
	}
}
