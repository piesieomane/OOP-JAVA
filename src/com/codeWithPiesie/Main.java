package com.codeWithPiesie;

public class Main {
    public static void main(String[] args) {
        var employee1 = new Employee(50009);
        var employee = new Employee(50000, 20);
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}