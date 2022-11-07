package by.vasilenka.visit_psychologist.entities;

import by.vasilenka.visit_psychologist.domain.base.Surname;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "visit_psychologist")
@Table(name = "visit_psychologist")
public class PsychologistAppointment extends Surname {

    @Getter
    @Setter
    @Column(name = "age", columnDefinition = "int")
    private int age;

    @Getter
    @Setter
    @Column(name = "sex", columnDefinition = "varchar(255)")
    private String sex;

    @Getter
    @Setter
    @Column(name = "problem", columnDefinition = "varchar(255)")
    private String problem;

    @Getter
    @Setter
    @Column(name = "status", columnDefinition = "varchar(255)")
    private String status;


    @Override
    public String toString() {
        return "VisitPsychologist{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", problem='" + problem + '\'' +
                "status='" + status + '\'' +
                '}';
    }
}
