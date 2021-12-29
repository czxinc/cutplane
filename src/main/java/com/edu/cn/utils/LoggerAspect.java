package com.edu.cn.utils;

import com.edu.cn.beans.Logger;
import com.edu.cn.service.LoggerService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

@Aspect
@Component
public class LoggerAspect {


    @Autowired
    private LoggerService loggerService;

    /**
     * @Description 获取注解中对方法的描述信息 用于Controller层注解
     */
    public static String getControllerMethodDescription(JoinPoint joinPoint) throws ClassNotFoundException {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();// 目标方法名
        Object[] arguments = joinPoint.getArgs();
        Class targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        String description = "";
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class[] clazzs = method.getParameterTypes();
                if (clazzs.length == arguments.length) {
                    description = method.getAnnotation(LogFilter.class).description();
                    break;
                }
            }
        }
        return description;
    }

    // 定义切点 @Pointcut。是面前注解类的地址。
    @Pointcut("@annotation(com.edu.cn.utils.LogFilter)")
    public void controllerAspect() {
    }

    /**
     * @Description 前置通知 @Before ，就是在有 LoggerOperator注解的接口执行前执行这个 doBefore()方法。
     * 后置通知 @After ，就是在有 LoggerOperator注解的接口执行之后执行这个 doAfter()方法。
     */
    @After("controllerAspect()")
    public void doAfter(JoinPoint joinPoint) {
        try {
            // 获取请求参数 request
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                    .getRequest();

            String ip = IpUtil.getIpAdrress(request);
            String method = joinPoint.getTarget().getClass().getName() + ":" + joinPoint.getSignature().getName();
            // 这个根据 request 获取封装获取
            String role = "角色";
            String employeeId = "huangjinghengID";
            String desc = getControllerMethodDescription(joinPoint);
            Logger logger = new Logger();
            logger.setIp(ip);
            logger.setOperator(employeeId);
            logger.setRemark(method);
            logger.setRole(role);
            logger.setCreateTime(new Date());
            logger.setDescription(desc);
            loggerService.saveLogger(logger);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}