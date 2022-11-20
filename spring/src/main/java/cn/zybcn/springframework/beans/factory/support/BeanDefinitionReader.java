package cn.zybcn.springframework.beans.factory.support;

import cn.zybcn.springframework.beans.BeansException;
import cn.zybcn.springframework.core.io.Resource;
import cn.zybcn.springframework.core.io.ResourceLoader;

/**
 * @Author 程序员小张
 * @Date 2022-11-20 11:27
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();


    ResourceLoader getResourceLoader();


    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
