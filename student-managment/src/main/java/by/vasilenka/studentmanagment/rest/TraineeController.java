package by.vasilenka.studentmanagment.rest;

import by.vasilenka.studentmanagment.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/trainee")
public class TraineeController {

    @Autowired
    private TraineeService traineeService;

    @GetMapping
    public List<String> getAllTrainee() throws SQLException {
        return traineeService.getAllTrainees().stream()
                .map(Objects::toString)
                .collect(Collectors.toList());
    }

}
