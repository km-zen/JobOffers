package com.jobboard.domain.loginandregister;

import java.util.Optional;

public interface LoginRepository {

    User save(User user);

    Optional<User> findByUsername(String username);
}
