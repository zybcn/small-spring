package cn.zybcn.springframework.context.event;

import cn.zybcn.springframework.context.ApplicationEvent;
import cn.zybcn.springframework.context.ApplicationListener;

/**
 * @Author 程序员小张
 * @Date 2022-12-06 23:35
 */
public interface ApplicationEventMulticaster {

    /**
     * Add a listener to be notified of all events.
     *
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);


    /**
     * Remove a listener from the notification list.
     *
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     *
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);

}
