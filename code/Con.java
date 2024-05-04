package bank.management.system;

import java.sql.*;

public class Con {
    public Connection connection;
    public Statement statement;
    public Con(){

        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/banks","root","Honey@10");
            statement=connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        new Con();
    }
}
