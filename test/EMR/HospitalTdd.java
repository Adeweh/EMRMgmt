package EMR;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HospitalTdd {
     Hospital hospital;

        @BeforeEach
        void setup(){
            hospital= new Hospital();
        }
        @AfterEach
        void tearDown(){
            Doctor.resetDoctorId();
            HospitalTest.resetTestId();

        }

        @Test
        void testToAddDoctor(){
            hospital.addDoctor("Dee",'F',"Surgeon");
            String name = hospital.getDoctorsList().get(0).getName();
            char gender = hospital.getDoctorsList().get(0).getGender();
            String spec = hospital.getDoctorsList().get(0).getSpecialty();
            ArrayList<Doctor> myDoctor = hospital.getDoctorsList();
            assertEquals("Dee", name);
            assertEquals('F', gender);
            assertEquals("Surgeon", spec);
            assertEquals(1, myDoctor.size());

        }

        @Test
        void testToRemoveDoctor() {
            hospital.addDoctor("Dee",'F',"Surgeon");
            hospital.removeDoctor(1);
            assertEquals(0, hospital.getDoctorsList().size());
        }
        @Test
        void testToGetTest(){
            hospital.addTest("Dee", "Surgeon");
            String name = hospital.getTestsList().get(0).getName();
            String type = hospital.getTestsList().get(0).getTestType();
            assertEquals("Dee", name);
            assertEquals("Surgeon", type);
        }
        @Test
        void testToRemoveTest(){
            hospital.addTest("Dee", "Surgeon");
            hospital.removeTest(1);
            assertEquals(0, hospital.getTestsList().size());
        }



}