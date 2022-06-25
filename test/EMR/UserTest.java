package EMR;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

        @BeforeEach
        void setUp() {
            user = new User("Dorcas", 26);
        }

        @AfterAll
        static void afterAll() {

            User.resetUserId();

        }

        @Test
        void  testToGetRecords(){
            user.addRecords("Dee", 1, 1, 1);
            String name = user.getHospitalRecords().get(0).getName();
            int testId = user.getHospitalRecords().get(0).getTestId();
            int userId = user.getHospitalRecords().get(0).getUserId();
            int doctorId = user.getHospitalRecords().get(0).getDoctorsId();

            assertEquals("Dee", name);
            assertEquals(1, testId);
            assertEquals(1, userId);
            assertEquals(1, doctorId);

            user.addRecords("Dee", 2, 2, 2);
            String name1 = user.getHospitalRecords().get(1).getName();
            int testId1 = user.getHospitalRecords().get(1).getTestId();
            int userId1 = user.getHospitalRecords().get(1).getUserId();
            int doctorId1 = user.getHospitalRecords().get(1).getDoctorsId();

            assertEquals("Dee", name1);
            assertEquals(2, testId1);
            assertEquals(2, userId1);
            assertEquals(2, doctorId1);

        }

}