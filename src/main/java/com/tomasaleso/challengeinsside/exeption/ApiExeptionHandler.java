package com.tomasaleso.challengeinsside.exeption;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExeptionHandler {

    @ExceptionHandler(value = { ApiRequestException.class })
    public ResponseEntity<Object> handleApiRequestExeption(ApiRequestException e) {

        ApiException apiException = new ApiException(e.getMessage(), HttpStatus.BAD_REQUEST,
                ZonedDateTime.now(ZoneId.of("Z")));

        return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
    }
}
