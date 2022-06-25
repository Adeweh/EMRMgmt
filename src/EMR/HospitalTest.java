package EMR;

public class HospitalTest {
        private String name;
        private int testId;
        private String testType;

        public static int countTestID = 1;

        public HospitalTest(String name, String testType){
            this.name = name;
            this.testType = testType;
            this.testId = countTestID;
            countTestID++;

        }

        public String getName() {
            return name;
        }

        public int getTestId() {
            return testId;
        }

        public String getTestType() {
            return testType;
        }

        public static void resetTestId() {
            countTestID = 1;
        }


}
