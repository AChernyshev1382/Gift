package WorkWithDatabases;


import java.sql.SQLException;

import static WorkWithDatabases.DBConnector.createDbTable;
import static WorkWithDatabases.DBConnector.dropDbTable;
import static WorkWithDatabases.DBConnector.alterTable;


public class DataBase{
    public static void main(String[] args){


        try{
            dropDbTable();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

        try{
            createDbTable();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

        try{
            alterTable();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }


}
