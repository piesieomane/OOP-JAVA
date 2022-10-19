package com.codeWithPiesie;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public static int numberOfEmployees;

    public Employee (int baseSalary) {
        this(baseSalary, 0);
    }

    public Employee (int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees () {
        System.out.println(numberOfEmployees);
        //static method cant access other methods which are public
        // unless you create an object inside the static method
    }

    public int calculateWage () {
        return calculateWage(0);
    }

    public int calculateWage (int extraHours) {
        return baseSalary + (getHourlyRate() * extraHours);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Please salary should be above 1");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("HourlyRate cannot be lesser than 0");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
