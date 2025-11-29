package tn.esprit.studentmanagement.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class Youssef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private LocalDate dateOfBirth;
    private String gender;

    @ManyToOne
    private Department department;


}
