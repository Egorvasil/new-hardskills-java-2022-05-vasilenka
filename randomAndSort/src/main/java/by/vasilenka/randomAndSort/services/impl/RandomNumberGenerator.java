package by.vasilenka.randomAndSort.services.impl;

public interface RandomNumberGenerator {

    /**
    * @param bound limit for random number
     * @return random generated number with bound
    * */

    Integer next(int bound);

}
