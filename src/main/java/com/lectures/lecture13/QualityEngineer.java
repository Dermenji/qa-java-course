package com.lectures.lecture13;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QualityEngineer extends Employee {

    private static final String EMPLOYEE_POSITION_NAME = "Quality Assurance Engineer";
    private static final String EMPLOYEE_DEPARTMENT_NAME = "Quality Assurance";

    @Getter
    private boolean isTestAutomationExpert;

    public QualityEngineer(String name, int employeeId) {
        super(name, employeeId, EMPLOYEE_DEPARTMENT_NAME, EMPLOYEE_POSITION_NAME);
    }

    public QualityEngineer(String name, int employeeId, boolean isTestAutomationExpert) {
        super(name, employeeId, EMPLOYEE_DEPARTMENT_NAME, EMPLOYEE_POSITION_NAME);
        this.isTestAutomationExpert = isTestAutomationExpert;
    }

    @Override
    protected void calculateEmployeeMonthlySalaryWithBonus(int workedDays, int dailyGrossRate) {
        int calculatedSalary = super.calculateSalary(workedDays, dailyGrossRate) + 1000;
        log.info("The QA {} has salary with fixed bonus: {}", super.getName(), calculatedSalary);
    }

    protected void calculateEmployeeMonthlySalaryWithBonus(int workedDays, int dailyGrossRate, int bonus) {
        int calculatedSalary = super.calculateSalary(workedDays, dailyGrossRate) + bonus;
        log.info("The QA {} has salary with individual bonus: {}", super.getName(), calculatedSalary);

    }
}
