package cn.zybcn.springframework.beans.factory.config;

import cn.zybcn.springframework.beans.BeansException;

/**
 * @Author 程序员小张
 * @Date 2022-12-10 22:58
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor{



    /**
     * Apply this BeanPostProcessor <i>before the target bean gets instantiated</i>.
     * The returned bean object may be a proxy to use instead of the target bean,
     * effectively suppressing default instantiation of the target bean.
     *
     * 在 Bean 对象执行初始化方法之前，执行此方法
     *
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;
}
