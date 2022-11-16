package by.vasilenka.auth.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "service_user")
@Entity public class User {

    @Id
    @Column(name = "id", columnDefinition = "bigint")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", columnDefinition = "varchar(255)")
    private String name;

    @Column(name = "password", columnDefinition = "varchar(255)")
    private String password;

    @Column(name = "created_at", columnDefinition = "date")
    private LocalDateTime createdAt;

    @OneToOne
    private Role role;

}
