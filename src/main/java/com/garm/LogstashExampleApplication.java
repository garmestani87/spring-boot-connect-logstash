package com.garm;

import com.garm.util.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({AppProperties.class})
public class LogstashExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogstashExampleApplication.class, args);
    }

}
