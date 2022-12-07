package cn.zybcn.springframework.context;

import cn.zybcn.springframework.beans.factory.HierarchicalBeanFactory;
import cn.zybcn.springframework.beans.factory.ListableBeanFactory;
import cn.zybcn.springframework.core.io.ResourceLoader;

/**
 * @Author 程序员小张
 * @Date 2022-11-24 22:17
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader,ApplicationEventPublisher {

}
