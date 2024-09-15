package dev.patika.campus.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id", columnDefinition = "serial")
    private Long teacherId;

    @Column(name = "teacher_name", nullable = false)
    private String teacherName;

    @Column(name = "teacher_surname", nullable = false)
    private String teacherSurname;

    @OneToOne
    @JoinColumn(name ="user_id")
    private User user;

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;


}
