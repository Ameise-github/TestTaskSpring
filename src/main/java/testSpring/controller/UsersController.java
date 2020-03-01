package testSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testSpring.model.Users;
import org.springframework.web.servlet.ModelAndView;
import testSpring.service.UserService;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UserService userService;


    @GetMapping(value = "/")
    public ModelAndView allUsers(){
        List<Users> usersList = userService.getAllUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("usersList");
        modelAndView.addObject("usersList", usersList);
        return modelAndView;
    }

    //region Edit User
    @RequestMapping(value = "/editUser/{idUser}", method = RequestMethod.GET)
    public ModelAndView editPageUser(@PathVariable("idUser") int idUser) {
        Users findUser = userService.getById(idUser);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userEdit");
        modelAndView.addObject("user", findUser);
        return modelAndView;
    }

    @RequestMapping(value = "/editUser",method = RequestMethod.POST)
    public ModelAndView editUser(@ModelAttribute("user") Users editUser){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/"); //перенаправление на главную страницу
        userService.editUser(editUser);
        return modelAndView;
    }
    //endregion

    //region Add user
    @GetMapping(value = "/addUser")
    public ModelAndView addUserPage() {
//        return "userEdit";
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userEdit");
        return modelAndView;
    }
    @PostMapping(value = "/addUser")
    public ModelAndView addUser(@ModelAttribute("user") Users newUser) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        userService.addUser(newUser);
        return modelAndView;
    }
    //endregion

    //region Delete user
    @GetMapping(value = "/deleteUser/{idUser}")
    public ModelAndView deletUser(@PathVariable("idUser") int idUser){
        ModelAndView modelAndView = new ModelAndView();
        Users findUser = userService.getById(idUser);
        userService.delete(findUser);
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }
    //endregion
}
