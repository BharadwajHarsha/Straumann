package com.straumann.patienthubservice.rest;

import com.straumann.patienthubservice.model.Patient;
import com.straumann.patienthubservice.service.PatientHubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientHubController {

    @Autowired
    private PatientHubService patientHubService;

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientHubService.getAllPatients();
    }

    @PostMapping
    public ResponseEntity<Patient> createPatient(@Valid @RequestBody Patient patient) {
        Patient createdPatient = patientHubService.createPatient(patient);
        return new ResponseEntity<>(createdPatient, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Integer id) {
        Patient patient = patientHubService.getPatientById(id);
        return ResponseEntity.ok(patient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePatientById(@PathVariable Integer id) {
        patientHubService.deletePatient(id);
        return ResponseEntity.ok("Patient with ID Deleted"+id);
    }

}


