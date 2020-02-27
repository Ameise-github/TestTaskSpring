package testSpring.repository;

import testSpring.model.Users;

import java.util.List;

public interface UserRepository {
    void save(Users user);
    void delete(Users user);
    void editUser(Users user);
    Users getById(int idUser);
    List<Users> getAllUsers();
}
