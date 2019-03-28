package com.hlb.web.converter;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Fly on 2019/3/25.
 */
public class MyDateConverter extends DefaultTypeConverter {
    @Override
    public Object convertValue(Object value, Class toType) {
        System.out.println("自定义日期格式转换器");
        //value是要转换的数据
        //toType是要转换的类型
        if (toType == Date.class) {
            try {
                return new SimpleDateFormat("yyyy/MM/dd").parse(value.toString());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}