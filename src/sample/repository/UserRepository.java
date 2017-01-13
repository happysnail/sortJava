package sample.repository;

import sample.models.User;
import sample.database.DBQuery;

import java.beans.PropertyVetoException;
import java.io.IOException;

public class UserRepository {

    public static User getUser(String email, String password) {
        try {
            return DBQuery.getUser(email, password);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return null;
    }
}
