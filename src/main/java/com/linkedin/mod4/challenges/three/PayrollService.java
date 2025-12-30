package com.linkedin.mod4.challenges.three;

// We have a legacy payroll application with a Payroll class that
// calculates the salaries of employees. The class has grown too large
// and violates the Single Responsibility Principle. We need to
// refactor and split the class up into different responsibilities.
// To refactor the code, we extract the different responsibilities
// into separate classes. We could create EmployeeService,
// PayrollCalculator, TaxCalculator, PayrollSaver, and PayStub.
// We can also add in an interface called PayrollProcessor,
// to represent the process of processing payroll and implement it
// in the PayrollService class.

import com.linkedin.mod4.challenges.Employee;

import java.util.List;

public class PayrollService implements PayrollProcessor {

    private final EmployeeService employeeService;
    private final PayrollCalculator payrollCalculator;
    private final TaxCalculator taxCalculator;
    private final PayrollSaver payrollSaver;
    private final PayStub payStub;

    public PayrollService(EmployeeService employeeService, PayrollCalculator payrollCalculator, TaxCalculator taxCalculator, PayrollSaver payrollSaver, PayStub payStub) {
        this.employeeService = employeeService;
        this.payrollCalculator = payrollCalculator;
        this.taxCalculator = taxCalculator;
        this.payrollSaver = payrollSaver;
        this.payStub = payStub;
    }


    private List<Employee> employees;

    public void calculateSalaries() {
        // load employee data
        String employeeDetails = employeeService.getEmployeeDetails(1);
        // calculate gross pay for each employee
        Integer grossPay = payrollCalculator.calculatePayStub(new Employee());
        // calculate taxes for each employee
        Integer taxes = taxCalculator.calculateTaxes(grossPay);
        // calculate net pay for each employee
        Integer netPay = grossPay - taxes;
        // generate pay stubs for each employee
        payStub.generatePayStub(employeeDetails);
        // save payroll data
        payrollSaver.savePayStub(payStub);
    }

    // other methods for managing employee data
}

