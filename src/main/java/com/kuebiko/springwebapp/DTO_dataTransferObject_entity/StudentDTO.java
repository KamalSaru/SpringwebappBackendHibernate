package com.kuebiko.springwebapp.DTO_dataTransferObject_entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;

@Entity
@Table(name="students")
public class StudentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long ID;
    @Column(name = "student_ID")
    private String studentID;

    @Column(name = "first_name")
    private String firstName;
    private String lastName;

    @JsonFormat(pattern="000-000-0000")
    private Long phoneNumber;

    //@NotBlank(message = "Please, provide email address.")
    @Column(name = "email_address")
    private String email;

    @Column(name = "home_address")
    private String address;

    private String gender;
    private String status;


    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}


