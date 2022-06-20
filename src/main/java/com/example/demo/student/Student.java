package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String gender;
    private String email;
    private Integer contact;
    private LocalDate dob;

    public Student() {
    }

    public Student(Long id,
                   String name,
                   String gender,
                   String email,
                   Integer contact,
                   LocalDate dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.contact = contact;
        this.dob = dob;
    }

    public Student(String name,
                   String gender,
                   String email,
                   Integer contact,
                   LocalDate dob) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.contact = contact;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", contact=" + contact +
                ", dob=" + dob +
                '}';
    }
}
