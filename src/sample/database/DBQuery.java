package sample.database;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sample.models.User;

public class DBQuery {
    public static User getUser(String email, String password) throws IOException, PropertyVetoException{
        Connection connection = null;
        PreparedStatement preState = null;
        ResultSet resultSet = null;
        User user = null;

        try {
            connection = DataSource.getInstance().getConnection();
            if(connection != null){
                preState = connection.prepareStatement("SELECT * FROM users WHERE email = ? and password = ?");
                preState.setString(1, email);
                preState.setString(2,password);

                resultSet = preState.executeQuery();

                if(resultSet.next()){
                    int resIdUser = resultSet.getInt("id_user");
                    String resEmail = resultSet.getString("email");
                    String resPassword = resultSet.getString("password");
                    user = new User(resIdUser, resEmail, resPassword);
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            if (resultSet != null)  try { resultSet.close(); } catch (SQLException e) {e.printStackTrace();}
            if (preState != null )  try { preState.close();  } catch (SQLException e) {e.printStackTrace();}
            if (connection != null) try { connection.close();} catch (SQLException e) {e.printStackTrace();}
        }
        return user;
    }

}
