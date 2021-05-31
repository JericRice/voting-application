package com.jerictech.votingsystem.controller;

import com.jerictech.votingsystem.entity.Candidate;
import com.jerictech.votingsystem.entity.Citizen;
import com.jerictech.votingsystem.repositories.CandidateRepo;
import com.jerictech.votingsystem.repositories.CitizenRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;



@Controller
public class VotingController {

    @Autowired
    CitizenRepo citizenRepo;

    @Autowired
    CandidateRepo candidateRepo;

    @RequestMapping("/")
    public String goToVote() {
        return "vote";
    }

    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam String name,Model model) {
        Citizen citizen = citizenRepo.findByName(name);
        if(!citizen.getHasVoted()) {
            List<Candidate> candidates = candidateRepo.findAll();
            model.addAttribute("candidates",candidates);
            return "/performVoted";
        } else {
            return "/alreadyVoted";
        }
    }

    @RequestMapping("/voteFor")
    public String voteFor(@RequestParam Long id) {
        Candidate c = candidateRepo.findById((long)id);
        c.setNumberOfVotes(c.getNumberOfVotes()+1);
        candidateRepo.save(c);

        return "voted";

    }


}
