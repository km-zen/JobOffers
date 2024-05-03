package com.jobboard.domain.loginandregister.dto;

import lombok.Builder;

@Builder
public record RegisterUserDto(String username, String password) {
}
