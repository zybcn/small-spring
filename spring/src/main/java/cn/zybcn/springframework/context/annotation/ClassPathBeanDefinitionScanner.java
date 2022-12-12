package cn.zybcn.springframework.context.annotation;

import cn.hutool.core.util.StrUtil;
import cn.zybcn.springframework.beans.factory.config.BeanDefinition;
import cn.zybcn.springframework.beans.factory.support.BeanDefinitionRegistry;
import cn.zybcn.springframework.steretype.Component;

import java.util.Set;

/**
 * @Author 程序员小张
 * @Date 2022-12-12 20:14
 */
public class ClassPathBeanDefinitionScanner extends ClassPathScanningCandidateComponentProvider {

    private BeanDefinitionRegistry registry;

    public ClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry) {
        this.registry = registry;
    }

    public void doScan(String... basePackages) {

        for (String basePackage : basePackages) {

            Set<BeanDefinition> candidates = findCandidateComponents(basePackage);


            for (BeanDefinition beanDefinition : candidates) {

                String beanScope = resolveBeanScope(beanDefinition);
                if (StrUtil.isNotEmpty(beanScope)) {
                    beanDefinition.setScope(beanScope);
                }
                registry.registerBeanDefinition(determineBeanName(beanDefinition),beanDefinition);
            }
        }

    }


    private String resolveBeanScope(BeanDefinition beanDefinition) {
        Class<?> beanClass = beanDefinition.getBeanClass();
        Scope scope = beanClass.getAnnotation(Scope.class);
        if (scope != null) {
            return scope.value();
        }
        return StrUtil.EMPTY;
    }


    private String determineBeanName(BeanDefinition beanDefinition){
        Class<?> beanClass = beanDefinition.getBeanClass();
        Component component = beanClass.getAnnotation(Component.class);
        String value = component.value();
        if (StrUtil.isEmpty(value)) {
            value = StrUtil.lowerFirst(beanClass.getSimpleName());
        }
        return value;

    }

}
