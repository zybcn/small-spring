package cn.zybcn.springframework.context.annotation;

import cn.hutool.core.util.ClassUtil;
import cn.zybcn.springframework.beans.factory.config.BeanDefinition;
import cn.zybcn.springframework.steretype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author 程序员小张
 * @Date 2022-12-12 20:11
 */
public class ClassPathScanningCandidateComponentProvider {

    public Set<BeanDefinition> findCandidateComponents(String basePackage) {
        Set<BeanDefinition> candidates = new LinkedHashSet<>();
        Set<Class<?>> classes = ClassUtil.scanPackageByAnnotation(basePackage, Component.class);
        for (Class<?> clazz : classes) {
            candidates.add(new BeanDefinition(clazz));
        }
        return candidates;
    }


}
