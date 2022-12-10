package cn.zybcn.springframework.aop;

import java.lang.reflect.Method;

/**
 * @Author 程序员小张
 * @Date 2022-12-10 20:27
 */
public interface MethodMatcher {

    /**
     * Perform static checking whether the given method matches. If this
     *
     * @return whether or not this method matches statically
     */
    boolean matches(Method method, Class<?> targetClass);
}
