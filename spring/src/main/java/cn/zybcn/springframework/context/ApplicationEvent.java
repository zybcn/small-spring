package cn.zybcn.springframework.context;

import java.util.EventObject;

/**
 * @Author 程序员小张
 * @Date 2022-12-06 22:00
 */
public abstract class ApplicationEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }

}
