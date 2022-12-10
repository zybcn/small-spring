package cn.zybcn.springframework.aop;


import org.aopalliance.intercept.MethodInterceptor;

/**
 * @Author 程序员小张
 * @Date 2022-12-10 21:06
 */
public class AdvisedSupport {


    /**
     * 被代理的目标对象
     */
    private TargetSource targetSource;


    /**
     * 方法拦截器
     */
    private MethodInterceptor methodInterceptor;


    /**
     * 方法匹配器
     */
    private MethodMatcher methodMatcher;


    public TargetSource getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(TargetSource targetSource) {
        this.targetSource = targetSource;
    }

    public MethodInterceptor getMethodInterceptor() {
        return methodInterceptor;
    }

    public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }

    public MethodMatcher getMethodMatcher() {
        return methodMatcher;
    }

    public void setMethodMatcher(MethodMatcher methodMatcher) {
        this.methodMatcher = methodMatcher;
    }
}
