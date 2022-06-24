package EMR;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DoctorTest {
    Doctor doctor = new Doctor("nifemi");
    @Test
    void DoctorNameCanBeSet() {
        assertEquals("nifemi", doctor.getDoctorName());
    }
    @Test
    void patientArrayListExits(){
        assertNotNull(doctor.patient);
    }
    @Test
    void patientCanBeAddedToArrayListTest(){
        doctor.selectPatient("Nouah");
        doctor.selectPatient("Dorcas");
        doctor.selectPatient("Nifemi");
        doctor.selectPatient("Precious");
        assertFalse(doctor.patient.isEmpty());
        System.out.println(doctor.patient);

    }

    @Test
    void patientsCanBeRemovedTest(){
        doctor.selectPatient("Nouah");
        doctor.selectPatient("Dorcas");
        doctor.selectPatient("Nifemi");
        doctor.selectPatient("Precious");
        doctor.removePatient("Nifemi");
        System.out.println(doctor.patient);
    }
    @Test
    void getDoctorSpecialty() {
        doctor.setDoctorSpecialty("Dentistry");
        assertEquals("Dentistry", doctor.getDoctorSpecialty());
    }
    @Test
    void getDoctorAge(){
        doctor.setDoctorAge(45);
        assertEquals(45 ,doctor.getDoctorAge());
    }
    @Test
    void getDoctorGender(){
        doctor.setDoctorGender("male");
        assertEquals("male" , doctor.getDoctorGender());
    }
    @Test
    void getMaritalStatus(){
        doctor.setMaritalStatus("Single");
        assertEquals("Single" ,doctor.getMaritalStatus());
    }
    @Test
    void getPatientCondition(){
        doctor.setPatientCondition("Malaria");
        assertEquals("Malaria" , doctor.getPatientCondition());
    }
}

