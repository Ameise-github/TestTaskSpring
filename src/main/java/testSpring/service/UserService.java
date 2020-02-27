package testSpring.service;

import testSpring.model.Users;

import java.util.List;

public interface UserService {
    Users addUser(Users user);
    void delete(Users user);
    Users editUser(Users user);
    Users getById(int idUser);
    List<Users> getAllUsers();
}
