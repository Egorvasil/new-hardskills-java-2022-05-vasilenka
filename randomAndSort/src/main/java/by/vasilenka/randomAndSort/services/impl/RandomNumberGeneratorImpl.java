package by.vasilenka.randomAndSort.services.impl;

import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Random;

@Service
public class RandomNumberGeneratorImpl implements RandomNumberGenerator{

    private static final Random random = new SecureRandom();

    @Override
    public Integer next(int bound) {
        return random.nextInt(bound);
    }
}
