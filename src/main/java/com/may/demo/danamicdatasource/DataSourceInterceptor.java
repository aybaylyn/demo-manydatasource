package com.may.demo.danamicdatasource;

import com.may.demo.util.Constants;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by May on 4/18/17.
 */

public class DataSourceInterceptor {

    public void setdataSource1() {
        DatabaseContextHolder.setCustomerType(Constants.DATA_SOURCE_1);
    }
    public void setdataSource2() {
        DatabaseContextHolder.setCustomerType(Constants.DATA_SOURCE_2);
    }
}
