package usertask.service;


import com.prog.lessons.usertask.users.User;

import java.io.IOException;
import java.util.List;

/**
 * Интерфейс для операций с юзерами
 */
public interface UserService {

    void deleteUsers(User user);

    void create(User user) throws IOException;

    void createEmployee(User user);

    void createManager(User user);

    List<User> findByName(String name);

    List<User> findByPhone(String phone);

    List<User> findByLastName(String lastname);

    List<User> getAllUsers();

    void loadUsersFromFile();
}
