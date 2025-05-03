package com.eragapati.aws.controller;

import com.eragapati.aws.model.ContactDetails;
import com.eragapati.aws.model.DemographicDetails;
import com.eragapati.aws.service.ResumeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/resume")
@RequiredArgsConstructor
public class ResumeController {

    private final ResumeService resumeService;

    @GetMapping(value = "/demographic/{candidateId}")
    public DemographicDetails candidateDemographicDetails(@PathVariable("candidateId") String candidateId) {
        return resumeService.fetchDemographicDetails(candidateId);
    }

    @GetMapping(value = "/contact/{candidateId}")
    public ContactDetails candidateContactDetails(@PathVariable("candidateId") String candidateId) {
        return resumeService.fetchContactDetails(candidateId);
    }
}
