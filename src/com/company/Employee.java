package com.company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private String name;
    private String birthday;
    private String role;
    private String startDate;
    private String startSal;

    public Employee(String name, String birthday, String role, String startDate, String startSal) {
        this.name = name;
        this.birthday = birthday;
        this.role = role;
        this.startDate = startDate;
        this.startSal = startSal;
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

    public void printInfor() {
        System.out.println("Ten nhan vien: " + this.name);
        System.out.println("Tuoi nhan vien: " + this.getAge(this.birthday));
        System.out.println("So nam va thang lam viec: " + this.getWorkDate(this.startDate));
        System.out.println("----------------------------------");
    }

    public int getAge(String birthday) {
        try {
            SimpleDateFormat formatDate = new SimpleDateFormat("yyyyMMdd");
            Date current = new Date();
            Date newDate = formatDate.parse(birthday);
            return current.getYear() - newDate.getYear();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String getWorkDate(String startDate) {
        return "2 nam";
    }

    public int getEmployeeSalary(String birthday) {
        return 0;
    }

    boolean validateEmployee(Employee employee) {
        try {
            String birthday = employee.getBirthday();
            Double.parseDouble(birthday);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
