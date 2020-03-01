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
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public void delete(Users user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
    }

    @Override
    public void editUser(Users user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public Users getById(int idUser) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Users.class,idUser);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Users> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Users").list();
    }
}
