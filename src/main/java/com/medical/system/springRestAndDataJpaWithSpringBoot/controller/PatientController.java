package com.medical.system.springRestAndDataJpaWithSpringBoot.controller;

import java.util.List;
import java.util.Map;

import com.medical.system.springRestAndDataJpaWithSpringBoot.entity.Patient;
import com.medical.system.springRestAndDataJpaWithSpringBoot.entity.Patient;
import com.medical.system.springRestAndDataJpaWithSpringBoot.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    public void setPatientService(PatientService patientService) {
        this.patientService = patientService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/homepage", method = RequestMethod.GET)
    public String homepage() {
        return "homepage";
    }

    @GetMapping("/api/patients")
    public List<Patient> getPatients() {
        List<Patient> patients = patientService.retrievePatients();
        return patients;
    }

    @GetMapping("/api/patients/{patientId}")
    public Patient getPatient(@PathVariable(name = "patientId") Long patientId) {
        return patientService.getPatient(patientId);
    }

    @PostMapping("/api/patients")
    public Long savePatient(Patient patient) {
        return patientService.savePatient(patient);
        //System.out.println("Patient Saved Successfully");
    }

    @DeleteMapping("/api/patients/{patientId}")
    public void deletePatient(@PathVariable(name = "patientId") Long patientId) {
        patientService.deletePatient(patientId);
        System.out.println("Patient Deleted Successfully");
    }

    @PutMapping("/api/patients/{patientId}")
    public void updatePatient(@RequestBody Patient patient,
                              @PathVariable(name = "patientId") Long patientId) {
        Patient emp = patientService.getPatient(patientId);
        if (emp != null) {
            patientService.updatePatient(patient);
        }

    }
}