package web.dao;


import org.springframework.stereotype.Repository;
import web.entity.User;

import javax.persistence.*;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void saveUser(User user) {
        entityManager.persist(user);
    }


    public User updateUser(User user) {
        return entityManager.merge(user);
    }

    public User findById(int id) {
        return entityManager.find(User.class, id);
    }


    public void deleteById(int id) {
        entityManager.remove(findById(id));
    }

    @SuppressWarnings("unchecked")
    public List<User> findAll() {
        TypedQuery<User> query = entityManager.createQuery("select a from User a", User.class);
        return query.getResultList();
    }
}
