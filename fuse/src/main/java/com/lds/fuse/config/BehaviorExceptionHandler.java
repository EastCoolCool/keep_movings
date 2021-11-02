package com.lds.fuse.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理工具handler
 *
 * @author EastCool·Lee
 */
@Slf4j
@ControllerAdvice
public class BehaviorExceptionHandler {
    @ResponseBody
    @ExceptionHandler(Throwable.class)
    public String handlerException(HttpServletRequest request, HandlerMethod method, Throwable ex) {
        if (ex instanceof RuntimeException) {
            System.out.println("自定义异常"+ex);
            return "进入到全局异常";
        }else {
            return "其他异常";
        }

    }
}
