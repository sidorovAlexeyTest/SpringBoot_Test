package main.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan(basePackages = "org.sidorov")
public class MyConfig {

    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext();
}
