package com.medical.system.springRestAndDataJpaWithSpringBoot.service;

import java.util.List;
import java.util.Optional;

import com.medical.system.springRestAndDataJpaWithSpringBoot.entity.Patient;
import com.medical.system.springRestAndDataJpaWithSpringBoot.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository patientRepository;

    public void setPatientRepository(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> retrievePatients() {
        List<Patient> patients = patientRepository.findAll();
        return patients;
    }

    public Patient getPatient(Long patientId) {
        Optional<Patient> optEmp = patientRepository.findById(patientId);
        return optEmp.get();
    }

    public Long savePatient(Patient patient){
       return patientRepository.save(patient).getId();
    }

    public void deletePatient(Long patientId){
        patientRepository.deleteById(patientId);
    }

    public void updatePatient(Patient patient) {
        patientRepository.save(patient);
    }
}