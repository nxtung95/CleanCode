package luvina.main;

import java.util.ArrayList;
import java.util.List;

import luvina.employee.Employee;
import luvina.file.CsvEmployee;
import luvina.file.IEmployeeFile;
import luvina.salary.SalaryCalculator;
import luvina.salary.SalaryCalculatorFactory;
import luvina.util.Const;

public class PayRoll {

	public static void main(String[] args) {
		IEmployeeFile csvFile = new CsvEmployee();
		List<String> lines = csvFile.readFile(Const.CSV_PATH);
		List<Employee> employees = new ArrayList<Employee>();
		for (String line : lines) {
			String[] values = line.split(Const.COMMA_DELIMITER);
			String name = values[0];
			String birthday = values[1];
			String role = values[2];
			String startDate = values[3];
			String startSalary = values[4];
			SalaryCalculator calculator = SalaryCalculatorFactory.getSalaryCalculatorByRole(role);
			Employee employee = new Employee(name, birthday, role, startDate, startSalary, calculator);
			employees.add(employee);
		}
		
		for (Employee employee : employees) {
			System.out.println("Ten nhan vien: " + employee.getName());
			System.out.println("Tuoi nhan vien: " + employee.getAge());
			System.out.println("So nam va thang lam viec: " + employee.getWorkDate());
			System.out
					.println("Muc luong: " + String.format("%.0f", employee.getEmployeeSalary()));
			System.out.println("----------------------------------");
		}
	}
}
