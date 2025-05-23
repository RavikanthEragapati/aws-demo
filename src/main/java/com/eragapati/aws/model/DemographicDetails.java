package com.eragapati.aws.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DemographicDetails {
    private String firstName;
    private String lastName;
    private String currentRole;
}
