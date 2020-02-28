package testSpring.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import testSpring.model.Users;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{
    private SessionFactory sessionFactory;
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUser(Users user) {

    }

    @Override
    public void delete(Users user) {

    }

    @Override
    public void editUser(Users user) {

    }

    @Override
    public Users getById(int idUser) {
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Users> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Users").list();
    }
}
