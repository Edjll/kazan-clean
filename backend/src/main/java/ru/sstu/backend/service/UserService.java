package ru.sstu.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sstu.backend.entity.User;
import ru.sstu.backend.repository.UserRepo;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;


    public User findUserById(Integer id) {
        return userRepo.findById(id).orElse(null);
    }



    public Iterable<User> findAllUser() {
        return userRepo.findAll();
    }

    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public void deleteUserById(Integer userId) {
        userRepo.deleteById(userId);
    }


    public User findByUserName(String userName) {
        return userRepo.findByUserName(userName);
    }
}
