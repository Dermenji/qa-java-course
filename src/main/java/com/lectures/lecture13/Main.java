package com.lectures.lecture13;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {


        Employee[] employees = new Employee[3];

        QualityEngineer qa = new QualityEngineer("Kiril", 15, true);
        BusinessAnalyst ba = new BusinessAnalyst("Elena", 75);
        LeadDeveloper dev = new LeadDeveloper("Galina", 34);


        employees[0] = qa;
        employees[1] = ba;
        employees[2] = dev;

        int total = 0;
        for (Employee employee: employees) {

        }


                // Overridden toString() method from Employee class
        log.info(qa.toString());
        log.info(ba.toString());


       // qa.calculateSalary(20, 100);
        qa.calculateEmployeeMonthlySalaryWithBonus(20, 100);
        qa.calculateEmployeeMonthlySalaryWithBonus(20, 100, 2000);

        dev.leadProject();
        dev.managePeople();
    }
}
