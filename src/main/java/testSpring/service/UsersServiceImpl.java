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
    @Transactional
    public void addUser(Users user) {
        userRepository.addUser(user);
    }

    @Override
    @Transactional
    public void delete(Users user) {
        userRepository.delete(user);
    }

    @Override
    @Transactional
    public void editUser(Users user) {
        userRepository.editUser(user);
    }

    @Override
    @Transactional
    public Users getById(int idUser) {
        return userRepository.getById(idUser);
    }

    @Override
    @Transactional
    public List<Users> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
