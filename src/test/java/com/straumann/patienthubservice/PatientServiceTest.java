/*
package com.straumann.patienthubservice.test;

import com.straumann.patienthubservice.model.Patient;
import com.straumann.patienthubservice.repository.PatientRepository;
import com.straumann.patienthubservice.service.PatientHubService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PatientServiceTest {

    @Mock
    private PatientRepository patientRepository;

    @InjectMocks
    private PatientHubService patientService;

    @Test
    public void testGetAllPatients() {
        // Arrange
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(1, "John", "Doe", "john@email.com"));
        patients.add(new Patient(2, "Jane","Smith","smith@email.com"));

        when(patientRepository.findAll()).thenReturn(patients);

        // Act
        List<Patient> result = patientService.getAllPatients();

        // Assert
        assertEquals(2, result.size());
        assertEquals("John Doe", result.get(0).getName());
        assertEquals("Condition 2", result.get(1).getCondition());
        verify(patientRepository, times(1)).findAll();
    }

*/
/*
import com.straumann.patienthubservice.model.Patient;
import com.straumann.patienthubservice.repository.PatientRepository;
import com.straumann.patienthubservice.service.PatientHubService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PatientServiceTest {

    @Mock
    private PatientRepository patientRepository;

    @InjectMocks
    private PatientHubService patientService;

    @Test
    public void testGetAllPatients() {
        // Arrange
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(1, "John", "Doe", "john@email.com"));
        patients.add(new Patient(2, "Jane","Smith","smith@email.com"));

        when(patientRepository.findAll()).thenReturn(patients);
        *//*

*/
/*patientRepository.
        // Act
        List<Patient> result = patientService.getAllPatients();

        // Assert
        assertEquals(2, result.size());
        assertEquals("John Doe", result.get(0).getFirstName());
        assertEquals("Condition 2", result.get(1).getEmail());
        verify(patientRepository, times(1)).findAll();*//*
*/
/*

    }
}*/

