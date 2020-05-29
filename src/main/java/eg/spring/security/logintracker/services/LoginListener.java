package eg.spring.security.logintracker.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.InteractiveAuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
@Slf4j
@Component
public class LoginListener implements ApplicationListener<InteractiveAuthenticationSuccessEvent> {

    public LoginListener() {

      log.info("created LoginListener");

    }

    @Override
    public void onApplicationEvent(InteractiveAuthenticationSuccessEvent event)
    {
        UserDetails user = (UserDetails) event.getAuthentication().getPrincipal();
        System.out.println("LOGIN name: "+user.getUsername() );
        Authentication auth;
    }
}
