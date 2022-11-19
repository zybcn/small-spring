package cn.zybcn.springframework.beans.factory.support;

import cn.zybcn.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author ZhangYiBo
 * @Date 2022-07-19 21:54
 */
public interface BeanDefinitionRegistry {


    /**
     * 向注册表中注册BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);


    /**
     * 判断是否包含指定名称的BeanDefinition
     *
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);
}
