package by.vasilenka.randomAndSort.services.impl;

import java.util.List;

/**
 * API for list generating
 *
 * @param <T> type of list
* */

public interface RandomListOfIntegersGeneratorService <T>{

    /**
     * @param size  size of future list
     * @param bound  bound for each number in list
     * @return generated list
     * */

    List<T> generate(int size, int bound);

}
