package com.newyou.bydebby.springdemoapp.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by anirv on 4/22/2018.
 */
@Component
public class EmployeeDAO {
    @Autowired
    JDBCConnection jdbcconn;

    public JDBCConnection getJdbcconn() {
        return jdbcconn;
    }

    public void setJdbcconn(JDBCConnection jdbcconn) {
        this.jdbcconn = jdbcconn;
    }
}
