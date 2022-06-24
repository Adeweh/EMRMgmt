package EMR;

import java.util.ArrayList;

public class Doctor {

    private final String doctorName;

    public ArrayList<String> patient = new ArrayList<>();
    private String doctorSpecialty;
    private String gender;
    private int age;
    private String MaritalStatus;
    private String patientCondition;

    public Doctor(String doctorName) {
        this.doctorName = doctorName;
    }


    public String getDoctorName() {
        return doctorName;
    }


    public void selectPatient(String patientName) {
        patient.add(patientName);
    }

    public void removePatient(String patientName) {
        patient.remove(patientName);
    }

    public void setDoctorSpecialty(String doctorSpecialty) {
        this.doctorSpecialty = doctorSpecialty;
    }

    public String getDoctorSpecialty() {
        return doctorSpecialty;
    }

    public void setDoctorAge(int  age) {
        this.age = age;
    }

    public int getDoctorAge() {
        return age;
    }

    public void setDoctorGender(String gender) {
        this.gender = gender;
    }

    public String getDoctorGender() {
        return gender;
    }

    public void setMaritalStatus(String MaritalStatus) {
        this.MaritalStatus = MaritalStatus;
    }

    public String getMaritalStatus() {
        return MaritalStatus;
    }

    public void setPatientCondition(String patientCondition) {
        this.patientCondition = patientCondition;
    }

    public String getPatientCondition() {
        return patientCondition;
    }
}

