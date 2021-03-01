package com.lectures.lecture13;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BusinessAnalyst extends Employee {

    private static final String EMPLOYEE_POSITION_NAME = "Business Analyst";
    private static final String EMPLOYEE_DEPARTMENT_NAME = "Business Analysis & Coordination";

    public BusinessAnalyst(String name, int employeeId) {
        super(name, employeeId, EMPLOYEE_DEPARTMENT_NAME, EMPLOYEE_POSITION_NAME);
    }

    @Override
    protected void calculateEmployeeMonthlySalaryWithBonus(int workedDays, int dailyGrossRate) {
        int calculatedSalary = super.calculateSalary(workedDays, dailyGrossRate) + 500;
        log.info("The BA {} has salary with bonus: {}", super.getName(), calculatedSalary);
    }
}
