package org.o7planning.simplewebapp.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
  
public class OracleConnUtils {
  
   public static Connection getOracleConnection()
           throws ClassNotFoundException, SQLException {
        
       // Note: Change the connection parameters accordingly.
       String hostName = "ec2-34-229-85-85.compute-1.amazonaws.com";
       String sid = "tadevops1";
       String userName = "poams";
       String password = "poams";
       
       return getOracleConnection(hostName, sid, userName, password);
   }
  
   public static Connection getOracleConnection(String hostName, String sid,
           String userName, String password) throws ClassNotFoundException,
           SQLException {
   
       Class.forName("oracle.jdbc.driver.OracleDriver");
  
       // URL Connection for Oracle
       // Example: 
       // jdbc:oracle:thin:@localhost:1521:db11g
       // jdbc:oracle:thin:@//HOSTNAME:PORT/SERVICENAME
       String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;
       
      // System.out.println("connectionURL->"+connectionURL);
       Connection conn = DriverManager.getConnection(connectionURL, userName,
               password);
       //if (conn == null) {
         // System.out.println("################## ORacle connection is NULL #####################");
      // }
       //System.out.println("conn111111111->"+conn);
       return conn;
   }

}
