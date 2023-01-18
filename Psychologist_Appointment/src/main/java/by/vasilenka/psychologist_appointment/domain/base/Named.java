package by.vasilenka.psychologist_appointment.domain.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Named extends Identifiable{

    @Getter
    @Setter
    @Column(name = "name", columnDefinition = "varchar(255)")
    @JsonProperty
    protected String name;

    public Named(long id, String name) {
        super(id);
        this.name = name;
    }
}
