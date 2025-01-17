package com.lightweight.taxiservice.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalRestExceptionHandler {

    @ExceptionHandler(NoDriverFoundException.class)
    public ResponseEntity<ErrorResponse> handleException(NoDriverFoundException exception) {
        ErrorResponse driverErrorResponse = new ErrorResponse();
        driverErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        driverErrorResponse.setMessage(exception.getMessage());
        driverErrorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(driverErrorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoDriversFoundException.class)
    public ResponseEntity<ErrorResponse> handleException(NoDriversFoundException exception) {
        ErrorResponse driversErrorResponse = new ErrorResponse();
        driversErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        driversErrorResponse.setMessage(exception.getMessage());
        driversErrorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(driversErrorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoCarFoundException.class)
    public ResponseEntity<ErrorResponse> handleException(NoCarFoundException exception) {
        ErrorResponse car = new ErrorResponse();
        car.setStatus(HttpStatus.NOT_FOUND.value());
        car.setMessage(exception.getMessage());
        car.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(car, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoCarsFoundException.class)
    public ResponseEntity<ErrorResponse> handleException(NoCarsFoundException exception) {
        ErrorResponse carErrorResponse = new ErrorResponse();
        carErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        carErrorResponse.setMessage(exception.getMessage());
        carErrorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(carErrorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoAvailableCarsException.class)
    public ResponseEntity<ErrorResponse> handleException(NoAvailableCarsException exception) {
        ErrorResponse carsErrorResponse = new ErrorResponse();
        carsErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        carsErrorResponse.setMessage(exception.getMessage());
        carsErrorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(carsErrorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ErrorResponse> handleDataIntegrityViolation(DataIntegrityViolationException exception) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(exception.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoUserFoundException.class)
    public ResponseEntity<ErrorResponse> handleException(NoUserFoundException exception) {
        ErrorResponse userErrorResponse = new ErrorResponse();
        userErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        userErrorResponse.setMessage(exception.getMessage());
        userErrorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(userErrorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoUsersFoundException.class)
    public ResponseEntity<ErrorResponse> handleException(NoUsersFoundException exception) {
        ErrorResponse usersErrorResponse = new ErrorResponse();
        usersErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        usersErrorResponse.setMessage(exception.getMessage());
        usersErrorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(usersErrorResponse, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(NoRoleFoundException.class)
    public ResponseEntity<ErrorResponse> handleException(NoRoleFoundException exception) {
        ErrorResponse roleErrorResponse = new ErrorResponse();
        roleErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        roleErrorResponse.setMessage(exception.getMessage());
        roleErrorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(roleErrorResponse, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(NoRolesFoundException.class)
    public ResponseEntity<ErrorResponse> handleException(NoRolesFoundException exception) {
        ErrorResponse rolesErrorResponse = new ErrorResponse();
        rolesErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        rolesErrorResponse.setMessage(exception.getMessage());
        rolesErrorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(rolesErrorResponse, HttpStatus.NOT_FOUND);
    }
}
