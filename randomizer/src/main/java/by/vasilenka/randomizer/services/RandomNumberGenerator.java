package by.vasilenka.randomizer.services;

import org.springframework.stereotype.Service;

/**
 * API for numbers generator
 */
@Service
public interface RandomNumberGenerator {

    Integer next(int bound);



}
