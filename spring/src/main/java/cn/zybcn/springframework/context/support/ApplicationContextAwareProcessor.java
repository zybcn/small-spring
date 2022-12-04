package cn.zybcn.springframework.context.support;

import cn.zybcn.springframework.beans.BeansException;
import cn.zybcn.springframework.beans.factory.config.BeanPostProcessor;
import cn.zybcn.springframework.context.ApplicationContext;
import cn.zybcn.springframework.context.ApplicationContextAware;

/**
 * @Author 程序员小张
 * @Date 2022-12-04 13:18
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {


    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
