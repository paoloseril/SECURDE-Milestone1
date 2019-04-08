package Controller;


import Model.History;
import Model.Logs;
import Model.Product;
import Model.User;
import View.Frame;

import java.io.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;



public class Main {
    
    public SQLite sqlite;
    
    public static void main(String[] args) {
        new Main().init();
    }
    
    public void init(){

       /* try{
            PrintStream fileOut = new PrintStream("./out.txt");
            System.setOut(fileOut);
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
       */

        try(FileWriter fw = new FileWriter("logs.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println("---------START OF LOG---------");
            //more code

            // Initialize a driver object
            sqlite = new SQLite();

//        // Create a database
           // sqlite.createNewDatabase();
//
//        // Drop users table if needed
            //sqlite.dropHistoryTable();
            //sqlite.dropLogsTable();
            //sqlite.dropProductTable();
            //sqlite.dropUserTable();
//
//        // Create users table if not exist
            //sqlite.createHistoryTable();
            //sqlite.createLogsTable();
            //sqlite.createProductTable();
            //sqlite.createUserTable();
//
//        // Add sample history
            //sqlite.addHistory("admin", "Antivirus", 1, "2019-04-03 14:30:00.000");
            //sqlite.addHistory("manager", "Firewall", 1, "2019-04-03 14:30:01.000");
            //sqlite.addHistory("staff", "Scanner", 1, "2019-04-03 14:30:02.000");

//        // Add sample logs
            //sqlite.addLogs("NOTICE", "admin", "User creation successful", new Timestamp(new Date().getTime()).toString());
            //sqlite.addLogs("NOTICE", "manager", "User creation successful", new Timestamp(new Date().getTime()).toString());
            //sqlite.addLogs("NOTICE", "admin", "User creation successful", new Timestamp(new Date().getTime()).toString());
//
//        // Add sample product
//        sqlite.addProduct("Antivirus", 5, 500.0);
//        sqlite.addProduct("Firewall", 3, 1000.0);
//        sqlite.addProduct("Scanner", 10, 100.0);
//
//        // Add sample users
//        sqlite.addUser("admin", "qwerty1234" , 5);
//        sqlite.addUser("manager", "qwerty1234", 4);
//        sqlite.addUser("staff", "qwerty1234", 3);
//        sqlite.addUser("client1", "qwerty1234", 2);
//        sqlite.addUser("client2", "qwerty1234", 2);
//        
//        
            //sqlite.addUser("admin", "qwerty1234" , 5);
            //sqlite.addUser("manager", "qwerty1234", 4);
            //sqlite.addUser("staff", "qwerty1234", 3);
            //sqlite.addUser("client1", "qwerty1234", 2);
            //sqlite.addUser("client2", "qwerty1234", 2);
//
//
            // Initialize User Interface
            Frame frame = new Frame();
            frame.init(this);
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }





    }
    
}
