package WorkWithDatabases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector{

    private static final String DB_DRIVER="org.postgresql.Driver";
    private static final String DB_CONNECTION="jdbc:postgresql://s-msk-t-ver-db1:5432/testdb";
    private static final String DB_USER="trainee";
    private static final String DB_PASSWORD="123456";


    private static Connection getDBConnection(){
        Connection dbConnection=null;
        try{
            Class.forName(DB_DRIVER);
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            dbConnection=DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return dbConnection;
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }


    static void dropDbPersonTable() throws SQLException {

        Connection dbConnection=null;
        Statement statement=null;

        String dropTablePerson = "DROP TABLE PERSON_TEST";

        try{
            dbConnection=getDBConnection();
            statement=dbConnection.createStatement();

            //Удаляем таблицу PERSON_TEST
            statement.execute(dropTablePerson);
            System.out.println("Table \"PERSON_TEST\" is dropped!");
        } catch(SQLException e){
            System.out.println(e.getMessage());
        } finally{
            if(statement!=null){
                statement.close();
            }
            if(dbConnection!=null){
                dbConnection.close();
            }
        }

    }



    static void createDbPersonTable() throws SQLException{

        Connection dbConnection=null;
        Statement statement=null;

        String createTablePerson="CREATE TABLE PERSON_TEST("
                +"PERSON_CODE  VARCHAR(3) NOT NULL,"
                +"FIRST_NAME VARCHAR(15) NOT NULL, "
                +"LAST_NAME VARCHAR(20) NOT NULL, "
                +"HIREDATE DATE, "
                +"PRIMARY KEY (PERSON_CODE) "
                +")";



        try{
            dbConnection=getDBConnection();
            statement=dbConnection.createStatement();

            // создаем таблицу PERSON_TEST
            statement.execute(createTablePerson);
            System.out.println("Table \"PERSON_TEST\" is created!");
        } catch(SQLException e){
            System.out.println(e.getMessage());
        } finally{
            if(statement!=null){
                statement.close();
            }
            if(dbConnection!=null){
                dbConnection.close();
            }
        }
    }


}


