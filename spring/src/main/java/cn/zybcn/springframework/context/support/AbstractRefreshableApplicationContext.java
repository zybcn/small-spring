package cn.zybcn.springframework.context.support;

import cn.zybcn.springframework.beans.BeansException;
import cn.zybcn.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.zybcn.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @Author 程序员小张
 * @Date 2022-11-25 22:22
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;


    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }


    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
