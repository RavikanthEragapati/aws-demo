package com.eragapati.aws.service;

import com.eragapati.aws.exception.RecordNotFound;
import com.eragapati.aws.model.ContactDetails;
import com.eragapati.aws.model.DemographicDetails;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ResumeService {

    private final Map<String, DemographicDetails> demographicDetailsMap = new HashMap<>();
    private final Map<String, ContactDetails> contactDetailsMap = new HashMap<>();

    @PostConstruct
    void init() {
        demographicDetailsMap.put("101", new DemographicDetails("Ravi", "Eragapati", "Principal Application Engineer"));
        demographicDetailsMap.put("102", new DemographicDetails("Jon", "Doe", "Application Engineer"));

        contactDetailsMap.put("101", new ContactDetails("e.ravikanth@live.com", "(000)-00-0000", "www.linkedin.com/in/ekrkanth", "github.com/RavikanthEragapati", "www.eragapati.com"));
        contactDetailsMap.put("102", new ContactDetails("d.jon@yahoo.com", "(000)-00-0001", "www.linkedin.com/in/jonDoe", "github.com/jobDow", "www.jonDoe.com"));
    }

    public DemographicDetails fetchDemographicDetails(String candidateId) {
        if (!demographicDetailsMap.containsKey(candidateId)) throw new RecordNotFound();
        return demographicDetailsMap.get(candidateId);
    }

    public ContactDetails fetchContactDetails(String candidateId) {
        if (!contactDetailsMap.containsKey(candidateId)) throw new RecordNotFound();
        return contactDetailsMap.get(candidateId);
    }

}
