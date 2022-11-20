package cn.zybcn.springframework.beans.factory.config;

import cn.zybcn.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @Author 程序员小张
 * @Date 2022-11-20 00:21
 * @Desc
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory,SingletonBeanRegistry {

    String SCOPE_SINGLETON="singleton";

    String SCOPE_PROTOTYPE="prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
