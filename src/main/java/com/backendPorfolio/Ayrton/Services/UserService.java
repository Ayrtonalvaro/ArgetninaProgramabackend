package com.backendPorfolio.Ayrton.Services;

import com.backendPorfolio.Ayrton.Entity.User;
import com.backendPorfolio.Ayrton.Exception.UserNotFoundException;
import com.backendPorfolio.Ayrton.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser (User user) {
        return userRepository.save(user);
    }

    public List<User> findUsers() {
        return userRepository.findAll();
    }

    public User editUser (User editUser, Long id) {
        userRepository.findById(id).map(
                user -> {
                    user.setName(editUser.getName());
                    user.setSurname(editUser.getSurname());
                    user.setDescription(editUser.getDescription());
                    user.setTitle(editUser.getTitle());
                    return userRepository.save(editUser);
                }
        );
        return editUser;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public User findUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new  UserNotFoundException("User not found"));
    }
}
