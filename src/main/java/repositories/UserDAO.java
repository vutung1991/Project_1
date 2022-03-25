package repositories;

import models.User;

public interface UserDAO { //contract
    User getUserGivenUsername(String username);
//    void createUser(User ers_users);
//    void createUser(User user);

}
