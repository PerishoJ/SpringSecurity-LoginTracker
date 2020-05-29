package eg.spring.security.logintracker.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    public UserController() {
    }

    @GetMapping("/users")
    public String getLoggedUsers() {
//        model.addAttribute("users", activeUserStore.getUsers());
        return "Users.html";
    }


    @GetMapping(value = "/username")
    @ResponseBody // This is only required if in the @Controller class
                    //Not necessary in @RestController classes
    public String currentUserName(Authentication authentication) {
        return authentication.getName();
    }
}
