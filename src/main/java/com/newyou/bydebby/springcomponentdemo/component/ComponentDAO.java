package com.newyou.bydebby.springcomponentdemo.component;

import com.newyou.bydebby.springdemoapp.scope.JDBCConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by anirv on 4/22/2018.
 */
@Component
public class ComponentDAO {
    @Autowired
    JDBCComponentConnection jdbcconn;

    public JDBCComponentConnection getJdbcconn() {
        return jdbcconn;
    }

    public void setJdbcconn(JDBCComponentConnection jdbcconn) {
        this.jdbcconn = jdbcconn;
    }
}
