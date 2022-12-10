package cn.zybcn.springframework.aop;

/**
 * @Author 程序员小张
 * @Date 2022-12-10 20:26
 */
public interface ClassFilter {


    /**
     * Should the pointcut apply to the given interface or target class?
     *
     * @param clazz the candidate target class
     * @return whether the advice should apply to the given target class
     */
    boolean matches(Class<?> clazz);
}
