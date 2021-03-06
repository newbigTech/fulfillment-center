package com.mallcai.fulfillment.biz.interceptor.handle;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * HandleRequest
 * @author admin
 * @date 2019-08-13 23:46:22
 */
public class HandleRequest {

  private ProceedingJoinPoint proceedingJoinPoint;
  private Exception exception;
  private Long startTime;
  private Object result;

  /**
   * 原始请求参数(json格式)
   */
  private String originalRequestParam;

  public HandleRequest() {
  }

  public ProceedingJoinPoint getProceedingJoinPoint() {
    return this.proceedingJoinPoint;
  }

  public void setProceedingJoinPoint(ProceedingJoinPoint proceedingJoinPoint) {
    this.proceedingJoinPoint = proceedingJoinPoint;
  }

  public Exception getException() {
    return this.exception;
  }

  public void setException(Exception exception) {
    this.exception = exception;
  }

  public Long getStartTime() {
    return this.startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public Object getResult() {
    return this.result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public String getOriginalRequestParam() {
    return originalRequestParam;
  }

  public void setOriginalRequestParam(String originalRequestParam) {
    this.originalRequestParam = originalRequestParam;
  }
}

