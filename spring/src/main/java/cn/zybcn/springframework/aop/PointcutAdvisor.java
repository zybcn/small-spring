package cn.zybcn.springframework.aop;

/**
 * @Author 程序员小张
 * @Date 2022-12-10 22:49
 */
public interface PointcutAdvisor extends Advisor {


    /**
     * Get the Pointcut that drives this advisor.
     */
    Pointcut getPointcut();
}
