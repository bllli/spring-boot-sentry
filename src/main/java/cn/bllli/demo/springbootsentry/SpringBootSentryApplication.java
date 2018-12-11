package cn.bllli.demo.springbootsentry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "cn.bllli.demo.springbootsentry.config",
        "cn.bllli.demo.springbootsentry.controllers",
})
public class SpringBootSentryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSentryApplication.class, args);
    }
}
