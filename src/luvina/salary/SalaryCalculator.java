package luvina.salary;

public abstract class SalaryCalculator implements ISalaryCalculator {
	protected String role;
	protected double salaryRate;
	
	public SalaryCalculator(String role, Double salaryRate) {
		this.role = role;
		this.salaryRate = salaryRate;
	}
	
	public abstract double calculateSalary(long startSalary, int workYear);

}
