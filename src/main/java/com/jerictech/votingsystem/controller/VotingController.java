package com.jerictech.votingsystem.controller;

import com.jerictech.votingsystem.entity.Citizen;
import com.jerictech.votingsystem.repositories.CandidateRepo;
import com.jerictech.votingsystem.repositories.CitizenRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@Controller
public class VotingController {

    @Autowired
    CitizenRepo citizenRepo;

    @Autowired
    CandidateRepo candidateRepo;

    @RequestMapping("/")
    public String goToVote() {
        return "vote.html";
    }

}
