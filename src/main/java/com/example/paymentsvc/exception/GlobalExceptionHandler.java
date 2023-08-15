package com.example.paymentsvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public Object handleNoSuchElement(NotFoundException notFoundException) {
        ErrorResponse responseMessage = new ErrorResponse();
        responseMessage.setMessage(notFoundException.getMessage());
        return responseMessage;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public Object handleInternalError(Exception e) {
        ErrorResponse responseMessage = new ErrorResponse();
        responseMessage.setMessage(e.getMessage());
        return responseMessage;
    }


}
