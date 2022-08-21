package com.apps.mcy.DataGeneratorService.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(RuntimeException.class)
  public void customHandleExceptionInternal(Exception ex, WebRequest request) {
    StringBuilder message = new StringBuilder();
    message.append("Message:" + ex.getMessage()).append(" Cause:" + ex.getCause());
    System.out.println(message);
  }
}
