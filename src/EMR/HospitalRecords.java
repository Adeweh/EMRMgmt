package EMR;
import java.util.ArrayList;

public class HospitalRecords {
        private String name;

        private int testId;

        private int userId;

        private int doctorsId;




        public HospitalRecords(String name, int testId, int userId, int doctorsId) {
            this.name = name;
            this.testId = testId;
            this.userId = userId;
            this.doctorsId = doctorsId;
        }

        public String getName() {
            return name;
        }

        public int getTestId() {
            return testId;
        }

        public int getUserId() {
            return userId;
        }

        public int getDoctorsId() {
            return doctorsId;
        }





}
