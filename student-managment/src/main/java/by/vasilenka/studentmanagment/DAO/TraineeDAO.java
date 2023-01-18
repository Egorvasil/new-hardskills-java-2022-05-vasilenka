package by.vasilenka.studentmanagment.DAO;

import by.vasilenka.studentmanagment.domain.Trainee;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public interface TraineeDAO {

    List<Trainee> getAllStudents() throws SQLException;

}
