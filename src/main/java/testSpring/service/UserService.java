package testSpring.service;

import testSpring.model.Users;

import java.util.List;

public interface UserService {
    void save(Users user);
    void delete(Users user);
    void editUser(Users user);
    Users getById(int idUser);
    List<Users> getAllUsers();
}
