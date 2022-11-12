package by.vasilenka.randomAndSort.services.impl;

import java.util.List;

/**
*  API for list sorting
* */
public interface SortedService {

    /**
     * @param list src list of integers
     * @param sortingType type of sorting (ASC & DESC)
     */


    void sort(List<? extends Integer> list, final String sortingType);
}
