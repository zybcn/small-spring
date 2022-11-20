package cn.zybcn.springframework.beans.factory;

import cn.zybcn.springframework.beans.BeansException;
import cn.zybcn.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.zybcn.springframework.beans.factory.config.BeanDefinition;
import cn.zybcn.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Author 程序员小张
 * @Date 2022-11-20 00:09
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;


    void preInstantiateSingletons() throws BeansException;
}
