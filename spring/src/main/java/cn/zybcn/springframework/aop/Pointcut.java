package cn.zybcn.springframework.aop;

/**
 * @Author 程序员小张
 * @Date 2022-12-10 20:33
 */
public interface Pointcut {
    /**
     * Return the ClassFilter for this pointcut.
     *
     * @return the ClassFilter (never <code>null</code>)
     */
    ClassFilter getClassFilter();

    /**
     * Return the MethodMatcher for this pointcut.
     *
     * @return the MethodMatcher (never <code>null</code>)
     */
    MethodMatcher getMethodMatcher();


}
