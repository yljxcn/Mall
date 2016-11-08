package com.xmg.mall.base.validation;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;

public class ValidationUtils extends Validate {

    public static void isPhoneNumber(String phoneNumber) {
        isPhoneNumber(phoneNumber, "手机号码格式有误");
    }

    public static void isPhoneNumber(String phoneNumber, String message) {
        matchesPattern(phoneNumber, "^1\\d{10}$", message);
    }

    public static void isEmail(String email) {
        isEmail(email, "电子邮箱格式有误");
    }

    public static void isEmail(String email, String message) {
        matchesPattern(email, "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$", message);
    }

}
