package com.jerictech.votingsystem.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "citizens")
public class Citizen {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "citizen_name")
    private String name;
}
