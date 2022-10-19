package com.codeWithPiesie;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        int wage = employee.calculateWage(20);
        System.out.println(wage);
    }
}