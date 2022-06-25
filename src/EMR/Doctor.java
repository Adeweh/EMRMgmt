package EMR;

public class Doctor {
        private int doctorId;
        private String name;
        private char gender;
        private String specialty;

        public static int countDoctorID = 1;



        public Doctor(String name,char gender, String specialty){
            this.name = name;
            this.gender = gender;
            this.specialty = specialty;
            this.doctorId = countDoctorID;
            countDoctorID++;

        }

        public int getDoctorId() {
            return doctorId;
        }

        public String getName() {
            return name;
        }

        public char getGender() {
            return gender;
        }

        public String getSpecialty() {
            return specialty;
        }

        public static void resetDoctorId() {
            countDoctorID = 1;
        }


}
