package dev.patika.campus.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", columnDefinition = "serial")
    private Long userId;

    @Column(name = "user_name", nullable = false, unique = true)
    private String userName;

    @Column(name = "user_password", nullable = false)
    private String password;

    @Column(name = "user_role", nullable = false)
    private String role;    // STUDENT, TEACHER, ADMIN

    @Column(name = "user_email", nullable = false, unique = true)
    private String email;

    @OneToOne(mappedBy = "user", optional = true)
    private Student student;

    @OneToOne(mappedBy = "user", optional = true)
    private Teacher teacher;

}
