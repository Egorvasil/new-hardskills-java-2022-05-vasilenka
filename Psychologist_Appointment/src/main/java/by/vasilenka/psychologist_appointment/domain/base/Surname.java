package by.vasilenka.psychologist_appointment.domain.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Surname extends Named {

    @Getter
    @Setter
    @Column(name = "surname", columnDefinition = "varchar(255)")
    @JsonProperty
    protected String surname;

    public Surname(long id, String name, String surname) {
        super(id, name);
        this.surname = surname;
    }
}
