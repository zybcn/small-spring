package cn.zybcn.springframework.beans;

/**
 * @Author 程序员小张
 * @Date 2022-11-12 23:38
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
