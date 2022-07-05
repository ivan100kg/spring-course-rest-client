package io.github.ivan100kg.rest;


import io.github.ivan100kg.rest.configuration.MyConfig;
import io.github.ivan100kg.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        // get all Employee
        List<Employee> allEmployees = communication.getAllEmployees();
        allEmployees.forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------");

        // get 1 Employee
        Employee employee = communication.getEmployee(1);
        System.out.println(employee);

        System.out.println("-------------------------------------------------------------------");

        // save Employee
        Employee sveta = new Employee("Sveta", "Petrova", "Sales", 550);
        sveta.setId(14);
        communication.saveEmployee(sveta);

        System.out.println("-------------------------------------------------------------------");

        // delete Employee
        communication.deleteEmployee(14);

    }
}
