package Consultation.consultation_15bookStore.main.repository;

import consultation_15bookStore.main.model.User;
import consultation_15bookStore.main.utils.MyArrayList;
import consultation_15bookStore.main.utils.MyList;

public class UserRepository {

    private MyList<User> users;

    public UserRepository() {
        this.users = new MyArrayList<>();
    }

}
