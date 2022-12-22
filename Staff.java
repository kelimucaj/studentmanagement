
public class Staff extends Person {
	
	private int yearsOfExperience;
	private double salary;

	public Staff(String name, int age, int years, double salary) {
		super(name, age);
		setYearsOfExperience(years);
		setSalary(salary);
	}
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double base) {
		int years = getYearsOfExperience();
		double bonus = 0;
		if (years < 10)
			bonus = 0.2;
		if (years >= 10 & years <=25)
			bonus = 0.5;
		if (years > 25)
			bonus = 1.0;
		
		this.salary =  base * (1 + bonus);
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		if (yearsOfExperience > 0 && yearsOfExperience <=42)
			this.yearsOfExperience = yearsOfExperience;
	}


	@Override
	public String toString() {
		return "Staff[" + super.toString() +
				"yearsOfExperience=" + yearsOfExperience + ", salary=" + salary + "]";
	}
	
	

}
