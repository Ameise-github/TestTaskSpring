package testSpring.controller;

import testSpring.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {
    private Users user1 = new Users(1,"user1","aaaa","bbbb",true);

    @GetMapping(value = "/")
    public ModelAndView allUsers(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("usersList");
        modelAndView.addObject("user", user1);
        return modelAndView;
    }

    @GetMapping(value = "/editUser")
    public ModelAndView editUser(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userEdit");
        return modelAndView;
    }

}
