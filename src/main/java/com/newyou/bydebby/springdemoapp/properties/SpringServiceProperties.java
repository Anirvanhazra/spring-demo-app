package com.newyou.bydebby.springdemoapp.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by anirv on 4/25/2018.
 */
@Component
public class SpringServiceProperties {

    @Value("${external.service.url}")
    private String Url;

    //private Environment environment;

    public String getExternalUrl(){
        //this.Url = environment.getProperty("external.service.url");
        return Url;
    }
}
