package by.vasilenka.studentmanagment.service.impl;

import by.vasilenka.studentmanagment.DAO.TraineeDAO;
import by.vasilenka.studentmanagment.domain.Trainee;
import by.vasilenka.studentmanagment.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class TraineeServiceImpl implements TraineeService {

    @Autowired
    private TraineeDAO traineeDAO;

    @Override
    public List<Trainee> getAllTrainees() throws SQLException {
        return traineeDAO.getAllStudents();
    }
}
