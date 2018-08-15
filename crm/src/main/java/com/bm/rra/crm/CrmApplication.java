package com.bm.rra.crm;

import com.bm.rra.crm.entity.Manager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bm.rra.crm"})
@EntityScan(basePackages = {"com.bm.rra.crm.entity"})
@EnableJpaRepositories("com.bm.rra.crm.repository")
public class CrmApplication {
    public static List<Manager> showUsers(List<Manager> managerList) {
        List<Manager> newmanagers = managerList.stream().filter(p -> p.getFirstName().contains("a")).collect(Collectors.toList());
        return newmanagers;
    }

    public static void shownameUsers(List<Manager> managerList) {
        managerList.stream().map(Manager::getFirstName).forEach(System.out::println);
    }
    public static Map<String, List<Manager>> groupingUsers(List<Manager> managerList) {
        Map<String, List<Manager>> map = managerList.stream().collect(Collectors.groupingBy(Manager::getFirstName));
        return map;
    }


    public static void main(String[] args) {
//        SpringApplication.run(CrmApplication.class, args);
        List<Manager> managerList = Arrays.asList(
                new Manager("Ivan", "Smirvov"),
                new Manager("Petr", "Abramson"),
                new Manager("Valentin", "Clapton"),
                new Manager("Valeriy", "Ellington"),
                new Manager("Yegor", "Hamphrey"),
                new Manager("Lev", "Elmers"),
                new Manager("Ivan", "Ford"),
                new Manager("Valentin", "Jacobson"),
                new Manager("Semyon", "Lamberts"),
                new Manager("Ivan", "Macduff"),
                new Manager("Eduard", "Murphy"),
                new Manager("Valentin", "Paterson"),
                new Manager("Yuri", "Reynolds"),
                new Manager("Valentin", "Adamson"));
//        System.out.println(showUsers(managerList).toString());
//        shownameUsers(managerList);
        System.out.println(groupingUsers(managerList).toString());

    }
}

