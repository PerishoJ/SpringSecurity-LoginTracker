package eg.spring.security.logintracker.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping(value = "/uname")
//    @ResponseBody necessary if a @Controller
    public String currentUserName(Authentication authentication) {
        return authentication.getName();
    }
}
