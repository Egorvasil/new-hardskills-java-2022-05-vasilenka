package by.vasilenka.datajpa.domain.base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Named extends Identifiable{

    @Getter
    @Setter
    @Column(name = "name", columnDefinition = "varchar(255)")
    protected String name;

}
