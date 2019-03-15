package com.application.gojek.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceptionPostAndComment extends RuntimeException {
    public ResourceNotFoundExceptionPostAndComment() {
        super();
    }

    public ResourceNotFoundExceptionPostAndComment(String message) {
        super(message);
    }

    public ResourceNotFoundExceptionPostAndComment(String message, Throwable cause) {
        super(message, cause);
    }
}
