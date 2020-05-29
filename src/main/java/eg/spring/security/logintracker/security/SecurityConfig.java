package eg.spring.security.logintracker.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    public void configureAuth(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("Dan")
                .password("{noop}asdf")
                //Problem
                //There is no PasswordEncoder mapped for the id "null"
                //Solution
                //Prior to Spring Security 5.0 the default PasswordEncoder was NoOpPasswordEncoder which required plain text passwords. In Spring Security 5, the default is DelegatingPasswordEncoder, which required Password Storage Format.
                .roles("user")
            .and()
                .withUser("Joe")
                .password("{noop}asdf")
                .roles("user");
    }

}
