package eg.spring.security.logintracker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@Slf4j
@SpringBootApplication
@ComponentScan({"eg.spring.security.logintracker.controller","eg.spring.security.logintracker.services","eg.spring.security.logintracker.security"})
public class LoginTrackerApplication {

    public static void main(String[] args) {
        log.info("Startin' up, cowboy");
        SpringApplication.run(LoginTrackerApplication.class, args);
        log.info("take it easy" +
                ", cowboy");

    }

}
