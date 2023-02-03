package com.enchere.appli.accesBase;



import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {

    public static Connection connect() throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection connect = DriverManager.getConnection("jdbc:postgresql://salt.db.elephantsql.com:5432/yhjyuiba", "yhjyuiba",
                "UJApuGnSVjUQmSkSr8gSkyshgw_FM87p");
        return connect;
    }
    
}