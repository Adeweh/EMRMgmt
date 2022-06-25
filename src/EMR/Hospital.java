package EMR;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Hospital {

        private ArrayList<Doctor> doctorsList = new ArrayList<>();
        private ArrayList<HospitalTest> testsList = new ArrayList<>();


        public ArrayList<Doctor> getDoctorsList() {
            return doctorsList;
        }

        public ArrayList<HospitalTest> getTestsList() {
            return testsList;
        }

        public void addDoctor(String name, char gender, String specialty) {
            Doctor doctor = new Doctor(name, gender, specialty);
            doctorsList.add(doctor);

        }


        public void removeDoctor(int Id) {
            for (Doctor doctor : doctorsList) {
                if (doctor.getDoctorId() == Id) {
                    doctorsList.remove(doctor);
                    return;
                }
            } throw new InputMismatchException();
        }

        public void addTest(String name, String testType) {
            HospitalTest test = new HospitalTest(name, testType);
            testsList.add(test);

        }

        public void removeTest(int Id) {
            for(HospitalTest test: testsList){
                if(test.getTestId() == Id){
                    testsList.remove(test);
                    return;
                }
            }throw new InputMismatchException();

        }

}
