package luvina.salary;

import luvina.util.Const;

public class SalaryCalculatorFactory {
	public static final SalaryCalculator getSalaryCalculatorByRole(String typeRole) {
		switch (typeRole) {
		case Const.DIRECTOR_ROLE:
			return new DirectorSalaryCalculator(typeRole, Const.DIRECTOR_SALARY_RATE);
		case Const.MANAGER_ROLE:
			return new ManagerSalaryCalculator(typeRole, Const.MANAGER_SALARY_RATE);
		case Const.SALES_ROLE:
			return new SalesSalaryCalculator(typeRole, Const.SALES_SALARY_RATE);
		case Const.ENGINEER_ROLE:
			return new EngineerSalaryCalculator(typeRole, Const.ENGINEER_SALARY_RATE);
		case Const.WORKER_ROLE:
			return new WorkerSalaryCalculator(typeRole, Const.WORKER_SALARY_RATE);
		default:
			return null;
		}
	}
}
