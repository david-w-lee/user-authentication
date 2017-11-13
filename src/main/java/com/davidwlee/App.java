package com.davidwlee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

// You need this for JPA to support java.time.*. e.g) LocalDateTime
@EntityScan(
        basePackageClasses = {App.class, Jsr310JpaConverters.class}
)
// A convenience annotation that wraps commonly used annotations with Spring Boot
@SpringBootApplication
public class App 
{
	// Starts Java and then the application
    public static void main( String[] args )
    {
    	// Starts Spring, creates spring context, applies annotations
    	// and sets up container
        SpringApplication.run(App.class, args);
    }
}
