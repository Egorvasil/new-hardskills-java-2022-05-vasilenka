package by.vasilenka.studentmanagment.service;

import by.vasilenka.studentmanagment.domain.Trainee;

import java.sql.SQLException;
import java.util.List;

public interface TraineeService {

    List<Trainee> getAllTrainees() throws SQLException;

}
