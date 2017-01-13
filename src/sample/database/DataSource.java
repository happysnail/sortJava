package sample.database;

import javax.xml.crypto.Data;
import java.beans.ExceptionListener;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {

    private static DataSource datasource;
    //private BoneCP connectionPool;

    private DataSource() throws IOException, SQLException, PropertyVetoException{
        try{
            Class.forName("org.postgresql.Driver");
        }catch (Exception e){
            e.printStackTrace();
            return;
        }

    }

    public static DataSource getInstance() throws IOException, SQLException, PropertyVetoException{
        if(datasource == null){
            datasource = new DataSource();
            return datasource;
        }
        else return datasource;
    }

    public Connection getConnection() throws SQLException{
        return  this.getConnection();   // return this.connectionPool.getConnection();

    }
}
