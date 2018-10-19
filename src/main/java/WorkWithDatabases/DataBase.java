package WorkWithDatabases;


import java.sql.SQLException;

import static WorkWithDatabases.DBConnector.createDbUserTable;




public class DataBase{
    public static void main(String[] args){


        try{
            createDbUserTable();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }


}
