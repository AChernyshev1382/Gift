package WorkWithDatabases;


import java.sql.SQLException;

import static WorkWithDatabases.DBConnector.createDbPersonTable;
import static WorkWithDatabases.DBConnector.dropDbPersonTable;


public class DataBase{
    public static void main(String[] args){


        try{
            dropDbPersonTable();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

        try{
            createDbPersonTable();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }


}
