package com.straumann.patienthubservice.service;

import com.straumann.patienthubservice.exception.PatientNotFoundException;
import com.straumann.patienthubservice.model.Patient;
import com.straumann.patienthubservice.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientHubService {

    @Autowired
    private PatientRepository patientRepository;

    @Cacheable("patients")
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @CacheEvict(value = "patients", allEntries = true)
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient getPatientById(Integer id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException("Patient not found with id: " + id));
    }

    @CacheEvict(value = "patients", allEntries = true)
    public void deletePatient(Integer id) {
        patientRepository.deleteById(id);
    }
}
