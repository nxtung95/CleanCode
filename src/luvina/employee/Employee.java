package luvina.employee;

import java.time.Period;

import luvina.salary.SalaryCalculator;
import luvina.util.Utils;

public class Employee {
	private String name;
	private String birthday;
	private String role;
	private String startDate;
	private String startSal;
	private SalaryCalculator calculator;

	public Employee(String name, String birthday, String role, String startDate, String startSal, SalaryCalculator calculator) {
		this.name = name;
		this.birthday = birthday;
		this.role = role;
		this.startDate = startDate;
		this.startSal = startSal;
		this.calculator = calculator;
	}

	public String getStartSal() {
		return startSal;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public String getStartDate() {
		return startDate;
	}

	public int getAge() {
		Period periodDate = Utils.getPeriodDate(this.birthday);
		int age = periodDate.getYears();
		return age;
	}

	public String getWorkDate() {
		Period periodDate = Utils.getPeriodDate(this.startDate);
		String workDate = periodDate.getYears() + " nam," + periodDate.getMonths() + " thang";
		return workDate;
	}

	public double getEmployeeSalary() {
		Period periodDate = Utils.getPeriodDate(this.startDate);
		int workYear = periodDate.getYears();
		long startSal = Long.parseLong(this.startSal);
		double salary = calculator.calculateSalary(startSal, workYear);
		return salary;
	}
}
