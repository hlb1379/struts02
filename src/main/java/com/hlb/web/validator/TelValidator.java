package com.hlb.web.validator;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

/**
 * Created by Fly on 2019/3/25.
 */
public class TelValidator extends FieldValidatorSupport {
    public void validate(Object o) throws ValidationException {
        //一个就是即将校验的那个参数

        //获取参数的名字，获取参数的值

        System.out.println("校验器执行了");
        String fn = getFieldName();
        String fv = getFieldValue(fn, o).toString();
        System.out.println(fv);
        //通过正则表达式
        String regex = "^1(3|5|7|8|9)\\d{9}$";
        boolean matches = fv.matches(regex);
        System.out.println(matches);
        if (!matches) {
            addFieldError(fn,"格式不正常");
        }
    }
}