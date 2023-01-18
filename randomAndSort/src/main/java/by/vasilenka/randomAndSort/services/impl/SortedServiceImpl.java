package by.vasilenka.randomAndSort.services.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class SortedServiceImpl implements SortedService{

    @Override
    public void sort(List<? extends Integer> list, String sortingType) {
        switch (sortingType){
            case "ASC":{
                list.sort(Comparator.naturalOrder());
                break;
            }
            case "DESC": {
                list.sort(Comparator.reverseOrder());
                break;
            }
        }

    }
}
