package com.may.demo.danamicdatasource;

/**
 * Created by May on 4/18/17.
 */
public class DatabaseContextHolder {


    //线程变量
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setCustomerType(String customerType) {
        contextHolder.set(customerType);
    }

    public static String getCustomerType() {
        return contextHolder.get();
    }

    public static void clearCustomerType() {
        contextHolder.remove();
    }
}
