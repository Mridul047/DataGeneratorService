package com.mcy.handler;

import com.mcy.model.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity<Error> customHandleExceptionInternal(Exception ex, WebRequest request) {

    Error error = new Error();

    error.setErrorCode(INTERNAL_SERVER_ERROR.value());
    error.setSuggestedStatus(INTERNAL_SERVER_ERROR.getReasonPhrase());
    error.setMessage(ex.getMessage() + " " + ex.getCause());

    return ResponseEntity.status(INTERNAL_SERVER_ERROR).body(error);
  }
}
