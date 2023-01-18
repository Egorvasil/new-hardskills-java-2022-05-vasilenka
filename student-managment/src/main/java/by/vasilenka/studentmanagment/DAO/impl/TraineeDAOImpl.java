package by.vasilenka.studentmanagment.DAO.impl;

import by.vasilenka.studentmanagment.DAO.TraineeDAO;
import by.vasilenka.studentmanagment.DAO.config.ConnectionDriver;
import by.vasilenka.studentmanagment.domain.Trainee;
import by.vasilenka.studentmanagment.domain.utils.factory.AbstractFactory;
import by.vasilenka.studentmanagment.domain.utils.factory.impl.TraineeFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class TraineeDAOImpl implements TraineeDAO {
    @Autowired
    private ConnectionDriver connectionDriver;

    private final AbstractFactory<Trainee> traineeAbstractFactory;

    public TraineeDAOImpl() {
        this.traineeAbstractFactory = new TraineeFactoryImpl();
    }

    @Override
    public List<Trainee> getAllStudents() throws SQLException {
        List<Trainee>traineeList = new ArrayList<>();
        Connection currentConnection = connectionDriver.getConnection();
        final String query = "SELECT * FROM public.\"trainee\"";
        Statement statement = currentConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            Trainee trainee = traineeAbstractFactory.create();
            trainee.setId(resultSet.getLong("id"));
            trainee.setName(resultSet.getString("name"));
            trainee.setEducation_dir_id(resultSet.getLong("education_dir_id"));
            trainee.setAverageGrade(resultSet.getDouble("averageGrade"));
            traineeList.add(trainee);

        }
        connectionDriver.close();
        return traineeList ;
    }
}
