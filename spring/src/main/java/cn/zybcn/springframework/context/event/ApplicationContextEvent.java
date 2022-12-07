package cn.zybcn.springframework.context.event;

import cn.zybcn.springframework.context.ApplicationEvent;

/**
 * @Author 程序员小张
 * @Date 2022-12-06 22:28
 */
public class ApplicationContextEvent extends ApplicationEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * Get the <code>ApplicationContext</code> that the event was raised for.
     */
    public final ApplicationEvent getApplicationContext() {
        return (ApplicationEvent) getSource();
    }
}
