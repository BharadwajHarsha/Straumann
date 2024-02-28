package com.straumann.patienthubservice;

import com.straumann.patienthubservice.model.Patient;
import com.straumann.patienthubservice.rest.PatientHubController;
import com.straumann.patienthubservice.service.PatientHubService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PatientServiceTests {

    @Mock
    private PatientHubService patientHubService;

    @InjectMocks
    private PatientHubController patientHubController;

    @Test
    public void testGetAllPatients() {

        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(1, "John", "Doe", "john@email.com"));
        patients.add(new Patient(2, "Jane", "Smith", "smith@email.com"));

        when(patientHubService.getAllPatients()).thenReturn(patients);
        List<Patient> result = patientHubController.getAllPatients();

        assertEquals(2, result.size());
        assertEquals("John", result.get(0).getFirstName());
        assertEquals("Doe", result.get(0).getLastName());
        assertEquals("john@email.com", result.get(0).getEmail());
        verify(patientHubService, times(1)).getAllPatients();
    }

    @Test
    public void testGetPatientById() {
        Patient patient = new Patient(1, "John","Doe", "john@email.com");
        when(patientHubService.getPatientById(1)).thenReturn(patient);

        ResponseEntity<Patient> responseEntity = patientHubController.getPatientById(1);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("John", responseEntity.getBody().getFirstName());
        assertEquals("Doe", responseEntity.getBody().getLastName());
        assertEquals("john@email.com", responseEntity.getBody().getEmail());
        verify(patientHubService, times(1)).getPatientById(1);
    }

}
