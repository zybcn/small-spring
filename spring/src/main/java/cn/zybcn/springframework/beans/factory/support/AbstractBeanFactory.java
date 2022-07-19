package cn.zybcn.springframework.beans.factory.support;

import cn.zybcn.springframework.beans.BeansException;
import cn.zybcn.springframework.beans.factory.BeanFactory;
import cn.zybcn.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author ZhangYiBo
 * @Date 2022-07-17 23:55
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {


    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }


    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
