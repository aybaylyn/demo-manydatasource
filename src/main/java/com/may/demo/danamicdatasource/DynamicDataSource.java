package com.may.demo.danamicdatasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by May on 4/18/17.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        String result = DatabaseContextHolder.getCustomerType();
        return result;


    }
}
