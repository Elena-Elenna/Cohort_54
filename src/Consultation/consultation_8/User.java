package Consultation.consultation_8;

public class User {
    private int id;
    private String nickName;
    private String email;

    public User(int id, String nickName, String email) {
        this.id = id;
        this.nickName = nickName;
        this.email = email;
    }

//    User(String nickName, String email) {
//        this.nickName = nickName;
//        this.email = email;
//    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
