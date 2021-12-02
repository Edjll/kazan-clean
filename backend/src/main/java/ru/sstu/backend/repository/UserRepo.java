package ru.sstu.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sstu.backend.entity.User;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUserName(String userName);
}
