package testSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testSpring.model.Users;
import testSpring.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Users addUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Users user) {
        userRepository.delete(user);
    }

    @Override
    public Users editUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users getById(int idUser) {
        Optional<Users> optionalUsers = userRepository.findById(idUser);
        return optionalUsers.orElse(null);
    }

    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }
}
