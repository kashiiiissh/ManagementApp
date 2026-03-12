package in.sp.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.model.User;
import in.sp.main.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User register(User user) {
        return repo.save(user);
    }

    public String login(User user) {

        User u = repo.findByUsername(user.getUsername());

        if(u != null && u.getPassword().equals(user.getPassword())) {
            return "Login Successful";
        }

        return "Invalid Credentials";
    }
}