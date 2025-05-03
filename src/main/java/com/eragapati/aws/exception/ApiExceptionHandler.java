package com.eragapati.aws.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = RecordNotFound.class)
    public ResponseEntity handleRecordNotFoundException(RecordNotFound ex) {
        return ResponseEntity.notFound().build();
    }
}
