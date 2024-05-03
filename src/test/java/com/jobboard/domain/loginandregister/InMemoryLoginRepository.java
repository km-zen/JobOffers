package com.jobboard.domain.loginandregister;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

class InMemoryLoginRepository implements LoginRepository{

    Map<String,User> db = new HashMap<>();
    @Override
    public User save(final User user) {
        UUID id = UUID.randomUUID();
        User userToSave = new User(
                id.toString(),
                user.username(),
                user.password()
        );
        db.put(userToSave.username(),userToSave);
        return userToSave;
    }

    @Override
    public Optional<User> findByUsername(final String username) {
        return Optional.ofNullable(db.get(username));
    }
}
