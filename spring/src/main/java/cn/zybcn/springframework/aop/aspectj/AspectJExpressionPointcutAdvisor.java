package cn.zybcn.springframework.aop.aspectj;

import cn.zybcn.springframework.aop.Pointcut;
import cn.zybcn.springframework.aop.PointcutAdvisor;
import org.aopalliance.aop.Advice;

/**
 * @Author 程序员小张
 * @Date 2022-12-10 22:50
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    /**
     * 切面
     */
    private AspectJExpressionPointcut pointcut;
    /**
     * 具体的拦截方法
     */
    private Advice advice;
    /**
     * 表达式
     */
    private String expression;

    public void setExpression(String expression) {
        this.expression = expression;
    }


    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public Pointcut getPointcut() {
        if (null == pointcut) {
            pointcut = new AspectJExpressionPointcut(expression);
        }
        return pointcut;
    }


    public void setAdvice(Advice advice) {
        this.advice = advice;
    }
}
