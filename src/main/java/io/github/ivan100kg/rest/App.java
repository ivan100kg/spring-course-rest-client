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
        List<Employee> allEmployees = communication.getAllEmployees();
        allEmployees.forEach(System.out::println);
    }
}
