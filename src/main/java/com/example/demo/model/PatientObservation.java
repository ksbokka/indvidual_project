package com.example.demo.model;

import lombok.Data;

@Data
public class PatientObservation {
    public String patientResource;
    public Double observationValue;
    public String gender;
}
