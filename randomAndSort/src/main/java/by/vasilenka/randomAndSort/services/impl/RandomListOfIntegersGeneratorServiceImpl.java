package by.vasilenka.randomAndSort.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RandomListOfIntegersGeneratorServiceImpl implements RandomListOfIntegersGeneratorService<Integer>{

    @Autowired
    private  RandomNumberGenerator randomNumberGenerator;

    @Override
    public List<Integer> generate(int size, int bound) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(randomNumberGenerator.next(bound));
        }
        return list;
    }
}
