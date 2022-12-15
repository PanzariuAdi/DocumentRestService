package info.uaic.ro.restservice.repositories;

import info.uaic.ro.restservice.entities.UserRole;

public class UserRoleRepository extends DataRepository<UserRole> {
    public UserRoleRepository() {
        super(UserRole.class);
    }
}
