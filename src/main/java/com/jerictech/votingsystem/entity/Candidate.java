package com.jerictech.votingsystem.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @Column(name = "id")
    private long candidateId;

    @Column(name = "candidate_name")
    private String candidateName;

}
