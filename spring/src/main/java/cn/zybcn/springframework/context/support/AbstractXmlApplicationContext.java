package cn.zybcn.springframework.context.support;

import cn.zybcn.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.zybcn.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Author 程序员小张
 * @Date 2022-11-25 22:35
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{


    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }


    protected abstract String[] getConfigLocations();
}
