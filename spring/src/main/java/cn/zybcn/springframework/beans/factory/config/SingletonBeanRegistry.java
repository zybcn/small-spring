package cn.zybcn.springframework.beans.factory.config;

/**
 * @Author ZhangYiBo
 * @Date 2022-07-17 23:32
 * @Desc 单例注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
