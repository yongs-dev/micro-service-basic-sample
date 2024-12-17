package com.spring.mark.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserDaoService {

    private static int userCount = 0;
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(++userCount, "Ethan", LocalDate.now().minusYears(30)));
        users.add(new User(++userCount, "Eve", LocalDate.now().minusYears(35)));
        users.add(new User(++userCount, "Adam", LocalDate.now().minusYears(40)));
    }

    public List<User> findALl() {
        return users;
    }

    public Optional<User> findOne(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst();
    }

    public User save(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }

    public void deleteById(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}
