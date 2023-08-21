package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {
    List<User> findAll();

    User findById(Long id);

    User saveUser(User user);

    void deleteById(Long id);

}
