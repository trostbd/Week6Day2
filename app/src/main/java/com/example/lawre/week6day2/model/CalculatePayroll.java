package com.example.lawre.week6day2.model;

import java.util.HashMap;

public class CalculatePayroll
{
    private Employee employee;
    private HashMap<String, String> employeePay;
    private String employeeName;
    private String employeeAddress;

    public CalculatePayroll() {
    }

    public CalculatePayroll(Employee employee) {
        this.employee = employee;
        getEmployeeInfo();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    private void getEmployeeInfo()
    {
        employeeName = employee.getName().getFirst() + " " + employee.getName().getLast();
        employeeAddress = employee.getAddress().getCity() + ", " + employee.getAddress().getState()
                + " " + employee.getAddress().getPostCode();
    }

    public HashMap<String, String> calculatePay()
    {
        employeePay = new HashMap<String, String>();
        String pay;
        if(employee.getTimesheet().isHourly())
        {
            pay = String.valueOf(employee.getTimesheet().getPayRate() * employee.getTimesheet().getWorkedHours());
        }
        else
        {
            pay = String.valueOf(employee.getTimesheet().getPayRate()*40);
        }
        employeePay.put("Name",employeeName);
        employeePay.put("Address",employeeAddress);
        employeePay.put("Pay",pay);
        return employeePay;
    }
}
