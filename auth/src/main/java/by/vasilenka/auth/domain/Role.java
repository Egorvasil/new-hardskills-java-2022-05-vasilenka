package by.vasilenka.auth.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "service_user_role")
@Entity public class Role {

    @Id
    @Column(name = "id", columnDefinition = "bigint")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", columnDefinition = "varchar(255)")
    private String name;

}
