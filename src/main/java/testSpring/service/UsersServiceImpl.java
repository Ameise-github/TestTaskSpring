package testSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import testSpring.model.Users;
import testSpring.repository.UserRepository;

import java.util.List;


@Service
public class UsersServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(Users user) {

    }

    @Override
    public void delete(Users user) {
        userRepository.delete(user);
    }

    @Override
    public void editUser(Users user) {

    }

    @Override
    public Users getById(int idUser) {
        return null;
    }

    @Override
    @Transactional
    public List<Users> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
