package com.enoca.challengeProject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="employee" )
public class Employee {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "first_Name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identity_no")
    private int identityNo;



}
