package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        final String file = "C:/Users/LA-PM/Downloads/CleanCode-main/homework/payroll/employee.csv";
        final String COMMA_DELIMITER = ",";
        List<Employee> employees = new ArrayList();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                String name = values[0];
                String birthday = values[1];
                String role = values[2];
                String startDate = values[3];
                String startSalary = values[4];
                Employee employee = new Employee(name, birthday, role, startDate, startSalary);
                if (employee.validateEmployee(employee)) {
                    employees.add(employee);
                };
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Employee employee : employees) {
            employee.printInfor();
        }
    }
}
