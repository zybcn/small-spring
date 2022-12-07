package cn.zybcn.springframework.context.event;

import cn.zybcn.springframework.beans.factory.BeanFactory;
import cn.zybcn.springframework.context.ApplicationEvent;
import cn.zybcn.springframework.context.ApplicationListener;

/**
 * @Author 程序员小张
 * @Date 2022-12-06 23:43
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }


    @Override
    public void multicastEvent(ApplicationEvent event) {
        for (ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
