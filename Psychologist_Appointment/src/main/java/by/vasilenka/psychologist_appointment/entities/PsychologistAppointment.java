package by.vasilenka.psychologist_appointment.entities;

import by.vasilenka.psychologist_appointment.domain.base.Surname;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity(name = "visit_psychologist")
@Table(name = "visit_psychologist")
public class PsychologistAppointment extends Surname {

    @Getter
    @Setter
    @Column(name = "age", columnDefinition = "int")
    @JsonProperty
    private int age;

    @Getter
    @Setter
    @Column(name = "sex", columnDefinition = "varchar(255)")
    @JsonProperty
    private String sex;

    @Getter
    @Setter
    @Column(name = "problem", columnDefinition = "varchar(255)")
    @JsonProperty
    private String problem;

    @Getter
    @Setter
    @Column(name = "status", columnDefinition = "varchar(255)")
    @JsonProperty
    private String status;

    public PsychologistAppointment(long id, String name, String surname, int age, String sex, String problem, String status) {
        super(id, name, surname);
        this.age = age;
        this.sex = sex;
        this.problem = problem;
        this.status = status;
    }

    public PsychologistAppointment() {
        super(0L, null, null);
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PsychologistAppointment that = (PsychologistAppointment) o;
        return age == that.age && Objects.equals(sex, that.sex) &&
                Objects.equals(problem, that.problem) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, sex, problem, status);
    }
}
