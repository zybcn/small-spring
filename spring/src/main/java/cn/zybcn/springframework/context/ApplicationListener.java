package cn.zybcn.springframework.context;

import java.util.EventListener;

/**
 * @Author 程序员小张
 * @Date 2022-12-06 22:56
 * @Desc 事件监听器
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {


    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);


}
