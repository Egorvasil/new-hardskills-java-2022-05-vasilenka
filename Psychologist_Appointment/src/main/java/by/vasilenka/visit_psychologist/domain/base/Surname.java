package by.vasilenka.visit_psychologist.domain.base;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Surname extends Named {

    @Getter
    @Setter
    @Column(name = "surname", columnDefinition = "varchar(255)")
    protected String surname;

}
