package com.mcy.model;

public class Error {
  private int errorCode;
  private String suggestedStatus;
  private String message;

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }

  public void setSuggestedStatus(String suggestedStatus) {
    this.suggestedStatus = suggestedStatus;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public int getErrorCode() {
    return errorCode;
  }

  public String getSuggestedStatus() {
    return suggestedStatus;
  }

  public String getMessage() {
    return message;
  }
}
