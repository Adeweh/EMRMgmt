package EMR;

import java.util.ArrayList;

public class User {
    private int userId;
    private String name;
    private int age;

    private static int countUserId = 1;

    private ArrayList<HospitalRecords> hospitalRecords = new ArrayList<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.userId = countUserId;
        countUserId++;

    }

    public ArrayList<HospitalRecords> getHospitalRecords() {
        return hospitalRecords;
    }



    public void addRecords(String name, int testId, int userId, int doctorsId) {
        HospitalRecords records = new HospitalRecords(name, testId, userId, doctorsId);
        hospitalRecords.add(records);
    }

    public static void resetUserId() {
        countUserId = 1;
    }
}
