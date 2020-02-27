package testSpring.service;

import org.springframework.stereotype.Service;
import testSpring.model.Users;
import testSpring.repository.UserRepository;
import testSpring.repository.UserRepositoryImpl;

import java.util.List;

@Service
public class UsersServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public void save(Users user) {
        userRepository.save(user);
    }

    @Override
    public void delete(Users user) {
        userRepository.delete(user);
    }

    @Override
    public void editUser(Users user) {
        userRepository.editUser(user);
    }

    @Override
    public Users getById(int idUser) {
        return userRepository.getById(idUser);
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
