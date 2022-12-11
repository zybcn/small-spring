package cn.zybcn.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * @Author 程序员小张
 * @Date 2022-12-10 22:32
 */
public interface Advisor {

    /**
     * Return the advice part of this aspect. An advice may be an
     * interceptor, a before advice, a throws advice, etc.
     *
     * @return the advice that should apply if the pointcut matches
     * @see org.aopalliance.intercept.MethodInterceptor
     * @see BeforeAdvice
     */
    Advice getAdvice();

}
