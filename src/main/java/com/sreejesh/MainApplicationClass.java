package com.sreejesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Comment added to test deploy phase
/*
mvn release:prepare
mvn release:perform

mvn versions:display-dependency-updates
mvn versions:display-plugin-updates
mvn versions:dependency-updates-report
mvn versions:plugin-updates-report
 */
@SpringBootApplication
public class MainApplicationClass {

    public static void main(String[] args) {
        SpringApplication.run(MainApplicationClass.class, args);
    }

}
