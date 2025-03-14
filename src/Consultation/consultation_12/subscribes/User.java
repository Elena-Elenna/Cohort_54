package Consultation.consultation_12.subscribes;

public class User {
    public static int count = 0;

    private int userId;
    private String userName;

    public User(String userName) {
        this.userName = userName;
        userId = ++count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
