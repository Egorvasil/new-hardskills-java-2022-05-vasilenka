package com.vasilenka.services;

import com.vasilenka.services.impl.HeapSorter;
import org.junit.Assert;
import org.junit.Test;

public class HeapSorterTest {

    // Test Driven Development

    private final Sorter sorterService = new HeapSorter();

    @Test
    public void sort_success1(){ // good case
        int [] actual = new int[]{ 5, 4, 3, 2, 1}; // data for sorting

        sorterService.sort(actual); // sort

        Assert.assertArrayEquals(new int[]{ 1, 2, 3, 4, 5}, actual); // comparing

    }

    @Test
    public void sort_success2(){ // good case
        int [] actual = new int[]{ 3, 5, 10, 12, 13}; // data for sorting

        sorterService.sort(actual); // sort

        Assert.assertArrayEquals(new int[]{ 3, 5, 10, 12, 13}, actual); // comparing

    }

    @Test
    public void sort_failure1(){ // bad case
        final int [] actual = new int[]{}; // data for sorting

        Assert.assertThrows(RuntimeException.class, () -> sorterService.sort(actual)); // RuntimeException

    }

    @Test
    public void sort_failure2(){ // bad case
        int [] actual = null; // data for sorting

        Assert.assertThrows(RuntimeException.class, () -> sorterService.sort(actual)); // we are expected RuntimeException

    }
}
