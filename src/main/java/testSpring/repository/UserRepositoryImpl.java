package testSpring.repository;

import org.springframework.stereotype.Repository;
import testSpring.model.Users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Users> usersMap = new HashMap<>();

    static {
        Users user1 = new Users(AUTO_ID.getAndIncrement(),"Inception","inc", "pector", true);
        Users user2 = new Users(AUTO_ID.getAndIncrement(),"aaa","vvv", "ccc", false);
        usersMap.put(user1.getIdUser(), user1);
        usersMap.put(user2.getIdUser(), user2);
    }

    @Override
    public void save(Users user) {
        user.setIdUser(AUTO_ID.getAndIncrement());
        usersMap.put(user.getIdUser(), user);
    }

    @Override
    public void delete(Users user) {
        usersMap.remove(user.getIdUser());
    }

    @Override
    public void editUser(Users user) {
        usersMap.put(user.getIdUser(), user);
    }

    @Override
    public Users getById(int idUser) {
        return usersMap.get(idUser);
    }

    @Override
    public List<Users> getAllUsers() {
        return new ArrayList<>(usersMap.values());
    }
}
