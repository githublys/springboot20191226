package com.ly.learn.aop;

import com.baomidou.mybatisplus.core.toolkit.ArrayUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName LogAspect
 * @Description 日志切面
 * @Author v_braveliu
 * @Date 2020/1/8
 * @Version 1.0
 */
@Slf4j
@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.ly.learn.controller..*.*(..))")
    public void logController() {
    }

    /**
     * @description 在连接点执行之前执行的通知
     */
    @Before("logController()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("【操作日志】【请求方法】:{}", joinPoint.getSignature());
        log.info("【操作日志】【输入参数】:{}", filterArgs(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "obj", pointcut = "logController()")
    public void expenseWebReturning(JoinPoint joinPoint, Object obj) {
        log.info(obj.toString());
    }


    /**
     * 序列化前过滤掉request和response，避免序列化异常
     *
     * @param args
     * @return
     */
    public List<Object> filterArgs(Object[] args) {
        Stream<?> stream = ArrayUtils.isEmpty(args) ? Stream.empty() : Arrays.asList(args).stream();
        List<Object> logArgs = stream
                .filter(arg -> (!(arg instanceof HttpServletRequest) && !(arg instanceof HttpServletResponse)))
                .collect(Collectors.toList());
        return logArgs;
    }
}
