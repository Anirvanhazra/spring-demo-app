package com.newyou.bydebby.springcomponentdemo.component;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by anirv on 4/22/2018.
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JDBCComponentConnection {
    public JDBCComponentConnection() {
        //Create JDBC Connection
        System.out.println("Inside JDBC Connection");
    }
}
