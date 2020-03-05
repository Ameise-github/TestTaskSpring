package testSpring.controller;
/*
* @RequestBody - Объект Covert Json для java
* @ResponseBody - преобразовать объект Java в json
* */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testSpring.model.Users;
import testSpring.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/")
public class UsersController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String startPages(){
        return "index";
    }

    @GetMapping(value = "/usersList")
    public List<Users> allUsers(){
        return userService.getAllUsers();
    }

    //region Edit User
    @GetMapping(value = "/editUser/{idUser}")
    public Users editPageUser(@PathVariable("idUser") int idUser) {
        return userService.getById(idUser);
    }

    @PutMapping(value = "/editUser")
    public Users editUser(@RequestBody Users editUser){
        userService.editUser(editUser);
        return userService.getById(editUser.getIdUser());
    }
    //endregion

    //region Add user
    @GetMapping(value = "/addUser")
    public String addUserPage() {
        return "userEdit";
    }
    @PostMapping(value = "/addUser")
    public Users addUser(@RequestBody Users newUser) {
        userService.addUser(newUser);
        return userService.getById(newUser.getIdUser());
    }
    //endregion

    //region Delete user
    @DeleteMapping(value = "/deleteUser/{idUser}")
    public String deletUser(@PathVariable("idUser") int idUser){
        String status;
        Users findUser = userService.getById(idUser);
        try{
            userService.delete(findUser);
            status = "OK!";
        }catch (Exception e){
            status = "Error: " + e.getMessage();
        }
        return status;
    }
    //endregion
}
