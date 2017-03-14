package com.pedroaugust8.common.interfaces;

import java.util.List;
import com.pedroaugust8.common.models.User;
/**
 * @author Pedro Barros
 */
public interface UserRepository {
    List<User> list();

    User get(String id);

    void save(User user);

    void delete(String id);
}
