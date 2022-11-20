package cn.zybcn.springframework.beans.factory.support;

import cn.zybcn.springframework.core.io.DefaultResourceLoader;
import cn.zybcn.springframework.core.io.ResourceLoader;

/**
 * @Author 程序员小张
 * @Date 2022-11-20 11:26
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {


    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;


    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
