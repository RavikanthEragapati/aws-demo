package com.eragapati.aws.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContactDetails {
    private String emailId;
    private String phoneNum;
    private String linkedIn;
    private String gitHub;
    private String Website;

}
