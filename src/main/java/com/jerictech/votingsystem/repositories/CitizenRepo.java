package com.jerictech.votingsystem.repositories;

import com.jerictech.votingsystem.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepo extends JpaRepository<Citizen, Integer> {

    public Citizen findByName(String name);

}
