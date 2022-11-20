package cn.zybcn.springframework.beans.factory.config;

import cn.zybcn.springframework.beans.BeansException;

/**
 * @Author 程序员小张
 * @Date 2022-11-24 22:36
 */
public interface BeanPostProcessor {


    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在 Bean 对象执行初始化方法之后，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}
