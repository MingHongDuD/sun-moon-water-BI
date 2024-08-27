package com.summoonwater.bibacked.aop;

import cn.hutool.core.date.StopWatch;
import com.summoonwater.bibacked.annotation.AuthCheck;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 权限校验
 *
 * @author SummoonWater
 */
@Aspect
@Component
@Slf4j
public class AuthInterceptor {

    /**
     * 执行拦截
     *
     * @param joinPoint joinPoint
     * @param authCheck authCheck
     * @return result
     */
    public Object doInterceptor(ProceedingJoinPoint joinPoint, AuthCheck authCheck) throws Throwable {
        String mustRole = authCheck.mustRole();
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
        // todo 当前登陆用户，登陆成功后返回用户
        // 必须有该权限才通过
        if (StringUtils.isNoneBlank(mustRole)) {

        }
        // 通过权限校验，放行
        return joinPoint.proceed();


    }


}
