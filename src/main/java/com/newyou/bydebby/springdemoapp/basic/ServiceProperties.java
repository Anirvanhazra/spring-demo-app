package com.newyou.bydebby.springdemoapp.basic;

import com.newyou.bydebby.springdemoapp.basic.SortAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by anirv on 4/21/2018.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ServiceProperties {
    @Autowired
    @Qualifier("quicksort")
    private SortAlgorithm sortAlgorithm;

    Logger logger = LoggerFactory.getLogger(this.getClass());


    public int binarySearch (int[] numbers, int numberToSearch) {
        int[] sortedNumbers = sortAlgorithm.sortAlgorithm(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }

    @PostConstruct
    public void postConstruction(){
        logger.info("Inside postConstruct");
    }

    @PreDestroy
    public void preDestruction(){
        logger.info("Inside preDestroy");
    }
}

