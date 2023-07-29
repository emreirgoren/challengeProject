package com.enoca.challengeProject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="company")
public class Company {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "company_name")
    private String companyName;

}
