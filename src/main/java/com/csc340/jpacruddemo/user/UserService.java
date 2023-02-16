package com.csc340.jpacruddemo.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sentini
 */
@Service
public class UserService {

    @Autowired
    UserRepository repo;

    List<User> getAllUsers() {
        return repo.findAll();
    }

    Object getUser(long id) {
        return repo.getUserById(id);
    }

    void deleteUser(long id) {
        repo.deleteUserById(id);
    }

    void saveUser(User user) {
        repo.saveUser(user);
    }

    void updateUser(User user) {
        repo.updateUser(user);
    }

}
