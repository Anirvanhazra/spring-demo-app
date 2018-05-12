package com.newyou.bydebby.springdemoapp.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by anirv on 4/21/2018.
 */
@Component
@Qualifier("bubblesort")
public class BubbleSortImpl implements SortAlgorithm{
    public int[] sortAlgorithm (int[] numbers) {
        return numbers;
    }
}
