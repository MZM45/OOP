/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentManagement;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class dbconnection {
    
   private static final String dbLoc ="jdbc:ucanaccess://studentinfo1.accdb";
   private  Connection Con;
   private PreparedStatement prepStatment;
   private ResultSet rSet;
    
    public dbconnection(){
     try{     
    Con =DriverManager.getConnection(dbLoc);
    System.out.println("Connection establish");
    }
   
    catch(Throwable e){
      System.out.println(e);
      System.out.println("Connection not establish");
    }
    }
    public ResultSet RunSelect(String  query){
    try{       
        prepStatment =Con.prepareStatement(query);
        rSet=prepStatment.executeQuery();
}
    catch(Throwable  e){
     System.out.println(e);

    }
    return rSet;
    }
    public int RunDM(String query) {
    try {
        prepStatment = Con.prepareStatement(query);
        int rowsAffected = prepStatment.executeUpdate();
        prepStatment.close();
        
        return rowsAffected;
    } catch (Throwable e) {
        System.out.println(e);
        return 0;
    }
}

    
      public void RunDML(String  query){
    try{   
        prepStatment =Con.prepareStatement(query);
        prepStatment.executeUpdate();
        prepStatment.close();
        
}
    catch(Throwable e){
     System.out.println(e);

    }
      
 
    }
      public void closeConnection() {
      try {
         if (Con != null && !Con.isClosed()) {
            Con.close();
            System.out.println("Connection closed.");
         }
      } catch (Throwable e) {
         System.out.println("Failed to close the database connection.");
         e.printStackTrace();
      }
   }
      public Connection getCon() {
        return Con;
    }
   
         public PreparedStatement prepareStatement(String query) throws Throwable {
      
           return Con.prepareStatement(query);
        
         
    }
}