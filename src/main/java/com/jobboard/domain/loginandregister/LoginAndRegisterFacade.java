package com.jobboard.domain.loginandregister;

import com.jobboard.domain.loginandregister.dto.RegisterUserDto;
import com.jobboard.domain.loginandregister.dto.RegistrationResultDto;
import com.jobboard.domain.loginandregister.dto.UserDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class LoginAndRegisterFacade {
    private static final String USER_NOT_FOUND = "User not found";

    private final LoginRepository repository;

    public UserDto findByUsername(String username){
        return repository.findByUsername(username)
                .map(user -> new UserDto(user.id(), user.password(), user.username()))
                .orElseThrow(() -> new UserNotFoundException(USER_NOT_FOUND));
    }

    public RegistrationResultDto register(RegisterUserDto registerUserDto){
        User user = User.builder()
                .username(registerUserDto.username())
                .password(registerUserDto.password())
                .build();
        User savedUser = repository.save(user);
        return RegistrationResultDto.builder()
                .id(savedUser.id())
                .username(savedUser.username())
                .created(true)
                .build();
    }


}
