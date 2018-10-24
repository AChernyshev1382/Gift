package WorkWithDatabases;


import java.io.IOException;
import java.sql.SQLException;


import static WorkWithDatabases.DBConnector.runSqlScript;
import static WorkWithDatabases.DBConnector.readSqlFile;
//import static WorkWithDatabases.DBConnector.createDbTable;
//import static WorkWithDatabases.DBConnector.dropDbTable;
//import static WorkWithDatabases.DBConnector.alterTable;


public class DataBase{
    public static void main(String[] args){

        try{
            readSqlFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        } catch(SQLException e){
            e.printStackTrace();
        }

        try{
            runSqlScript();
        }catch(SQLException|IOException e){
            System.out.println(e.getMessage());
        }
//
//        try{
//            dropDbTable();
//        }catch(SQLException e){
//            System.out.println(e.getMessage());
//        }

//        try{
//            createDbTable();
//        }catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//
//        try{
//            alterTable();
//        }catch(SQLException e){
//            System.out.println(e.getMessage());
//        }

    }


}
