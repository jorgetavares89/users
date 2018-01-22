package com.jorge.tokenvalidation.exception.handler;

import com.jorge.tokenvalidation.exception.BadRequestException;
import com.jorge.tokenvalidation.exception.CustomExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class BadRequestExceptionHandler extends CustomExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(BadRequestExceptionHandler.class);

    @ExceptionHandler(value = {BadRequestException.class})
    protected ResponseEntity<Object> handleBadRequest(BadRequestException ex, WebRequest request) {
        LOG.debug("BadRequestExceptionHandler.handleBadRequest: handling exception");
        return handleExceptionInternal(ex,
                getErrorResponse(ex, HttpStatus.BAD_REQUEST),
                new HttpHeaders(),
                HttpStatus.BAD_REQUEST,
                request);
    }
}
