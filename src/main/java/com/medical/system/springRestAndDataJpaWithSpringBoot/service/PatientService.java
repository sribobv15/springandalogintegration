package com.medical.system.springRestAndDataJpaWithSpringBoot.service;
import java.util.List;

import com.medical.system.springRestAndDataJpaWithSpringBoot.entity.Patient;

public interface PatientService {
        public List<Patient> retrievePatients();

        public Patient getPatient(Long patientId);

        public Long savePatient(Patient patient);

        public void deletePatient(Long patientId);

        public void updatePatient(Patient patient);
    }
