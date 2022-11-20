package cn.zybcn.springframework.beans.factory.config;

import cn.zybcn.springframework.beans.BeansException;
import cn.zybcn.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @Author 程序员小张
 * @Date 2022-11-24 22:24
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
