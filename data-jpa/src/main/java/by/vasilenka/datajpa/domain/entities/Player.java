package by.vasilenka.datajpa.domain.entities;

import by.vasilenka.datajpa.domain.base.Named;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "player")
@Table(name = "player")
public class Player extends Named {

    @Getter
    @Setter
    @Column(name = "points", columnDefinition = "bigint")
    private long points;

    @Override
    public String toString() {
        return "Player{" +
                "points=" + points +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
