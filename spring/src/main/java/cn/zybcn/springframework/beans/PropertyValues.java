package cn.zybcn.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 程序员小张
 * @Date 2022-11-13 14:11
 */
public class PropertyValues {

    private List<PropertyValue> propertyValueList = new ArrayList<>();


    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

}
