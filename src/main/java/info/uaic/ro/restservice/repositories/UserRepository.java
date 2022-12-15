package info.uaic.ro.restservice.repositories;

import info.uaic.ro.restservice.entities.User;

public class UserRepository extends DataRepository<User> {
    public UserRepository() {
        super(User.class);
    }
}
