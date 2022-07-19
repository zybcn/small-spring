package cn.zybcn.springframework.beans.factory.support;

import cn.zybcn.springframework.beans.BeansException;
import cn.zybcn.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author ZhangYiBo
 * @Date 2022-07-18 00:01
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {


    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {

        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
