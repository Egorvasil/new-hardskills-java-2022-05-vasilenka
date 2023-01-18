package by.vasilenka.studentmanagment.domain.utils.factory.impl;

import by.vasilenka.studentmanagment.domain.Trainee;
import by.vasilenka.studentmanagment.domain.utils.factory.AbstractFactory;


public class TraineeFactoryImpl implements AbstractFactory<Trainee> {
    @Override
    public Trainee create() {
        return new Trainee(0,null, 0,0.0); //mock-object
    }

}
