package com.jobboard.domain.loginandregister;

class UserNotFoundException extends RuntimeException{
    UserNotFoundException(final String message) {
        super(message);
    }
}
