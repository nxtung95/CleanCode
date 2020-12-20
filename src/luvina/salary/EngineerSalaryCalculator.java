package luvina.salary;

public class EngineerSalaryCalculator extends SalaryCalculator {

	public EngineerSalaryCalculator(String role, Double salaryRate) {
		super(role, salaryRate);
	}

	@Override
	public double calculateSalary(long startSalary, int workYear) {
		double rate = Math.round(Math.pow(1 + this.salaryRate, workYear) * 100.0) / 100.0;
		double salary = startSalary * rate;
		return salary;
	}

}
